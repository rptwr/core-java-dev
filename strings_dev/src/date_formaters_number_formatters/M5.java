package date_formaters_number_formatters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class M5 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(); 
		System.out.println(date);
//		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		SimpleDateFormat df = new SimpleDateFormat("h:mm a");
		SimpleDateFormat df = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
		String s1 = df.format(date);
		System.out.println(s1);
		Date d2 = df.parse(s1);
		System.out.println(d2);
	}
}
