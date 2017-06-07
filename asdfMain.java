package asdf;

import java.util.ArrayList;
import java.util.Scanner;

public class asdfMain {
	public static void main(String args[]) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		ArrayList<String> seqs = new ArrayList<String>();
		String next = in.next();
		int L = next.substring(0, next.length() - 1).length();
		while (!next.equals("done")) {
			seqs.add(next.substring(0, L));
			String n = in.next();
			next = n.substring(0, n.length() - 1);

		}
		for (String x : seqs)
			System.out.print(x + " ");
		ArrayList<String> finalSeq = new ArrayList<String>();
		for (int x = 0; x < L; x++)
			finalSeq.add(seqs.get(0).substring(x, x + 1));
		seqs.remove(0);
		System.out.println();
		boolean complete = false;
		while (!complete) {
			complete = true;
			for (int x = seqs.size() - 1; x >= 0; x--) {
				if ((finalSeq.get(finalSeq.size() - 15) + finalSeq.get(finalSeq.size() - 14)
						+ finalSeq.get(finalSeq.size() - 13) + finalSeq.get(finalSeq.size() - 12)
						+ finalSeq.get(finalSeq.size() - 11) + finalSeq.get(finalSeq.size() - 10)
						+ finalSeq.get(finalSeq.size() - 9) + finalSeq.get(finalSeq.size() - 8)
						+ finalSeq.get(finalSeq.size() - 7) + finalSeq.get(finalSeq.size() - 6)
						+ finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x)))
					seqs.remove(x);
				else if ((finalSeq.get(finalSeq.size() - 14) + finalSeq.get(finalSeq.size() - 13)
						+ finalSeq.get(finalSeq.size() - 12) + finalSeq.get(finalSeq.size() - 11)
						+ finalSeq.get(finalSeq.size() - 10) + finalSeq.get(finalSeq.size() - 9)
						+ finalSeq.get(finalSeq.size() - 8) + finalSeq.get(finalSeq.size() - 7)
						+ finalSeq.get(finalSeq.size() - 6) + finalSeq.get(finalSeq.size() - 5)
						+ finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 14))) {
					for (int y = 14; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 13) + finalSeq.get(finalSeq.size() - 12)
						+ finalSeq.get(finalSeq.size() - 11) + finalSeq.get(finalSeq.size() - 10)
						+ finalSeq.get(finalSeq.size() - 9) + finalSeq.get(finalSeq.size() - 8)
						+ finalSeq.get(finalSeq.size() - 7) + finalSeq.get(finalSeq.size() - 6)
						+ finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 13))) {
					for (int y = 13; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 12) + finalSeq.get(finalSeq.size() - 11)
						+ finalSeq.get(finalSeq.size() - 10) + finalSeq.get(finalSeq.size() - 9)
						+ finalSeq.get(finalSeq.size() - 8) + finalSeq.get(finalSeq.size() - 7)
						+ finalSeq.get(finalSeq.size() - 6) + finalSeq.get(finalSeq.size() - 5)
						+ finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 12))) {
					for (int y = 12; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 11) + finalSeq.get(finalSeq.size() - 10)
						+ finalSeq.get(finalSeq.size() - 9) + finalSeq.get(finalSeq.size() - 8)
						+ finalSeq.get(finalSeq.size() - 7) + finalSeq.get(finalSeq.size() - 6)
						+ finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 11))) {
					for (int y = 11; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 10) + finalSeq.get(finalSeq.size() - 9)
						+ finalSeq.get(finalSeq.size() - 8) + finalSeq.get(finalSeq.size() - 7)
						+ finalSeq.get(finalSeq.size() - 6) + finalSeq.get(finalSeq.size() - 5)
						+ finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 10))) {
					for (int y = 10; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 9) + finalSeq.get(finalSeq.size() - 8)
						+ finalSeq.get(finalSeq.size() - 7) + finalSeq.get(finalSeq.size() - 6)
						+ finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 9))) {
					for (int y = 9; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 8) + finalSeq.get(finalSeq.size() - 7)
						+ finalSeq.get(finalSeq.size() - 6) + finalSeq.get(finalSeq.size() - 5)
						+ finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 8))) {
					for (int y = 8; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 7) + finalSeq.get(finalSeq.size() - 6)
						+ finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 7))) {
					for (int y = 7; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 6) + finalSeq.get(finalSeq.size() - 5)
						+ finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 6))) {
					for (int y = 6; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 5) + finalSeq.get(finalSeq.size() - 4)
						+ finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 5))) {
					for (int y = 5; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 4) + finalSeq.get(finalSeq.size() - 3)
						+ finalSeq.get(finalSeq.size() - 2) + finalSeq.get(finalSeq.size() - 1))
								.equals(seqs.get(x).substring(0, 4))) {
					for (int y = 4; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(finalSeq.size() - 3) + finalSeq.get(finalSeq.size() - 2)
						+ finalSeq.get(finalSeq.size() - 1)).equals(seqs.get(x).substring(0, 3))) {
					for (int y = 3; y < L; y++) {
						finalSeq.add(seqs.get(x).substring(y, y + 1));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if (finalSeqtoString(finalSeq).contains(seqs.get(x)))
					seqs.remove(x);
			}
		}
		//
		//
		//
		// LINE BREAK
		// FOR EASIER READING
		//
		//
		//
		//
		complete = false;
		while (!complete) {
			complete = true;
			for (int x = seqs.size() - 1; x >= 0; x--) {
				if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9)
						+ finalSeq.get(10) + finalSeq.get(11) + finalSeq.get(12) + finalSeq.get(13) + finalSeq.get(14))
								.equals(seqs.get(x)))
					seqs.remove(x);
				else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9)
						+ finalSeq.get(10) + finalSeq.get(11) + finalSeq.get(12) + finalSeq.get(13))
								.equals(seqs.get(x).substring(L - 14, L))) {
					for (int y = L - 14; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9)
						+ finalSeq.get(10) + finalSeq.get(11) + finalSeq.get(12))
								.equals(seqs.get(x).substring(L - 13, L))) {
					for (int y = L - 13; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9)
						+ finalSeq.get(10) + finalSeq.get(11)).equals(seqs.get(x).substring(L - 12, L))) {
					for (int y = L - 12; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9)
						+ finalSeq.get(10)).equals(seqs.get(x).substring(L - 11, L))) {
					for (int y = L - 11; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8) + finalSeq.get(9))
								.equals(seqs.get(x).substring(L - 10, L))) {
					for (int y = L - 10; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7) + finalSeq.get(8))
								.equals(seqs.get(x).substring(L - 9, L))) {
					for (int y = L - 9; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6) + finalSeq.get(7))
								.equals(seqs.get(x).substring(L - 8, L))) {
					for (int y = L - 8; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5) + finalSeq.get(6)).equals(seqs.get(x).substring(L - 7, L))) {
					for (int y = L - 7; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4)
						+ finalSeq.get(5)).equals(seqs.get(x).substring(L - 6, L))) {
					for (int y = L - 6; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3) + finalSeq.get(4))
						.equals(seqs.get(x).substring(L - 5, L))) {
					for (int y = L - 5; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2) + finalSeq.get(3))
						.equals(seqs.get(x).substring(L - 4, L))) {
					for (int y = L - 4; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if ((finalSeq.get(0) + finalSeq.get(1) + finalSeq.get(2))
						.equals(seqs.get(x).substring(L - 3, L))) {
					for (int y = L - 3; y > 0; y--) {
						finalSeq.add(0, seqs.get(x).substring(y - 1, y));
					}
					seqs.remove(x);
					complete = false;
					break;
				} else if (finalSeqtoString(finalSeq).contains(seqs.get(x)))
					seqs.remove(x);
			}
		}
		System.out.println(finalSeqtoString(finalSeq));
	}

	public static String finalSeqtoString(ArrayList<String> finalSeq) {
		String seq = "";
		for (String x : finalSeq)
			seq += x;
		return seq;
	}
}
