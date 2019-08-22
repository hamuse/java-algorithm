package homework02;

import java.util.Scanner;

public class RanKing01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A선수 기록:");
		double playerA = scanner.nextDouble();
		System.out.println("B선수 기록");
		double playerB = scanner.nextDouble();
		System.out.println("C선수 기록");
		double playerC = scanner.nextDouble();
		String result = "";
		
		if(playerA < playerB && playerA < playerC) {
		   if(playerB < playerC) {
			   result = String.format("1등 A선수 : %.1f \n"
			   		+ "2등 B선수 : %.1f \n"
			   		+ "3등 C선수 : %.1f", playerA,playerB,playerC);
					   
		   }else {
			   result = String.format("1등 A선수 : %.0f \n"
				   		+ "2등 C선수 : %.1f \n"
				   		+ "3등 B선수 : %.1f", playerA,playerC,playerB);
		   }
		}else if(playerB < playerA && playerB < playerC) {
			if(playerA<playerC) {
				result = String.format("1등 B선수 : %.1f \n"
				   		+ "2등 A선수 : %.1f \n"
				   		+ "3등 C선수 : %.1f", playerB,playerA,playerC);
			}else {
				result = String.format("1등 B선수 : %.1f \n"
				   		+ "2등 C선수 : %.1f \n"
				   		+ "3등 A선수 : %.1f", playerB,playerC,playerA);
			}
			
		}else {
			if(playerA > playerB) {
				result = String.format("1등 C선수 : %.1f \n"
				   		+ "2등 A선수 : %.1f \n"
				   		+ "3등 B선수 : %.1f", playerC,playerA,playerB);
			} else {
				result = String.format("1등 C선수 : %.1f \n"
				   		+ "2등 B선수 : %.1f \n"
				   		+ "3등 A선수 : %.1f", playerC,playerB,playerA);
			}
		}
		System.out.println(result);
		
		
	}

}
