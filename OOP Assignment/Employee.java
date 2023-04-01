import java.util.Scanner;

public class Employee{
    int id[] = null;
    String name[] = null;
    int n;
	int basic[];
	double da,hra,pf;
	double netSalary;

    public void Details(){
        Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		n = sn.nextInt();
		id = new int[10];
		name = new String[10];
		basic = new int[10];
        for(int i = 1; i <= n; i++){
            System.out.println("Enter ID & Name "+i+" Employee: ");
            id[i] = sn.nextInt();
            name[i] = sn.nextLine();
			System.out.println("Enter Basic "+i+" Employee: ");
			basic[i] = sn.nextInt();
        }
        
        
    }
    public void showDetails(){
        System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("        SALARY STATEMENTS OF EMPLOYEES     ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        

        for(int i = 1; i <= n; i++){
			System.out.println("           AAAAAAAA Pvt. Ltd.     ");
			System.out.println("===================================================");
            System.out.println("ID 		: "+id[i]);
            System.out.println("Name 		:"+name[i]);
            System.out.println("Basic 		: "+basic[i]);
			if(basic[i] >= 5000 && basic[i] < 10000){
				da = basic[i] * (0.40);
				hra = basic[i] * (0.20);
				pf = basic[i] * (0.10);
			}else if(basic[i] >= 3000 && basic[i] < 5000){
				da = basic[i] * (0.30);
				hra = basic[i] * (0.20);
				pf = basic[i] * (0.10);
			}else if(basic[i] < 3000){
				da = basic[i] * (0.20);
				hra = basic[i] * (0.10);
				pf = basic[i] * (0.10);
			}else{
				da = basic[i] * (0.50);
				hra = basic[i] * (0.30);
				pf = basic[i] * (0.10);
			}
			System.out.println("DA (+) 		: "+String.format("%.2f",da));
			System.out.println("HRA(+)		: "+String.format("%.2f",hra));
			System.out.println("PF (-)		: "+String.format("%.2f",pf));
			
			netSalary = basic[i] + da + hra + pf;
			System.out.println("\n------------------------------------");
			System.out.println("Net Salary 	: "+String.format("%.2f",netSalary));
			System.out.println("===================================================");
			
        }
        
    }

    public static void main(String[] args) {
        Employee em = new Employee();
		em.Details();
		em.showDetails();
		
    }
}