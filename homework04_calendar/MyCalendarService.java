package homework04_calendar;

public class MyCalendarService {
	 public String getEndDay(MyCalendar myC) {
	        int month = myC.getMonth();
	        String result = "";
	        switch (month) {
	        case 2:
	            result = "29일";
	            break;
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	            result = "31일";
	            break;
	        default:
	            result = "30일";
	            break;
	        }
	        return result;
	    }
	    public String isLeapYear(MyCalendar myC) {
	        int year = myC.getYear();
	        String result = "";
	        if (year % 4 == 0 && year % 100 != 0) {
	            result = "윤년";
	        } else if (year % 400 == 0) {
	            result = "윤년";
	        } else {
	            result = "평년";
	        }
	        return result;
	    }
}
