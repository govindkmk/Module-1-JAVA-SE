import java.util.Scanner;

class Multiples{
	public void table(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for generate table : ");
		int num = sc.nextInt();
		System.out.println("\n");
		for(int i = 1; i <= 200; i++){
			System.out.print(i*num+"	");
			if(i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100 || i == 110 || i == 120 || i == 130 || i == 140 || i == 150 || i == 160 || i == 170 || i == 180 || i == 190 || i == 200){
				System.out.println("\n");
			}
			
		}
		
	}
	public static void main(String[] args){
		Multiples ml = new Multiples();
		ml.table();
	}
}