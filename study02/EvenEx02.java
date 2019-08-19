package study02;

import java.util.Scanner;

public class EvenEx02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("시작값 입력 : ");
		int start = scn.nextInt();
		System.out.println("끝 값 입력 : ");
		int end = scn.nextInt();
		String sequence = "";
		int serise = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				int end2 = end;
				if (end % 2 != 0) {
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
			} else {
				// 홀수일때
			}
		}

		System.out.println(sequence + serise);
	}

}
