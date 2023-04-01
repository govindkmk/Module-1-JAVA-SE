import java.util.Scanner;

class Distance{
	Scanner sc = new Scanner(System.in);
	
	double inches,mili,km;
	
	public void inchToMili(){
		System.out.println("Enter Distance in Inches : ");
		inches = sc.nextFloat();
		mili = inches * 25.4;
		System.out.println("In Milimeter: "+mili);
	}
	public void miliToinch(){
		System.out.println("Enter Distance in Milimeter : ");
		mili = sc.nextFloat();
		inches = mili / 25.4;
		System.out.println("In Inches: "+inches);
	}
	public void miliToKM(){
		System.out.println("Enter Distance in Milimeter : ");
		mili = sc.nextFloat();
		km = mili / 1000000;
		System.out.println("In Kilometer: "+km);
	}
	public void kmToMili(){
		System.out.println("Enter Distance in Kilometer : ");
		km = sc.nextFloat();
		mili = km * 1000000;
		System.out.println("In Milimeter: "+mili);
	}
	public void inchToKM(){
		System.out.println("Enter Distance in Inches : ");
		inches = sc.nextFloat();
		km = inches / 393.70;
		System.out.println("In Kilometer: "+km);
	}
	public void kmToInch(){
		System.out.println("Enter Distance in Kilometer : ");
		km = sc.nextFloat();
		inches = km * 393.70;
		System.out.println("In Inches: "+inches);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Distance dst = new Distance();
		
		System.out.println("Type 1 Convert into Inches to Milimeter,");
		System.out.println("Type 2 Convert into Milimeter to Inches,");
		System.out.println("Type 3 Convert into Milimeter to Kilometer,");
		System.out.println("Type 4 Convert into Kilometer to Milimeter,");
		System.out.println("Type 5 Convert into Kilometer to Inches,");
		System.out.println("Type 6 Convert into Inches to Kilometer:");
		
		int num = sc.nextInt();
		 if(num == 1){
			dst.inchToMili();
		 }else if(num == 2){
			dst.miliToinch(); 
		 }else if(num == 3){
			dst.miliToKM();
		 }else if(num == 4){
			dst.kmToMili(); 
		 }else if(num == 5){
			dst.kmToInch(); 
		 }else if(num == 6){
			dst.inchToKM(); 
		 }else{
			 System.out.println("Invalid Choice Number!");
		 }
	}
}