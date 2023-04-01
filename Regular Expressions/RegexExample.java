import java.util.regex.*;

class RegexExample{
	public static void main(String[] args){
		
		Pattern pattern = Pattern.compile(".Xx.");
		Matcher matcher = pattern.matcher("gXxk");//true
		System.out.println("String matches the given Regex - "+matcher.matches());
	}


}