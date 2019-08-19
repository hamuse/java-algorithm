package homework02;

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args) {
		/**
		 * 초단위로 알려주는 시험이 있는데
		 * 
		 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요. 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요? 그러니까
		 * 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = scn.nextInt();
		int hour = 0;
		int min = 0;
		int sec = 0;
		int minE = 0;
		if (time / 3600 > 24) {
			System.out.println("하루가 지났습니다.");
			return;
		}
		hour = time / 3600;
		minE = time % 3600;
		min = minE / 60;
		sec = time % 60;
		System.out.printf("%d시%d,%d초", hour, min, sec);
	}
}
