package basics_and_important_methods;

public class M17 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = s1 + null;
		String s3 = null + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
