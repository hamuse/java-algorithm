package study03;

import java.util.Scanner;
import study03.Student;

public class Engine {
	// 메인에는 클라이언트가 보고 쓸수있어야한다.
	public static void main(String[] args) { // 절차지향
		Scanner scn = new Scanner(System.in); // 로컬변수인데 레퍼런스이다.
		Student student = new Student();
		int flag = 0; // 로컬변수인데 프리미티브
		String result = "";
		while (true) {
			System.out.println("메뉴: 0.종료 , 1.BMI, 2.Ranking, 3.howMuch, 4.ReportCard");
			flag = scn.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("BMI");
				System.out.println("이름을 입력하세요");//
				String name = scn.next();
				System.out.println("키를입력하세요.");//
				double textheight1 = scn.nextDouble();
				System.out.println("몸무게를 입력하세요.");//
				double swight = scn.nextDouble(); // 필요한 값을 입력받는곳
				result = student.getBmi(name, swight, textheight1); // 메소드 호출
				System.out.println(result); //출력
				break;
			case 2:
				System.out.println("Ranking");
				double[] record = new double[3];
				
				for (int i = 0; i < 3; i++) {
					System.out.printf("선수들의 스코어를 입력");
					record[i] = scn.nextDouble();
				}
				result =student.getRank(record);
				break;
			case 3:
				System.out.println("howMuch");
				student.howMuch();
				break;
			case 4:
				System.out.println("ReportCard");
				student.getReportCard();

			}
		}
	}

}
