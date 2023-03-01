package date_formaters_number_formatters;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class M4 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(); 
		System.out.println(date);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String s1 = df.format(date);  
		System.out.println(s1);
		Date d2 = df.parse(s1); 
		System.out.println(d2);
	}
}
