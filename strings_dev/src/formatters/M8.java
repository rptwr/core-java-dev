package formatters;

public class M8 {
	public static void main(String[] args) {
		int num = 123456;
		String s1 = String.format("num is (%20d)", num);
		System.out.println(s1);
	}
}
// in between the brackets 20 is breadth (20 white spaces)  // by default it is right aligned
