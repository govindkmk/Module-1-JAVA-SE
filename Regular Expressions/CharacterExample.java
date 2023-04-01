import java.util.regex.*;

public class CharacterExample{
	public static void main(String[] args){
		
		System.out.println(Pattern.matches("[xyz]", "wbcd")); //false (not x or y or z)	
		System.out.println(Pattern.matches("[xyz]", "x"));	//true (among z or y or z)
		System.out.println(Pattern.matches("[xyz]", "xyz"));	//true (x, y and z comes more than once)
		
	}
	

}