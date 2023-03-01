package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M1 {
	public static void main(String[] args) {
		String src = "Hello and Hello Again and Again";
		String regex = "and";
		Pattern pattern = Pattern.compile(regex);  // Define a pattern for the expression
		Matcher matches = pattern.matcher(src);  // Find out all the pattern in a particular source
		while (matches.find()) {
			System.out.println(matches.start() + ":" + matches.group());
		}
	}
}


// by using matcher and pattern we can identify every occurrence of the expression in a particular expression
// whatever matches are there in source all will be returning to matcher object