import java.util.Scanner;

class Temp{
	float celsius;
	float fehrenheit;
	
	public void FehToCel(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fehrenheit : ");
		float feh = sc.nextFloat();
		
		celsius = (feh - 32) * 5 / 9;
		System.out.println("In Celsius: "+celsius);
		
	}
	public void CelToFeh(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius : ");
		float cel = sc.nextFloat();
		
		fehrenheit = (cel * 5 / 9) + 32;
		System.out.println("In Fehrenheit: "+fehrenheit);
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Temp temp = new Temp();
		
		System.out.println("Type 1 to convert Fehrenheit to Celsius, ");
		System.out.print("Type 2 to convert Celsius to Fehrenheit  : ");
		int num = sc.nextInt();
		
		if( num == 1){
			temp.FehToCel();
		}else if( num == 2){
			temp.CelToFeh();
		}else{
			System.out.println("Invalid Choice.");
		}
		
	}

}