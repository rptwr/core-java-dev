package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M2 {
	public static void main(String[] args) {
		String src = "Hello1 and2 Hello3 Again    and Again ";
//		String src = "java@gmail.com";
//		String regex = "a";
//		String regex = "ali";  // nothing in output
//		String regex = "[ali]";  // it will look every element separately
//		String regex = "[b-m]";  // range we are specifying through hyphen // evry chr from b to m
//		String regex = "[b-el-p]";  // to ranges we can specify without any separator
//		String regex = "[b-el-pH]"; 
//		String regex = "\\s"; // all white space 
//		String regex = "\\s+"; //all white spaces will be considered as one space only // + stands for one or more
//		String regex = "\\d";  // digits location
//		String regex = "@a";  //validating email id
		String regex = ".";  //
		Pattern pattern = Pattern.compile(regex);  
		Matcher matches = pattern.matcher(src); 
		while (matches.find()) {
			System.out.println(matches.start() + ":" + matches.group());
		}
	}
}
