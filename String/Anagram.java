import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first String: ");
		String string1 = scanner.nextLine();
		System.out.print("Enter the second String: ");
		String string2 = scanner.nextLine();
		
		char string1Array[] = string1.toCharArray();
		char string2Array[] = string2.toCharArray();
		
		Arrays.sort(string1Array);
		Arrays.sort(string2Array);
		
		if (Arrays.equals(string1Array, string2Array)) {
			System.out.println("The inputted strings are anagram.");
		}else{
			System.out.println("The inputted strings are not anagram.");
		}
	}
}