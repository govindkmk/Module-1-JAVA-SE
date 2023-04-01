import java.util.Scanner;

public class CustomersConst{
    int id[] = null;
    String name[] = null;
    int n;

    CustomersConst(){
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		n = sn.nextInt();
		id = new int[10];
		name = new String[10];
        for(int i = 1; i <= n; i++){
            System.out.println("Enter ID & Name: ");
            id[i] = sn.nextInt();
            name[i] = sn.nextLine();
        }
	}
	
    public void showDetails(){
        System.out.println("\n\n==========Details==========\n");

        for(int i = 1; i <= n; i++){
            System.out.println("ID : "+id[i]);
            System.out.println("Name : "+name[i]);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        CustomersConst cs = new CustomersConst();
        cs.showDetails();
    }
}