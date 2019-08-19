package study03;

import java.util.Scanner;

public class TimeCalcEx01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int flag = 0;
		while (true) {
			System.out.println("0.종료 1., 2. ,3. ,4. ");
			flag = scn.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			case 3:
				System.out.println("");
				break;
			case 4:
				System.out.println("");
				break;

			}
		}
	}

}
