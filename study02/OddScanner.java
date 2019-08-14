package study02;
import java.util.Scanner;
public class OddScanner {

	public static void main(String[] args) {
		//알고리즘 기초단계부터 만들어 놓고 수정해 가는거라 생각하고 순서대로 하면된다 .
		//모양 형태 부터 생각해라 
		// ex) for(){} System.out.println();
		// ex) if(){}
		// ex) switch(){}
		// 그리고 안을 채워넣고 
		Scanner scn = new Scanner(System.in);
		
		String sequence = " ";
        int series = 0;
        System.out.println("시작값");
        int start = scn.nextInt();
        System.out.println("종료값");
        int end = scn.nextInt();
        for (int i = start; i <=end; i++ ) {
        	if (i % 2 ==0) {
        		if(i != 10) {
        			sequence += i+"+";
            	 
            	   }else {
            		   sequence += i+"=";
            	   }
        		series += i ;
        		
        	}else {
        		
        	}
        	 
        }
        System.out.println(sequence + series);
	}

}
