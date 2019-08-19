package homework02;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] subject = { "이름", "국어", "영어", "수학", "총점", "평균", "합격여부" };
		int[] score = new int[3];
		String result = "";

		System.out.println("이름을 입력하세요 .");
		subject[0] = scn.next();
		System.out.printf("%s 점수 입력", subject[1]);
		score[0] = scn.nextInt();
		System.out.printf("%s 점수 입력", subject[2]);
		score[1] = scn.nextInt();
		System.out.printf("%s 점수 입력", subject[3]);
		score[2] = scn.nextInt();

		subject[4] = String.valueOf(score[0] + score[1] + score[2]);
		int sum = Integer.parseInt(subject[4]);
		subject[5] = String.valueOf((int) Math.round(sum / score.length));

		if (sum / score.length >= 90) {
			result = "장학생";
		} else if (sum / score.length >= 70) {
			result = "합격";
		} else if (sum / score.length < 70) {
			result = "불합격";
		}
		subject[6] = result;
		System.out.printf("%s, %d점, %d점, %d점, 총점 %s점, 평균 %s점, %s", subject[0], score[0], score[1], score[2], subject[4],
				subject[5], subject[6]);

	}

}
