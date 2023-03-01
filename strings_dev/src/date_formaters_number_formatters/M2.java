package date_formaters_number_formatters;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class M2 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();  // Date object print the date
		System.out.println(date);
		DateFormat df = DateFormat.getDateInstance();  // default format
		String s1 = df.format(date);  // same date object we are formatting assigning to string
		System.out.println(s1);
		Date d2 = df.parse(s1);  // same string we are converting back into Date
		System.out.println(d2);
	}
}

// parse is checked exceptiton for that we need try catch or throws