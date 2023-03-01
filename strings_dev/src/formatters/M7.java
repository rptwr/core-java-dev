package formatters;

public class M7 {
	public static void main(String[] args) {
		int i = 10;
		double j = 1.5;
		System.out.printf("j value is %2$f and j value is %1$d", i, j);
	}
}
// 2$f represents second argument, 1$f represents first argument 