package study03;

import java.util.Scanner;

public class Student {
	// 1.Bmi 2. ranking 3. HowMuch 4.ReportCard
	// 객체
//	Scanner scn = new Scanner(System.in);

	public String getBmi(String name, double swight, double textheight1) {
	
		double height1 = textheight1 / 100;
		double bmiN = swight / (height1 * height1);
		String height = height1 + "cm";
		String weight = swight + "kg";
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
		String result = String.format("%s %s", name, sbmi); //
		return "";

	}

	public String getRank(double[] record) {
	
		String[] player = { "A선수기록 ", "B선수기록 ", "C선수기록 " };
		String[] result = new String[3];
		if (record[0] < record[1] && record[0] < record[2]) {
			result[0] = "1등:" + player[0] + record[0];
			if (record[1] < record[2]) {
				result[1] = "2등:" + player[1] + record[1];
				result[2] = "3등:" + player[2] + record[2];
			} else {
				result[1] = "2등:" + player[2] + record[2];
				result[2] = "3등:" + player[1] + record[1];
			}
		} else if (record[1] < record[0] && record[1] < record[2]) {
			result[0] = "1등:" + player[1] + record[1];
			if (record[0] < record[2]) {
				result[1] = "2등:" + player[0] + record[0];
				result[2] = "3등:" + player[2] + record[2];
			} else {
				result[1] = "2등:" + player[2] + record[2];
				result[2] = "3등:" + player[0] + record[0];
			}
		} else {
			result[0] = "1등:" + player[2] + record[2];
			if (record[0] < record[1]) {
				result[1] = "2등:" + player[0] + record[0];
				result[2] = "3등:" + player[1] + record[1];
			} else {
				result[1] = "2등:" + player[1] + record[1];
				result[2] = "3등:" + player[0] + record[0];
			}
		}
		System.out.printf("%s\n%s\n%s", result[0], result[1], result[2]);
		return "등수를계산중.";

	}

	public void howMuch() {
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

	public void getReportCard() {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scn.next();
		System.out.println("국어점수를 입력하세요.");
		int kor = scn.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scn.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scn.nextInt();
		String evalu = "";
		int sum = kor + eng + math;
		double aveEx = (double) sum / 3;
		int ave = (int) Math.round(aveEx);
		if (ave >= 90) {
			evalu = "장학생";
			System.out.println(evalu);
		} else if (ave > 90) {
			evalu = "합격";
			System.out.println(evalu);
		} else if (ave > 70) {
			evalu = "불합격";
			System.out.println("evalu");
		} else {
			System.out.println("오류 다시입력해주세요.");
		}
		System.out.printf("이름: %s, 국어:%d점, 영어:%d점, 수학:%d점, 총점:%d점, 평균:%d점, %s", name, kor, eng, math, sum, ave, evalu);
	}

}
