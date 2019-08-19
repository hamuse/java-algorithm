package homework02;

import java.util.Scanner;

public class ScoreCalc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	       int count = 1; // 배열의 크기 1부터 시작
	       int[] ans = new int[count];
	       int sum = 0;
	       int ave = 0;
	       String shape = "";
	       String numbersText = "";
	       while (true) {
	          int[] array = new int[count]; // 임의로 배열수 저장
	          for (int i = 0; i < count - 1; i++) {
	             array[i] = ans[i];
	          }
	          System.out.println("더할수를 입력해주세요. 종료 -1");
	          int scnNum = scn.nextInt();
	          if (scnNum == -1) {
	             shape = "=";
	             System.out.println("종료");
	             break;
	          }
	          array[count - 1] = scnNum;
	          ans = array;
	          sum += array[count - 1];
	          ave = sum / count;
	          count++;
	       }
	       for (int i = 0; i < count - 1; i++) {
	          numbersText += i < count - 2 ? ans[i] + " + " : ans[i];
	       }
	       System.out.printf("%s%s\n총점: %d\n평균: %d", numbersText, shape, sum, ave);
	}

}
