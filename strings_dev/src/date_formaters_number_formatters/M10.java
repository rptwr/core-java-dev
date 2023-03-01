package date_formaters_number_formatters;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class M10 {
	public static void main(String[] args) throws ParseException {
		double num1 = 11243483329.2434349;   
		System.out.println(num1);
		NumberFormat nf = NumberFormat.getInstance(new Locale("in")); // Number will be formatted according to india country
		String s1 = nf.format(num1); 
		double num2 = (Double) nf.parse(s1);
		System.out.println(s1);
		System.out.println(num2);
	}
}
// While formatting a date or number we specify for which country
//  to format date we can use DATE format or simple date format
// to format number we can use NUmber Format
// NumberFormat is also abstract class we have to call factory method
