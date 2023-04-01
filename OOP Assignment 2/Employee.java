import java.util.Scanner;

class Employee{
	
	int number[] = null;
	float salary[] = null;
	int n;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees : ");
		n = sc.nextInt();
		
		number = new int[10];
		salary = new float[10];
		
		for(int i = 1; i <= n; i++){
			System.out.println("\n");
			System.out.println("Enter "+i+" Employee Number : ");
			number[i] = sc.nextInt();
			System.out.println("Enter "+i+" Employee Salary : ");
			salary[i] = sc.nextFloat();
		}
		
	}
	
	public void display(){
		
		for(int i = 1; i <= n; i++){
			System.out.println("\n");
			System.out.println("Employee "+i+ " :");
			System.out.println("Number	: "+number[i]);
			System.out.println("Salary	: "+salary[i]);
			
		}
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.input();
		emp.display();
		
	}
}	