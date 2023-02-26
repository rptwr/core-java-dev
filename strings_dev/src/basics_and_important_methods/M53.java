package basics_and_important_methods;

public class M53 {
	public static void main(String[] args) {
		String s1 = "abc;xyz;hello;123";
		String[] words = s1.split(";");
		for (String split : words) {
			System.out.println(split);
		}
	}
}
