package basics_and_important_methods;

public class M64 {
	public static void main(String[] args) {
		String s1 = "java";
		String ja = "ja";
		String s2 = ja.concat("va");  // s2 will be new object with new operator
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
