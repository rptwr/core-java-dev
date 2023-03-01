package date_formaters_number_formatters;

import java.text.NumberFormat;
import java.text.ParseException;

public class M6 {
	public static void main(String[] args) throws ParseException {
		double num1 = 11243483329.2434349;  // formatting this number
		System.out.println(num1);
		NumberFormat nf = NumberFormat.getInstance();
		String s1 = nf.format(num1);
		double num2 = (Double) nf.parse(s1);
		System.out.println(s1);
		System.out.println(num2);
	}
}
