import java.util.Scanner;

class Manager extends CEO{
	
	public void managerInformation(){
		
		System.out.println("\n\n===========Information===========\n\n");
		System.out.println("ID	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Occupation	: "+occupation);
		System.out.println("Salary	: "+salary);
	}
		

	public static void main(String[] args){
		Manager manager = new Manager();
		manager.managerInformation();
		
	}

}