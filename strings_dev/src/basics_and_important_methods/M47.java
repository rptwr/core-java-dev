package basics_and_important_methods;

public class M47 {
	public static void main(String[] args) {
		String s1 = "java technologies";
		String s2 = s1.substring(0, s1.indexOf(' '));
		String s3 = s1.substring(s1.indexOf(' ') + 1, s1.length());
		String s4 = s1.substring(s1.indexOf(' ') + 1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
