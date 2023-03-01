package formatters;

public class M13 {
	public static void main(String[] args) {
		double num = 1234.567;
		String s1 = String.format("num is %.3f", num);
		System.out.println(s1);
	}
}	


// % [argument number] [flag] [width] [.precision] convertion_type
// in the middle of % and convertion_type whatever we mention is optional
