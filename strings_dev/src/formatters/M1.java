package formatters;

public class M1 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = String.format("==> %s", s1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
