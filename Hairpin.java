package asdf;

public class Hairpin {
	public static boolean hairpin(String RNA) {
		boolean hp = false;
		for (int x = 0; x < RNA.length() - 2; x++) {
			for (int hpL = 2; hpL < RNA.length() / 2 - 1; hpL++) {
				for (int loopL = 2; loopL < 10 && loopL < RNA.length() - x - 2 * hpL; loopL++) {
					if (RNA.length() - 2 * hpL > x && Comp(RNA.substring(x, x + hpL))
							.equals(RNA.substring(x + hpL + loopL, x + 2 * hpL + loopL))) {
						System.out.println(RNA.substring(x, x + hpL) + "[" + RNA.substring(x + hpL, x + hpL + loopL)
								+ "]" + RNA.substring(x + hpL + loopL, x + 2 * hpL + loopL));
						hp = true;
					}
				}
			}
		}
		return hp;
	}

	public static String Comp(String DNA) {
		String Comp = "";
		String repl = DNA.replace('T', 'a').replace('A', 't').replace('G', 'c').replace('C', 'g').toUpperCase();
		for (int a = 1; a <= DNA.length(); a++)
			Comp = repl.substring(a - 1, a) + Comp;
		return Comp;
	}
}
