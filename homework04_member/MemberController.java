package homework04_member;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		Member mb = null;
		MemberService mbS = new MemberService();

		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원가입 2.마이페이지 3. BMI 4.tax")) {

			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				mb = new Member();
				mb.setId(JOptionPane.showInputDialog("ID입력"));
				mb.setPw(JOptionPane.showInputDialog("비번입력"));
				mb.setName(JOptionPane.showInputDialog("이름입력"));
				String height = JOptionPane.showInputDialog("키 입력");
				mb.setHeight(Double.parseDouble(height));
				String weight = JOptionPane.showInputDialog("몸무게 입력");
				mb.setWeight(Double.parseDouble(weight));
				String salary = JOptionPane.showInputDialog("연봉입력");
				mb.setSalary(Integer.parseInt(salary));

				break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.My페이지\n" + mb.toString());
				break;
			case "3":
				String result = mbS.getBMI(mb);
				JOptionPane.showMessageDialog(null, result);
				break;

			case "4":
				result = mbS.getTax(mb);
				JOptionPane.showMessageDialog(null, result);

				break;

			}
		}
	}
}
