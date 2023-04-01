import java.util.Scanner;

class Calculator{
	
	public int Add(int num1, int num2){
		return num1+num2;
	}
	public int Mul(int num1, int num2){
		return num1*num2;
	}
	public int Sub(int num1, int num2){
		return num1-num2;
	}
	public double Div(int num1, int num2){
		return num1/num2;
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		char choice = 'n';
		do{
			System.out.print("Enter first number, operator and second number : ");
			int num1 = sc.nextInt();
			char ch = sc.next().charAt(0);
			int num2 = sc.nextInt();
		
			switch(ch){
			case '+':
				System.out.println("Answer = "+cal.Add(num1,num2));
				break;
			case '-':
				System.out.println("Answer = "+cal.Sub(num1,num2));
				break;
			case '*':
				System.out.println("Answer = "+cal.Mul(num1,num2));
				break;
			case '/':
				System.out.println("Answer = "+cal.Div(num1,num2));
				break;
			default:
				System.out.println("Invalid Operator.");
			}
			System.out.print("Do another (y/n) ? ");
			choice = sc.next().charAt(0);
		}while(choice == 'y');
		
				
	}
}