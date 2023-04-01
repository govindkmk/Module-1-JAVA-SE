
import java.util.Scanner;

class Students{
	int id[] = null;
	String name[] = null;
	int n;
	
	public void getStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		n = sc.nextInt();
		id = new int[10];
		name = new String[10];
		
		System.out.println("\n");
		for(int i = 1; i <= n; i++){
			System.out.println("Enter ID & Name: ");
			id[i] = sc.nextInt();
			name[i] = sc.nextLine();
			//super.getMark();
		}
	}
	public void displayStudent(){
		System.out.println("\n");
		for(int i = 1; i <= n; i++){
			System.out.println("ID	: "+id[i]);
			System.out.println("Name	:"+name[i]);
		}
	}
}
	
class Exam extends Students{
	int sub1[] = null, sub2[] = null, sub3[] = null;
	
	public void getMark(){
		Scanner sc = new Scanner(System.in);
		
		sub1 = new int[10];
		sub2 = new int[10];
		sub3 = new int[10];
		
		for(int i = 1; i <= n; i++){
			System.out.println("Enter Marks in sub1, sub2 & sub3 :");
			sub1[i] = sc.nextInt();
			sub2[i] = sc.nextInt();
			sub3[i] = sc.nextInt();
		}
	}
	public void showMark(){
		System.out.println("\n");
		for(int i = 1; i <= n; i++){
			System.out.println("Subject 1	:"+sub1[i]);
			System.out.println("Subject 2	:"+sub2[i]);
			System.out.println("Subject 3	:"+sub3[i]);
		}
	}
	
	public static void main(String[] args){
		Exam ex = new Exam();
		ex.getStudent();
		ex.getMark();
		ex.displayStudent();
		ex.showMark();
	
	}
}