package homework02;

import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("얼마예요? ");
		int price = scn.nextInt();
		System.out.println(price + "원입니다.");
		System.out.println("몇개드릴까요?");
		int number = scn.nextInt();
		System.out.println(number + "개 주세요.");
		int total = price * number;
		System.out.printf("총 금액은 %d원 입니다.\n", total);
		System.out.println("비싸요 10%깍아주세요.");
		int dc = total / 10;
		int totalPrice = total - dc;
		System.out.printf("그럼 %d원만 주세요.", totalPrice);
	}

}
