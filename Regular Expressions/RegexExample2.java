/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/  
  
import java.util.regex.*;  
class RegexExample2{  
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "suli32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "shahsu32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "nomi$2"));//false ($ is not matched)  
	}
}  