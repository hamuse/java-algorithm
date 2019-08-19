package study02;

import java.util.Scanner;

public class EvenEx1 {

	public static void main(String[] args) {
		// 1+3+5+7+9 =
				// i % 2 = 0이면 짝수 1 이면 홀수
				Scanner scn = new Scanner(System.in);
				String sequence = "";
				int serise = 0;
				System.out.println("===============================");
				System.out.println("입력된 시작값에서 부터 마지막 값까지 홀수의 합");
				System.out.println("===============================");
				System.out.println("시작값: ");
				int start = scn.nextInt();
				System.out.println("끝 값: ");
				int end = scn.nextInt();

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
					}
				}
				System.out.println(sequence + serise);
			}
}
