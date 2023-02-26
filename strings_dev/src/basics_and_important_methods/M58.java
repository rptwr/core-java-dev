package basics_and_important_methods;

public class M58 {
	public static void main(String[] args) {
		String s1 = "abc xyz     hello.java  123,test";
		String[] splits = s1.split("[\\s,.]+");
		for (String split : splits) {
			System.out.println(split);
		}
	}
}
