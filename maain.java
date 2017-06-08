package asdf;

import java.util.ArrayList;
import java.util.Scanner;

public class maain {
	public static void main(String args[]) {
		// doesn't work if there are repeats like ACTGGGTCAGTACTGGACGGCATGA
		Scanner in = new Scanner(System.in);
		String product = "";
		String next2 = "";
		switch (in.nextInt()) {
		case 1: {
			ArrayList<String> seqs = new ArrayList<String>();
			String next = in.next();
			int L = next.substring(0, next.length() - 1).length();
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
			break;
		}
		}
		System.out.println("Is Equal");
		System.out.println(next2.equals(product));
		System.out.println("Contains");
		System.out.println(product.contains(next2));
	}
}
