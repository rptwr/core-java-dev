package formatters;

public class M3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = String.format("(%s) and {%d} and [%f]", s1, 100, 4.5);
		System.out.println(s1);
		System.out.println(s2);
	}
}


// %s	any type	String value
// %d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
//  %f	floating point	decimal number