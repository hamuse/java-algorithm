package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] player = { "A선수기록 ", "B선수기록 ", "C선수기록 " };
		double[] record = new double[3];
		String[] result = new String[3];
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s 등록\n", player[i]);
			record[i] = scn.nextDouble();
		}
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
	}

}
