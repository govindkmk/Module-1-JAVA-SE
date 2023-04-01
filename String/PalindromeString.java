package String;
import java.util.Scanner;

class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		//String numOfstr = String.valueOf(str);
		
		String revstr = "";

        for (int i = 0; i < str.length(); i++) {
        revstr = str.charAt(i) + revstr;
        }

        System.out.println("Reversed string: "+ revstr);
		
		if(str.equals(revstr)){
			System.out.println("The entered String is Palindrome.");
		}else{
			System.out.println("The entered String isn't Palindrome.");
		}
		
        
    }
}
