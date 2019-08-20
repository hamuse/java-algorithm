package homework03;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 String[] join = { "아이디: ", "비밀번호: ", "이름: ", "생년월일 예)1990-05-05: ", "성인여부(성인true , 미성년 false): ",
	               "키 입력(소수점 첫째자리까지): ", "몸무게 입력 (소수점 첫째자리까지): ", "혈액형: " };
	        String[] joinInput = new String[8]; //배열 갯수 join만큼 만들기 위해서 
	        System.out.println(join[0]);
	       joinInput[0] = scn.next();
	       System.out.println(join[1]);
	       joinInput[1] = scn.next();
	       System.out.println(join[2]);
	       joinInput[2] = scn.next();
	       System.out.println(join[3]);
	       joinInput[3] = scn.next();
	       System.out.println(join[4]);
	       joinInput[4] = scn.next();
	       System.out.println(join[5]);
	       joinInput[5] = scn.next();
	       System.out.println(join[6]);
	       joinInput[6] = scn.next();
	       System.out.println(join[7]);
	       joinInput[7] = scn.next();
	       
	        for (int i = 0; i < 8; i++) {
	           System.out.printf("%s %s \n", join[i], joinInput[i]);
	        
	}

}
