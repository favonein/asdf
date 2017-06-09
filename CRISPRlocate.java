package asdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CRISPRlocate {
	public static String locator(File file, int L) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder Seq = new StringBuilder();
		int x = br.read();
		System.out.println(Character.toString((char) x));
		while (x != -1) {
			Seq.append(Character.toString((char) x));
			String next = br.readLine();
			Seq.append(next);
			x = br.read();
			System.out.println(next);
			System.out.println(Character.toString((char) x));
		}
		br.close();
		for (long k = 0; k <= Long.MAX_VALUE; k++) {
			Long longl = new Long(k);
			if (longl.intValue() > 0)
				if (isPalindrome("lol")) {

				}
		}
		return "";
	}

	public static boolean isPalindrome(String x) {
		String Comp = "";
		String repl = x.replace('T', 'a').replace('A', 't').replace('G', 'c').replace('C', 'g').toUpperCase();
		for (int a = 1; a <= x.length(); a++)
			Comp = repl.substring(a - 1, a) + Comp;
		if (Comp.equals(x))
			return true;
		return false;
	}
}
