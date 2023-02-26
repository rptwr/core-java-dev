package basics_and_important_methods;

public class M45 {
	public static void main(String[] args) {
		String s1 = "java made easy java";
		int i = s1.lastIndexOf("java");
		int j = s1.lastIndexOf("java", 1);
		int k = s1.lastIndexOf('j');
		int l = s1.lastIndexOf('j', 5);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
