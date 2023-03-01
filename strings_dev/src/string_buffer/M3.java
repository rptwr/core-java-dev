package string_buffer;

public class M3 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("----------------");
		sb1.append("123456789123456789123");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("-----------------");
		sb1.trimToSize();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}
