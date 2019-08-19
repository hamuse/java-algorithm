package homework02;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
	        String[] join = { "아이디: ", "비밀번호: ", "이름: ", "생년월일 예)1990-05-05: ", "성인여부(성인true , 미성년 false): ",
	               "키 입력(소수점 첫째자리까지): ", "몸무게 입력 (소수점 첫째자리까지): ", "혈액형: " };
	        String[] joinInput = new String[join.length]; //배열 갯수 join만큼 만들기 위해서 
	        System.out.println("회원가입");
	        for (int i = 0; i < join.length; i++) {
	            System.out.printf("%s입력하세요.\n", join[i]);
	           joinInput[i] = scn.next();
	        }
	        for (int i = 0; i < joinInput.length; i++) {
	           System.out.printf("%s %s \n", join[i], joinInput[i]);
	        }
	}

}
