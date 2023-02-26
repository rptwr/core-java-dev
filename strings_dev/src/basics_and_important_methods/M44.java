package basics_and_important_methods;

public class M44 {
	public static void main(String[] args) {
		String s1 = "java made easy";
		int i = s1.indexOf('a');
		System.out.println(i);
		int j = s1.indexOf('a', 8);
		int k = s1.indexOf("java");
		System.out.println(j);
		System.out.println(k);
	}
}
