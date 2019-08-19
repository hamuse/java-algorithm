package homework02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		int years = scn.nextInt();
		int leap = 0; // years % 4 ; //윤년
		int normal = 0; // years % 100; // 평년
		String leapYears = "";
		String normalYears = "";
		if (years % 4 == 0) {
			normal = years % 100;
			if (normal == 0) {
				if (years % 400 == 0) {
					leap = years;
					leapYears = leap + "윤년";
					System.out.println(leapYears);
				} else {
					normal = years;
					normalYears = normal + "평년";
					System.out.println(normalYears);
				}
			} else {
				leap = years;
				leapYears = leap + "윤년";
				System.out.println(leapYears);
			}
		} else {
			if (years % 400 == 0) {
				leap = years;
				leapYears = leap + "윤년";
				System.out.println(leapYears);
			} else {
				normal = years;
				normalYears = normal + "평년";
				System.out.println(normalYears);
			}
		}
	}

}
