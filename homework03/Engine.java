package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			System.out.println(
					"0.종료, 1.TimeCalc,2.ArithmeticCalculator,3.BMI,4.HowMuch,5.LeapYear,6.ReportCard,7.Tax,8.PassOrFail,9.MonthEndDay,10.Join,11.Ranking,12.ScoreCalc");
			switch (scn.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("1.TimeCalc");
				System.out.println("초를 입력하세요.");
				int time = scn.nextInt();	
				String resurt = student.getTimeCalc(time);
				System.out.println(resurt);
				break;
			case 2:
				System.out.println("2.ArithmeticCalculator");
				System.out.println("첫수를 입력해주세요.");
				int fNum = scn.nextInt();
				System.out.println("연산자를 입력해주세요.");
				String an = scn.next();
				System.out.println("두번째 수를 입력해주세요.");
				int sNum = scn.nextInt();
				resurt = student.getAC(fNum, an, sNum);
				System.out.println(resurt);
				break;
			case 3:
				System.out.println("3.BMI");
				System.out.println("이름을 입력하세요");
				String name = scn.next();
				System.out.println("키를입력하세요.");
				double textheight1 = scn.nextDouble();
				System.out.println("몸무게를 입력하세요.");
				double sweight = scn.nextDouble();
				resurt = student.getBmi(name,textheight1,sweight);
				System.out.println(resurt);
				break;
			case 4:
				//메소드 3개 만들어서 해야한다. 
				break;
			case 5:
				System.out.println("LeapYear");
				System.out.println("연도를 입력해주세요.");
				int years = scn.nextInt();
				resurt = student.getLeapYear(years);
				System.out.println(resurt);
				break;
			case 6:
				System.out.println("6.ReportCard");
				System.out.println("이름을 입력하세요.");
				 name = scn.next();
				System.out.println("국어점수를 입력하세요.");
				int kor = scn.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = scn.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = scn.nextInt();
				resurt = student.getReportCard(name, kor, eng, math);
				System.out.println(resurt);
				break;
			case 7:
				System.out.println("7.Tax");
				System.out.println("이름을 입력해주세요.");
				name = scn.next();
				System.out.println("연봉을 입력해주세요 .'0'4개 생략.");
				int income = scn.nextInt();
				resurt = student.getTax(name, income);
				System.out.println(resurt);
				break;
				
			case 8:
				System.out.println("PassOrFail");
			
				break;
			case 9:
				System.out.println("MonthEndDay");
				 System.out.println("월을 입력해주세요 .");
			        int month = scn.nextInt();
			        resurt = student.getMonthEndDay(month);
			        
				break;
			case 10:
				System.out.println("Join");
				   String[] join = { "아이디: ", "비밀번호: ", "이름: ", "생년월일 예)1990-05-05: ", "성인여부(성인true , 미성년 false): ",
			               "키 입력(소수점 첫째자리까지): ", "몸무게 입력 (소수점 첫째자리까지): ", "혈액형: " };
			        String[] joinInput = new String[join.length]; //배열 갯수 join만큼 만들기 위해서 
			        System.out.println("회원가입");
			        for (int i = 0; i < join.length; i++) {
			            System.out.printf("%s입력하세요.\n", join[i]);
			           joinInput[i] = scn.next();
			        }
			     //   resurt = student.getJoin(join[8], joinInput[ join.length]);
			   //     System.out.println(resurt);
			        
				break;
				
			case 11:
				System.out.println("Ranking");
				
				break;
			case 12:
				System.out.println("ScoreCalc");
				
				break;

			}

		}
	}


	}


