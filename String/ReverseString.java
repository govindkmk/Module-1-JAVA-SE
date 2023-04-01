package String;
import java.util.Scanner;

class ReverseString{

    public void reverse(String s){
        String str = "";

        for (int i = 0; i < s.length(); i++) {
        str = s.charAt(i) + str;
        }

        System.out.println("Reversed string is : "+ str);
    }

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        ReverseString rs = new ReverseString();
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
 
        rs.reverse(str);
        
    }
}

