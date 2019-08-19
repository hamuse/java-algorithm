package study02;

import java.io.InputStream;
import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
//국어 영어 수학점수를 입력받아서 합격 불합격을 매겨라.
		// 여러개가 나오면 배열이라 생각하면된다.
		Scanner scn = new Scanner(System.in);
		String[] subjects = { "국어", "영어", "수학", "과학", "사회" };
		int[] scores = new int[5];
//for(int i = 0 ; i <5 ; i++) {
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s 점수를 입력하세요.\n", subjects[i]);
			scores[i] = scn.nextInt();
		}
		for (int i = 0 ; i < scores.length; i++) {
			System.out.printf("%s점수 %d \n", scores[i],subjects[i]);
		}
		/*
		 * int[] scores = { kor, eng, math, science, society };
		 * 
		 * System.out.printf("%s점수 %d\n", subjects[0], scores[0]);
		 * System.out.printf("%s점수 %d\n", subjects[1], scores[1]);
		 * System.out.printf("%s점수 %d\n", subjects[2], scores[2]);
		 * System.out.printf("%s점수 %d\n", subjects[3], scores[3]);
		 * System.out.printf("%s점수 %d\n", subjects[4], scores[4]);
		 */
	}

}
