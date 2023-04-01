import java.util.Scanner;

class CEO{
	String name;
	int id;
	String occupation;
	int salary;
	
	public CEO(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		id = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Occupation : ");
		occupation = sc.next();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
	}
	
	public void displayInformation(){
		
		System.out.println("\n\n===========Information===========\n\n");
		System.out.println("ID	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Occupation	: "+occupation);
		System.out.println("Salary	: "+salary);
	}
		

	public static void main(String[] args){
		CEO ceo = new CEO();
		ceo.displayInformation();
		
	}

}