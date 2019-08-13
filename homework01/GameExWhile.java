package homework01;
import java.util.Random;
import java.util.Scanner;
public class GameExWhile {

	public static void main(String[] args) {
     while(true) {
    	 
    	 Scanner scan = new Scanner(System.in);
 		Random ran = new Random();
 		int num = ran.nextInt(3)+1;

 		System.out.println("가위 바위 보를 입력하세요.");
 		String user = scan.next();
 		System.out.println(user);
 		switch(num) {
 			case 1 : System.out.println("컴퓨터:가위"); 
 				switch(user) {
 					case "가위" : System.out.println("비겼습니다.");break;
 					case "바위" : System.out.println("이겼습니다");break;
 					case "보" : System.out.println("졌습니다");break;
 					
 		}break;
 			case 2 : System.out.println("컴퓨터:바위"); 
 				switch(user) {
 					case "가위" : System.out.println("졌습니다..");break;
 					case "바위" : System.out.println("비겼습니다.");break;
 					case "보" : System.out.println("이겼습니다.");break;
 		}break;
 			case 3: System.out.println("컴퓨터:보"); 
 				switch(user) {
 					case "가위" : System.out.println("이겼습니다...");break;
 					case "바위" : System.out.println("졌습니다.");break;
 					case "보" : System.out.println("비겼습니다.");
 						break;
 		}break;
 			default : return;
 		}
 		System.out.println(num);
 		
      System.out.println("다시시작");
     }
	}

}
