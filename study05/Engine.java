package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while (true) {
			System.out.println("0.종료 1.Join 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6.Tax");
			int num = scanner.nextInt();
			switch (num) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("1.Join");
				member = new Member();
				System.out.println("아이디: ");
				member.setId(scanner.next());
				System.out.println("비밀번호: ");
				member.setPw(scanner.next());
				System.out.println("이름: ");
				member.setName(scanner.next());
				System.out.println("생일: ");
				member.setBirthday(scanner.next());
				System.out.println("성인여부: (성인true,미성년false)");
				member.setSsn(scanner.next());
				System.out.println("혈액형: ");
				member.setBlood(scanner.next());
				System.out.println("키: ");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게: ");
				member.setWeight(scanner.nextDouble());
				break;
			case 2:
				System.out.println(member.toString());
				break;
			case 3:
				System.out.println("아이디 찾기");
				String searchName = scanner.next();
				String searchId = scanner.next();
				if (searchName.equals("a") && searchId.equals("a")) {
					System.out.printf("찾는 아이디: %s \n" + "찾는 비밀번호: %s \n ", member.getId(), member.getPw());
				}
				if (searchName.equals("a")) {
					System.out.printf("찾는아이디 : %s", member.getId());
				} else {
					System.out.println("찾는아이디가 없습니다.");
				}
				break;
			case 4:
				System.out.println("BMI");
				String result = service.getBmi(member);
				System.out.println(result);
				break;
			case 5:
				System.out.println("ReportCard");
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수");
				member.setMath(scanner.nextInt());
				result = service.getReportCard(member);
				System.out.println(result);
				break;
			case 6:
				System.out.println("Tax");
				System.out.println("연봉을 입력하세요");
				member.setSalary(scanner.nextInt());
				result = service.getTax(member);
				System.out.println(result);
				break;
			}
		}
	}
}