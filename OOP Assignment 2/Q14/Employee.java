import java.util.Scanner;

class Employee extends CEO{
	
	public void employeeInformation(){
		
		System.out.println("\n\n===========Information===========\n\n");
		System.out.println("ID	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Occupation	: "+occupation);
		System.out.println("Salary	: "+salary);
	}
		

	public static void main(String[] args){
		Employee emp = new Employee();
		emp.employeeInformation();
	}

}