import java.util.Scanner;

public class NthLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int arr[] = {5,1,2,7,6};
        boolean n = false;

        for(int i = 0; i < arr.length; i++){
            if(num >= arr[i]){
                n = true;
                System.out.println("First Largest Number is : "+arr[i]);
            }else if(num <= arr[i]){
                
            }
            /*else{
                System.out.println("Not exist.");
            }*/
        }
    }
    
}
