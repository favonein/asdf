package asdf;

import java.util.ArrayList;

public class SampleRandomizer {
	public static ArrayList<String> randomizer(String Strand) {
		ArrayList<String> random = new ArrayList<String>();
		int L = Strand.length();
		for (int x = 0; x < L * 3 / 4; x++) {
			int pos = (int) (Math.random() * (L - 14));
			random.add(Strand.substring(pos, pos + 15));
		}
		System.out.println(random);
		return random;
	}
}
