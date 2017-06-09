package asdf;

public class GCcount {
	public static double count(String DNA) {
		int gc = 0;
		for (int x = 0; x < DNA.length(); x++)
			if (DNA.substring(x, x + 1).equals("G") || DNA.substring(x, x + 1).equals("C"))
				gc++;
		return ((double) gc) / ((double) DNA.length());
	}
}
