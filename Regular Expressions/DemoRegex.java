import java.util.regex.*;
import java.util.Scanner;

public class DemoRegex{
	public static void main(String[] args){
	
		try (Scanner sc = new Scanner(System.in))
		{
			while(true)
			{
				System.out.println("Enter regex pattern");//Welcome
				String regexPattern = sc.nextLine();
				
				Pattern pattern = Pattern.compile(regexPattern);
				Matcher matcher = pattern.matcher("Welcome to JAVA Online Coaching Classes");
				boolean found = false;
				
				while(matcher.find())
				{
					System.out.println("Found the text " + matcher.group() + " starting at index " + matcher.start() + " and ending at index " + matcher.end());
					found = true;
				}
				if(!found)
				{
					System.out.println("Match not found.");
				}
			}
		}
	
	}

}