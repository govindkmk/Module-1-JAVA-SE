import java.util.Scanner;

class Supervisor extends CEO{
	
	
	public void supervisorInformation(){
		
		System.out.println("\n\n===========Information===========\n\n");
		System.out.println("ID	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Occupation	: "+occupation);
		System.out.println("Salary	: "+salary);
	}
		

	public static void main(String[] args){
		Supervisor supervisor = new Supervisor();
		supervisor.supervisorInformation();
	}
}