package homework01;
import java.util.Random;
import java.util.Scanner;
public class GameEx {

	public static void main(String[] args) {
		/**
		 * 가위바위보에서 Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다. 컴퓨터가 만든 값이 1이면 가위를 낸 것이고 2이면 바위를 낸
		 * 것이고 3이면 보를 낸 것으로 할 때, 사용자측이 가위, 바위, 보를 냈을 때 승패를 결정하는 프로그램을 작성하시오
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num = ran.nextInt(3)+1;
		//		System.out.println(num);

		System.out.println("가위 바위 보를 입력하세요.");
		String user = scan.next();
		System.out.println(user);
		switch(num) {
			case 1 : System.out.println("컴퓨터:가위"); 
				switch(user) {
					case "가위" : System.out.println("비겼습니다.");break;
					case "바위" : System.out.println("이겼습니다");break;
					case "보" : System.out.println("졌습니다");break;
						
		}
			case 2 : System.out.println("컴퓨터:바위"); 
				switch(user) {
					case "가위" : System.out.println("졌습니다..");break;
					case "바위" : System.out.println("비겼습니다.");break;
					case "보" : System.out.println("이겼습니다.");break;
		}
			case 3: System.out.println("컴퓨터:보"); 
				switch(user) {
					case "가위" : System.out.println("이겼습니다...");break;
					case "바위" : System.out.println("졌습니다.");break;
					case "보" : System.out.println("비겼습니다.");
						break;
		}
		break;
		}


	}

}
