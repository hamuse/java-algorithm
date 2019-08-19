package homework03;

import java.util.Scanner;

public class Student { // 12개 메소드 만들어서 Engine 에 나오게 하기

	public String getTimeCalc(int time) {

		int hour = 0;
		int min = 0;
		int sec = 0;
		int minE = 0;
		if (time / 3600 > 24) {
			String resurt = "하루가 지났습니다.";
			return resurt;
		}
		hour = time / 3600;
		minE = time % 3600;
		min = minE / 60;
		sec = time % 60;
		String a = String.valueOf(hour);
		String b = String.valueOf(min);
		String c = String.valueOf(sec);
		String resurt = a + "시" + b + "분" + c + "초";
		return resurt;
	}

	public String getAC(int fNum, String an, int sNum) {

		int sum = fNum + sNum;
		int ma = fNum - sNum;
		int gob = fNum * sNum;
		int na1 = fNum / sNum;
		int na2 = fNum % sNum;
		String resurt = "";
		switch (an) {
		case "+":
			resurt = "답:" + sum;
			break;
		case "-":
			resurt = "답:" + ma;
			break;
		case "*":
			resurt = "답:" + gob;
			break;
		case "/":
			resurt = "답:" + na1 + "[" + na2 + "]";
			break;
		default:
			resurt = "입력값 오류";
			break;
		}
		return resurt;
	}
	
	public String getBmi(String name,double textheight1,double sweight) {
		
		double height1 = textheight1 / 100;
		double bmiN = sweight / (height1 * height1);
		String height = height1 + "cm";
		String weight = sweight + "kg";
		String sbmi = " ";
		  String resurt = "";
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
	    resurt = name+height+weight+sbmi;
	    return resurt;
		}
	public String getHowMuchOne(int pirce) {
	
     String resurt1 = pirce + "원입니다.";
     return resurt1;
	}
	public String getHowMuchTwo(int number, int price) {
		
		int total = price * number;
	String	resurt2 =String.format("총 금액은 %d원 입니다.\n", total);
	return resurt2;
		
	}
	public String getHowMuchThree(int total) {
		
		int dc = total / 10;
		int totalPrice = total - dc;
		String	resurt3 =String.format("그럼 %d원만 주세요.", totalPrice);
		return resurt3;
	}
	public String getLeapYear(int years) {
		
		int leap = 0; // years % 4 ; //윤년
		int normal = 0; // years % 100; // 평년
		String resurt = "";
		String normalYears = "";
		if (years % 4 == 0) {
			normal = years % 100;
			if (normal == 0) {
				if (years % 400 == 0) {
					leap = years;
					resurt = leap + "윤년";
				} else {
					normal = years;
					normalYears = normal + "평년";
					resurt =normalYears;
				}
			} else {
				leap = years;
				resurt = leap + "윤년";
			}
		} else {
			if (years % 400 == 0) {
				leap = years;
				resurt = leap + "윤년";
			} else {
				normal = years;
				normalYears = normal + "평년";
				resurt = normalYears;
			}
		}
		return resurt;
	}
	public String getReportCard(String name,int kor,int eng,int math) {
	
		String evalu = "";
		int sum = kor + eng + math;
		double aveEx = (double) sum / 3;
		int ave = (int) Math.round(aveEx);
		 String resurt = "";
		if (ave >= 90) {
			evalu = "장학생";
		} else if (ave > 90) {
			evalu = "합격";
		} else if (ave > 70) {
			evalu = "불합격";
		} else {
		 resurt = "오류 다시입력해주세요.";
		}
		resurt=String.format("이름: %s, 국어:%d점, 영어:%d점, 수학:%d점, 총점:%d점, 평균:%d점, %s", name, kor, eng, math, sum, ave, evalu);
		return resurt;
	}
	public String getTax(String name,int income) {
		
		double rate = 9.7;
		double taxrate = rate * 0.01;
		double tax1 = (income * 10000) * taxrate;
		int tax = (int) Math.round(tax1);
		String resurt = String.format("연봉%d만원 받으시는 %s님께서 납부할 세금은 %d원입니다.", income, name, tax);
		return resurt;
	}
	public void getPassOrFail() {

	}
	public String getMonthEndDay( int month) {
	       String resurt = "";
	        int dayEnd = 0;
	        switch (month) {
	        case 2:
	           dayEnd = 29;
	           resurt = String.format("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	           dayEnd = 31;
	           resurt = String.format("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        default:
	           dayEnd = 30;
	           resurt = String.format("%d월은 %d일 까지입니다.", month, dayEnd);
	           break;
	        }
	        return resurt;
	}
	public String getJoin(String[] join,String[] joinInput) {
	     
	      String resurt="";
	        for (int i = 0; i < joinInput.length; i++) {
	        	resurt = String.format("%s %s \n", join[i], joinInput[i]);
	        }
	        return resurt;
	}
	public void getRanking() {
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
	public void getScoreCalc() {
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
