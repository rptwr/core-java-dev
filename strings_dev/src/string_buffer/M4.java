package string_buffer;

public class M4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
										//  0123456789
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
	}
}
