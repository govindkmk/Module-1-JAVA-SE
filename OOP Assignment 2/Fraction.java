//import java.util.InputMistmatchException;
import java.util.Scanner;

class Fraction{
	
	public double addition(double a, double b, double c, double d){
		return (a*d + b*c) / (b*d);
	}
	
	public double multiplication(double a, double b, double c, double d){
		return (a*c) / (b*d);
	}
	public double subtract(double a, double b, double c, double d){
		return (a*d - b*c) / (b*d);
	}
	public double division(double a, double b, double c, double d){
		 return (a*d) / (b*c);
	}
	
	public static void main(String[] args){
		Fraction frac = new Fraction();
		Scanner sc = new Scanner(System.in);
		
		char choice = 'n';
		do{
			try{
				System.out.print("Enter first fraction, operator and second fraction : ");
				int num1 = sc.nextInt();
				char div1 = sc.next().charAt(0);
				int num2 = sc.nextInt();
				char op = sc.next().charAt(0);
				int num3= sc.nextInt();
				char div2 = sc.next().charAt(0);
				int num4 = sc.nextInt();
			
				switch(op){
				case '+':
					System.out.println("Answer = "+frac.addition(num1,num2,num3,num4));
					break;
				case '-':
					System.out.println("Answer = "+frac.subtract(num1,num2,num3,num4));
					break;
				case '*':
					System.out.println("Answer = "+frac.multiplication(num1,num2,num3,num4));
					break;
				case '/':
					System.out.println("Answer = "+frac.division(num1,num2,num3,num4));
					break;
				default:
					System.out.println("Invalid Operator.");
				}
				System.out.print("Do another (y/n) ? ");
				choice = sc.next().charAt(0);
				}catch(ArithmeticException e){
					System.out.println("Exception Occurs, You are doing mistake in giving input.");
					System.out.println(e);
				}
		}while(choice == 'y');
		
		
				
	}
}