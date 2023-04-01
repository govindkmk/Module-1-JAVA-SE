import java.util.Scanner;

class AssistantManager extends CEO{
	
	public void assistantInformation(){
		
		System.out.println("\n\n===========Information===========\n\n");
		System.out.println("ID	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Occupation	: "+occupation);
		System.out.println("Salary	: "+salary);
	}
		

	public static void main(String[] args){
		AssistantManager assistantManager = new AssistantManager();
		assistantManager.assistantInformation();

	}
}