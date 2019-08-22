package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar myC = null;
		MyCalendarService myS = new MyCalendarService();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.날짜입력 2.MonthEndDay 3.LeapYear")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				myC = new MyCalendar();
				String year = JOptionPane.showInputDialog("년입력");
				myC.setYear(Integer.parseInt(year));
				String month = JOptionPane.showInputDialog("달입력");
				myC.setMonth(Integer.parseInt(month));
				break;
			case "2":
				String result = myS.getEndDay(myC);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "3":
				result = myS.isLeapYear(myC);
				JOptionPane.showMessageDialog(null, result);
				break;
			}
		}
	}

}
