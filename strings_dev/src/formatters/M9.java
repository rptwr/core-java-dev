package formatters;

public class M9 {
	public static void main(String[] args) {
		int num = 123456;
		String s1 = String.format("num is (%-20d)", num);
		System.out.println(s1);
	}
}
// - is for specifying space in left side