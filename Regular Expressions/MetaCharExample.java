import java.util.regex.*;

public class MetaCharExample{
	public static void main(String[] args){
		
		System.out.println("metacharacter d..."); //d means digit
		System.out.println(Pattern.matches("d", "abc")); //false (non-digit)
		System.out.println(Pattern.matches("d", "1")); //true (digit and comes once)
		System.out.println(Pattern.matches("d", "1134")); //false (digit but comes more than once)
		System.out.println(Pattern.matches("d", "134abc")); //false (digit and characters)
		
		System.out.println("metacharacter D..."); //D means non-digit
		System.out.println(Pattern.matches("D", "abc")); //false (non-digit but comes more than once)
		System.out.println(Pattern.matches("D", "1")); //false (digit)
		System.out.println(Pattern.matches("D", "1134abc")); //false (digit but char)
		System.out.println(Pattern.matches("D", "m")); //true (digit and comes once)
		
		System.out.println("metacharacter D with quatifier..."); 
		System.out.println(Pattern.matches("D*", "abc")); //true (non-digit and may come 0 or more times)
	}
	

}