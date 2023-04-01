package Employees;
import java.util.Scanner;

class PGteacher extends Emp{
	
	String course[] = null;
	
	public void inputPG(){
		
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
        PGteacher pg = new PGteacher();
		pg.input();
		pg.inputPG();
		pg.show();
		pg.display();
    }

}