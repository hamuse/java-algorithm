package homework02;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        System.out.println("월을 입력해주세요 .");
	        int month = scn.nextInt();
	        int dayEnd = 0;
	        switch (month) {
	        case 2:
	           dayEnd = 29;
	           System.out.printf("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	           dayEnd = 31;
	           System.out.printf("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        default:
	           dayEnd = 30;
	           System.out.printf("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        }
	}

}
