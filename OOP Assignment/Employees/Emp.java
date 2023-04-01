package Employees;
import java.util.Scanner;

class Emp{
	
	int id[] = null;
	String name[] = null;
	int n;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		id = new int[10];
		name = new String[10];
		
		System.out.println("Enter the number of Employees : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println("Enter ID & Name : ");
			id[i] = sc.nextInt();
			name[i] = sc.nextLine();
		}
		
	}
	public void show(){
		for(int i = 1; i <= 2; i++){
			System.out.println("ID	: "+id[i]);
			System.out.println("Name	:"+name[i]);
		}
	}
	
	public static void main(String[] args){
		Emp em = new Emp();
		em.input();
		em.show();
	}
}

