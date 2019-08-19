package homework02;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
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
