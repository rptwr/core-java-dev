package formatters;

public class M12 {
	public static void main(String[] args) {
		int num = -1234567;
		String s1 = String.format("num is %(d", num);
		System.out.println(s1);
	}
}
// negative number printing inside a bracket