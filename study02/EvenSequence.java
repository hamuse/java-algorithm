package study02;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {
		// 짝수를 찾아서 더하라
		// 시작값과 끝 값을 입력받아서 짝수를 찾아 더하라 .
	Scanner scn = new Scanner(System.in);
//		int series = 0;
//		String sequence = " ";
//		System.out.println("시작값 입력: ");
//		int start = scn.nextInt();
//		System.out.println("끝값 입력: ");
//		int end = scn.nextInt();
//
//		for (int i = start; i <= end; i++) {
//			if (i % 2 == 0) {
//				if (end % 2 == 0) {
//					if (i != end) {
//						sequence += i + "+";
//
//					} else {
//						sequence += i + "=";
//					}
//				} else {
//					series += i;
//
//				}
//
//			} else {
//				int end2 = end - 1;
//				if (end % 2 == 0) {
//					if (i != end2) {
//						sequence += i + "+";
//
//					} else {
//						sequence += i + "=";
//					}
//				} else {
//					series += i;
//
//				}
//
//			}
//		}
//		System.out.println(sequence + series);
//
//	}
//
//}
			
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

		
