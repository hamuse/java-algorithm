package homework04_member;

public class MemberService {
	public String getBMI(Member mb) {
		String result = "";
		String process = "";
		double bmi = 0.0;
		double height = mb.getHeight();
		double weight = mb.getWeight();
		bmi = weight / (height * height);
		if (bmi > 30.0) {
			process = "고도비만";
		} else if (bmi > 25.0) {
			process = "비만";
		} else if (bmi > 23.0) {
			process = "과체중";
		} else if (bmi > 18.5) {
			process = "정상";
		}else {
			process = "저체중";
		}
		result = String.format("%.0fcm %.0fkg %s", height,weight,process);
		
      return result;
	}
  public String getTax(Member mb) {
	  String result = "";
	  double taxRate = 0.097;
	  int salary = mb.getSalary();
	  int tax =(int) Math.round( (salary * taxRate)*10000);
	  result = String.format("납부하실 세금은%d 입니다.", tax);
	  
	  return result;
  }
}
