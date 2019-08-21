package study05;

public class Service { // 메소드 만드는것
	public String getBmi(Member member) {
		String result = "";
		String process = "";
		double bmi = 0;
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		bmi = weight / (height * height);
		if (bmi > 30.0) {
			process = "고도비만";
		} else if (bmi > 25.0) {
			process = "비만";
		} else if (bmi > 23.0) {
			process = "과체중";
		} else if (bmi > 18.5) {
			process = "정상";
		} else {
			process = "저체중";
		}
		result = String.format("%s님 %.0f %.0f %s", member.getName(), member.getHeight(), member.getWeight(), process);
		return result;
	}

	public String getReportCard(Member member) {

		int sum = member.getEng() + member.getEng() + member.getMath();
		String result = "";
		double ave = sum / 3;
		String process = "";
		if (ave >= 90) {
			process = "장학생";
		} else if (ave < 90) {
			process = "합격";
		} else if (ave < 70) {
			process = "불합격";
		}
		result = String.format(
				"학생        국어    영어    수학   총점  평균   합격여부\n" + "======================================\n"
						+ " %s      %d   %d   %d   %d  %.0f  %s",
				member.getName(), member.getKor(), member.getEng(), member.getMath(), sum, ave, process);
		return result;
	}

	public String getTax(Member member) {

		String result = "";
		double taxRate = 0.097;
		int salary = member.getSalary();
		int tax = (int) Math.round((salary * taxRate) * 1000);

		result = String.format("%s님께서 납부할 세금은 %d 입니다.", member.getName(), tax);

		return result;

	}
}