package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) { // 메인이고 메소드가 하나다. 절차지향 소스
		Scanner scn = new Scanner(System.in);
		Student student = new Student(); // 같은 패키지 안에 있어서 안가져와도 되고 선언만해줌
		String name = "";
		while (true) {
			int flag = 0;
			System.out.println("0.종료 1.BMI 2.이해못할문제");
			switch (scn.nextInt()) { // int flag = scn.nextInt(); 를 그냥 넣어버림
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("BMI: 이름, 키 , 몸무게 입력");
				 name = scn.next();
				double height = scn.nextDouble();
				double weight = scn.nextDouble();
				String result = student.getBmi(name, height, weight);
				System.out.println(result);
				break;
			case 2 : 
				//이름, 주소, 나이, 은행잔고 , 신용도 
				//결과가 뭘 넣든간에 1억 대출 
				System.out.println("이름, 주소,나이,은행잔고,신용도");
				name = scn.next();
				String addr = scn.next();
				int age = scn.nextInt();
				int don = scn.nextInt();
				String credit = scn.next();
				result = student.daechul(name, addr, age, don, credit);
				System.out.println(result); //리턴값은 무조건 싱글 벨류다 .
				
				break;

			}
		}

	}

}
