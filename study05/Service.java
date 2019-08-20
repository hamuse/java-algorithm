package study05; 

public class Service { //메소드 만드는것 
   public String getBmi(Member member) {
	   String result = "정상";
	   String dab = " ";
	   double bmi = 0;
	   String name = member.getName();
	   double height = member.getHeight();
	   double weight = member.getWeight();
	   bmi = weight /(height*height);
	   if(bmi>30.0) {
           dab = "고도비만";
	   }else if(bmi>25.0) {
		   dab = "비만";
	   }else if(bmi>23.0) {
		   dab = "과체중";
	   }else if(bmi>18.5) {
		   dab = "정상";
	   }else {
		   dab = "저체중";
	   }
	   result =name+height +","+ weight+"," + dab;
	   
	  return result;
   }
   public String getReportCard(Member member) {
	   String result = "";
	   String end = "";
	   int kor = member.getKor();
	   int eng = member.getEng();
	   int math = member.getMath();
	   String name = member.getName();
	   String evalu = "";
		int sum = kor + eng + math;
		double aveEx = (double) sum / 3;
		int ave = (int) Math.round(aveEx);
		if (ave >= 90) {
			evalu = "장학생";
			System.out.println(evalu);
		} else if (ave > 90) {
			evalu = "합격";
			System.out.println(evalu);
		} else if (ave > 70) {
			evalu = "불합격";
			System.out.println("evalu");
		} else {
			System.out.println("오류 다시입력해주세요.");
		}
		result = String.format("이름: %s, 국어:%d점, 영어:%d점, 수학:%d점, 총점:%d점, 평균:%d점, %s", name, kor, eng, math, sum, ave, evalu);
		
		return result;
	}
   
   public String getTax(Member member) {
	   String result = "";
	   int salary = member.getSalary();
	   String name = member.getName();
		double rate = 9.7;
		double taxrate = rate * 0.01;
		double tax1 = (salary * 10000) * taxrate;
		int tax = (int) Math.round(tax1);
		System.out.printf("연봉%d만원 받으시는 %s님께서 납부할 세금은 %d원입니다.", salary, name, tax);
	   return result;
   }
}
