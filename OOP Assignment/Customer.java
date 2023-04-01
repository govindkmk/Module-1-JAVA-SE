import java.util.Scanner;

public class Customer{
    int id;
    String name;

    public void getDetails(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter ID and Name: ");
            id = sc.nextInt();
            name = sc.nextLine();
        }
    }
    public void showDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.getDetails();
        c.showDetails();
    }
}