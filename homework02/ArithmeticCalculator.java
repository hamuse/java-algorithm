package homework02;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫수를 입력해주세요.");
		int fNum = scn.nextInt();
		System.out.println("연산자를 입력해주세요.");
		String an = scn.next();
		System.out.println("두번째 수를 입력해주세요.");
		int sNum = scn.nextInt();
		int sum = fNum + sNum;
		int ma = fNum - sNum;
		int gob = fNum * sNum;
		int na1 = fNum / sNum;
		int na2 = fNum % sNum;
		switch (an) {
		case "+":
			System.out.println("답:" + sum);
			break;
		case "-":
			System.out.println("답:" + ma);
			break;
		case "*":
			System.out.println("답:" + gob);
			break;
		case "/":
			System.out.printf("답:%d,[%d]", na1, na2);
			break;
		default:
			System.out.println("입력값 오류");
			return;
		}
	}

}
