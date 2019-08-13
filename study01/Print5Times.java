package study01;
import java.util.Scanner;
public class Print5Times {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
	
		while(true) {
			System.out.println("0. 종료 ,1.계산기 2. 달력");
			int flag = scn.nextInt();
			
			switch(flag){
			case 0: 
				System.out.println("시스템 종료");
				return;  //메소드 종료
			case 1:
				System.out.println("시스템 실행");
				break; //스테이먼트 종료
			}
			System.out.println("안녕");
			
		}

	}
	

}
