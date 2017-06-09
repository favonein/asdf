package asdf;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class maain {
	public static void main(String args[]) throws IOException, URISyntaxException {
		// doesn't work if there are repeats like ACTGGGTCAGTACTGGACGGCATGA
		Scanner in = new Scanner(System.in);
		String product = "";
		String next2 = "";
		switch (in.nextInt()) {
		case 1: {
			ArrayList<String> seqs = new ArrayList<String>();
			String next = in.next();
			int L = next.length() - 1;
			// Put in as many sequence segments as you'd like of length 15, must
			// edit if you want to do different lengths
			// type done when finished putting in sequences
			while (!next.equals("don")) {
				seqs.add(next.substring(0, L));
				String n = in.next();
				next = n.substring(0, n.length() - 1);
			}
			System.out.println(asdfMain.Assembler(seqs, L));
			break;
		}
		// creates ramdon segments based on a line of protein, and assembles it
		case 2: {
			next2 = in.next();
			product = asdfMain.Assembler(SampleRandomizer.randomizer(next2), 15);
			System.out.println(product);
			System.out.println("Is Equal");
			System.out.println(next2.equals(product));
			System.out.println("Contains");
			System.out.println(product.contains(next2));
			break;
		}
		case 3: { // incomplete//
			System.out.println(CRISPRlocate.locator(new File("ecoli.in"), 29));
			break;
		}
		case 4: {
			String DNA = in.next();
			System.out.println(DNA);
			System.out.println(GCcount.count(DNA));
			break;
		}
		case 5: {
			String RNA = in.next();
			System.out.println(RNA);
			System.out.println(Hairpin.hairpin(RNA));
		}
		}
	}
}
