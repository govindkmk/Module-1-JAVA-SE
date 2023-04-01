package Employees;
import java.util.Scanner;

class UGteacher extends Emp{
	
	String course[] = null;
	
	public void inputUG(){
		
		Scanner sc = new Scanner(System.in);
		course = new String[10];
		
		for(int i = 1; i <= n; i++){
			System.out.println("Enter a Course : ");
			course[i] = sc.nextLine();
		}
	}
	public void display(){
		for(int i = 1; i <= n; i++){
			System.out.println("Course	: "+course[i]);
		}
	}
	

	public static void main(String[] args) {
        UGteacher ug = new UGteacher();
		ug.input();
		ug.inputUG();
		ug.show();
		ug.display();
    }

}