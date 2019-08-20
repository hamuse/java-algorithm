package study05;
import java.util.Scanner;
public class Engine { 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		   Member member = null;
		   Service service =new Service();
		while(true) {
			System.out.println("0.종료 1. Join 2. 정보보기 3. 아이디찾기4.BMI 5.ReportCard 6.Tax");
			switch(scn.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1: System.out.println("Join");
			member = new Member();
			System.out.println("회원가입");
			System.out.println("아이디");
			member.setId(scn.next());
			System.out.println("비밀번호");
			member.setPw(scn.next());
			System.out.println("이름");
			member.setName(scn.next());
			System.out.println("주민번호");
			member.setSsn(scn.next());
			System.out.println("키");
			member.setHeight(scn.nextDouble());
			System.out.println("몸무게");
			member.setWeight(scn.nextDouble());
			System.out.println("혈액형");
			member.setBlood(scn.next());
			System.out.println("국어점수");
			member.setKor(scn.nextInt());
			System.out.println("영어점수");
			member.setEng(scn.nextInt());
			System.out.println("수학점수");
			member.setMath(scn.nextInt());
			System.out.println("Salary");
			member.setSalary(scn.nextInt());
			
			       
			break; 
			case 2 : 
			   System.out.println(member.toString());
			   break;
			case 3 : 
				System.out.println("아이디,이름을 입력하면 비번알려줌 ");
				String searchName = scn.next();
				String searchId = scn.next();
				if(searchName.equals("a") && searchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호 : %s", member.getId() ,member.getPw());
				}
				if(searchName.equals("a")) {
					System.out.printf("찾는아이디 : %s", member.getId());
				}else {
					System.out.println("찾는아이디가 없습니다 .");
				}
			case 4: 
			System.out.println("BMI 구하기");
			String result = service.getBmi(member);
			System.out.println(result);
				break;
				
			case 5: 
				System.out.println("ReportCard");
				 result =service.getReportCard(member);
				System.out.println(result);
				
			break;
			case 6 :
				System.out.println("Tex");
				result = service.getTax(member);
				System.out.println(result);
				break;
			}
			
		}
	}

}
