import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase();
        
        int frequencyArray[] = new int[26];
        
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (Character.isLetter(currentChar)) {
                frequencyArray[currentChar - 'a']++;
            }
        }
        System.out.println("Frequency of each letter: ");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + frequencyArray[i]);
            }
        }
    }
}