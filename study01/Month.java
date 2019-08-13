package study01;

//import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Month {

	public static void main(String[] args) {
		//		String flag = "";
		//		String eval = "";
		//		switch(flag) {
		//		case "" : break;
		//		default : break;
		//		}
		//		System.out.println(eval);
		//		System.out.println("달을 입력하세요");
		//		Scanner scan = new Scanner(System.in);
		//int month = 1;
		//month = scan.nextInt();
		// int month 를 String 으로 변환
		//		String eval = "";
		//		switch(month) {
		//		case 1 : eval =  month+ "월입니다."  ; break;
		//		case 2 : eval =  month+ "월입니다."  ; break;
		//		case 3 : eval =  month+ "월입니다."  ; break;
		//		case 4 : eval =  month+ "월입니다."  ; break;
		//		case 5 : eval =  month+ "월입니다."  ; break;
		//		case 6 : eval =  month+ "월입니다."  ; break;
		//		case 7 : eval =  month+ "월입니다."  ; break;
		//		case 8 : eval =  month+ "월입니다."  ; break;
		//		case 9 : eval =  month+ "월입니다."  ; break;
		//		case 10 : eval =  month+ "월입니다."  ; break;
		//		case 11 : eval =  month+ "월입니다."  ; break;
		//		case 12 : eval =  month+ "월입니다."  ; break;
		//
		//		default : break;
		//		}
		//		System.out.println(eval);

		//String eval 을 int로 바꿔서 하는 방법 
		//		int eval = 0;
		//		switch(month) {
		//		case 1 : eval =  month ; break;
		//		case 2 : eval =  month  ; break;
		//		case 3 : eval =  month ; break;
		//		case 4 : eval =  month  ; break;
		//		case 5 : eval =  month  ; break;
		//		case 6 : eval =  month  ; break;
		//		case 7 : eval =  month  ; break;
		//		case 8 : eval =  month ; break;
		//		case 9 : eval =  month  ; break;
		//		case 10 : eval =  month  ; break;
		//		case 11 : eval =  month  ; break;
		//		case 12 : eval =  month  ; break;
		//
		//		default : break;
		//		}
		//		System.out.println(eval+"월 입니다.");

		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
		//가독성
//		String day = now.substring(6,7);
		int iday = Integer.parseInt( now.substring(6,7));
		System.out.println(iday);
//		int iday = Integer.parseInt(day);

		int month = 0;
		String eval = "";
		switch(iday) {
		//노테이션 미스메치로 에러 난다. 고쳐줘야한다. 
		
		case 1 : eval =  "iday" ; break;
		case 2 : eval =  "iday"  ; break;
		case 3 : eval =  "iday"; break;
		case 4 : eval = "iday"  ; break;
		case 5 : eval =  "iday"  ; break;
		case 6 : eval =  "iday" ; break;
		case 7 : eval =  "iday"; break;
		case 8 : eval =  "iday"  ; break;
		case 9 : eval =  "iday"  ; break;
		case 10 : eval = "i day"  ; break;
		case 11 : eval =  "iday"  ; break;
		case 12 : eval = "i day"  ; break;

		default : break;
		}
		System.out.println(eval+"월입니다.");
	}

}
