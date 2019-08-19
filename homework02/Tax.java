package homework02;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scn.next();
		System.out.println("연봉을 입력해주세요 .'0'4개 생략.");
		int income = scn.nextInt();
		double rate = 9.7;
		double taxrate = rate * 0.01;
		double tax1 = (income * 10000) * taxrate;
		int tax = (int) Math.round(tax1);
		System.out.printf("연봉%d만원 받으시는 %s님께서 납부할 세금은 %d원입니다.", income, name, tax);
	}

}
