import java.util.Scanner;
abstract class Interest{
	abstract void simpleInterest(double p, double t);

}

class SimpleInterest extends Interest{
	
	void simpleInterest(double p, double t){
		Scanner sc = new Scanner(System.in);
		double interest,r;
		System.out.println("Enter Annual Rate of Interest : ");
		r = sc.nextDouble();
		interest = p * r * t;
		System.out.println("Interest : " +interest);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		SimpleInterest si = new SimpleInterest();
		for(int i = 1; i <= 2; i++){
			System.out.println("Enter Interest Details for "+i+" Bank.");
			System.out.println("Enter Money Borrowed or Invested : ");
			double p = sc.nextDouble();
			System.out.println("Enter Time (Years) : ");
			double t = sc.nextDouble();
			si.simpleInterest(p,t);
			System.out.println("\n");
		}
	}
}