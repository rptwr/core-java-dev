package date_formaters_number_formatters;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class M8 {
	public static void main(String[] args) throws ParseException {
		Calendar calci = Calendar.getInstance();
		Date date = calci.getTime();
		SimpleDateFormat df = new SimpleDateFormat("EEEE MMMM dd yy", Locale.FRANCE);
		String s1 = df.format(date);
		System.out.println(s1);
		Date d2 = df.parse(s1);
		System.out.println(d2);
		
	}
}

// Formatting date for specific country