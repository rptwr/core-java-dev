package formatters;

public class M10 {
	public static void main(String[] args) {
		int num = 123456;
		String s1 = String.format("num is (%0,20d)", num);
		System.out.println(s1);
	}
}
