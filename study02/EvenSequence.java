package study02;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println();
		System.out.println("시작수를 입력해 주세요.");
		int start = scn.nextInt();
		System.out.println("끝 수를 입력해 주세요");
		int end = scn.nextInt();

		int serise = 0;
		String sequence = "";
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				int end2 = end;
				if (end2 % 2 == 0) {
					end2 = end - 1;
				} else {
					end2 = end;
				}
				if (i != end2) {
					sequence += i + "+";
				} else {
					sequence += i + "=";

				}
				serise += i;
			}

		}
		System.out.println(sequence + serise);

	}

}
