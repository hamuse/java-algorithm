package homework02;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scn.next();
		System.out.println("키를입력하세요.");
		double textheight1 = scn.nextDouble();
		System.out.println("몸무게를 입력하세요.");
		double sweight = scn.nextDouble();
		double height1 = textheight1 / 100;
		double bmiN = sweight / (height1 * height1);
		String height = height1 + "cm";
		String weight = sweight + "kg";
		String sbmi = " ";
		int bmi = (int) Math.round(bmiN); // 반올림반 구글 검색했어요.
		if (bmiN > 30.0) {
			sbmi = "고도비만이다!!!!";
		} else if (bmiN > 25.0) {
			sbmi = "비만!!!!!";
		} else if (bmiN > 23.0) {
			sbmi = "과체중 !!!!!!";
		} else if (bmiN > 18.5) {
			sbmi = "정상^^";
		} else {
			sbmi = "저체중ㅠ.ㅠ";
		}
		System.out.printf("%s,%s,%s,%sbmi,%s", name, height, weight, bmi, sbmi);
	}

}
