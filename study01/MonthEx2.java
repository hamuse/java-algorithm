package study01;
import java.util.Date;
import java.text.SimpleDateFormat;
public class MonthEx2 {

	public static void main(String[] args) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String today =sdf.format(date);
				
				int flag =Integer.parseInt(today.substring(6,7));
				String eval = "";
				switch(flag) {
				case 1 : eval = flag+"월"; break;
				case 2 : eval = flag+"월"; break;
				case 3 : eval = flag+"월"; break;
				case 4 : eval = flag+"월"; break;
				case 5 : eval =  flag+ "월"; break;
				case 6 : eval =  flag+"월"; break;
				case 7 : eval =  flag+"월"; break;
				case 8 : eval = flag+ "월"; break;
				case 9 : eval =  flag+"월"; break;
				case 10 : eval =  flag+"월"; break;
				case 11: eval = flag+ "월"; break;
				case 12 : eval =  flag+"월"; break;
				default : break;
				
				}
				
				System.out.println(eval);
	}

}
