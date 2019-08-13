package step1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MonthEx {

	public static void main(String[] args) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date1 = sdf.format(date);
				System.out.println(date1);
//				String month1 = date1.substring(6,7);
				int month = Integer.parseInt(date1.substring(6,7));
				System.out.println(month);
				String ev = "";
				
				switch(month) {
				case 1 : ev = month + "달"; break;
				case 2 : ev = month + "달"; break;
				case 3 : ev = month + "달"; break;
				case 4 : ev = month + "달"; break;
				case 5 : ev = month + "달"; break;
				case 6 : ev = month + "달"; break;
				case 7 : ev = month + "달"; break;
				case 8 : ev = month + "달"; break;
				case 9 : ev = month + "달"; break;
				case 10 : ev = month + "달"; break;
				case 11 : ev = month + "달"; break;
				case 12 : ev = month + "달"; break;
				
				}
				System.out.println(ev);
	}

}
