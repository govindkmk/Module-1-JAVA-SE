import java.util.Scanner;
import java.util.regex.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    


class CDM{
    String name;
	String email;
    static String cnic;
    static String password;
    static int choice;
	static String cnicMatch;
	static String passwordMatch;
	String accounNo;
	String phoneNo;
	long amount;
	
    public void display(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n1.Create Account");
        System.out.println("2.Login \n");
		System.out.print("Enter any Choice : ");	
        choice = sc.nextInt();
        
    }
    
    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name : ");
        name = sc.nextLine();
		
		System.out.println("Enter CNIC : ");
        cnic = sc.next();
			
		if(Pattern.matches("[0-9]{13}", cnic)){
			System.out.println("Enter email : ");
			email = sc.next();
		
			if(Pattern.matches("^(.+)(@)(.+)$", email)){
				System.out.println("Enter password : ");
				password = sc.next();
				if(Pattern.matches("^[a-zA-z0-9]{8,}$",password)){
					System.out.println("\nYour account has created successfully, you can login now...\n");
				}else{
					try{
						throw new CDMException("\nPassword atleast have 8 characters including special keywords numbers & character.");
					}catch(CDMException ex){
						System.out.println(ex);
					}
				}
			}else{
				System.out.println("\nInvalid Email.\n");
			}
		}else{
			try{
				throw new CDMException("\nCNIC must contains 13 numbers.\n");
			}catch(CDMException ex){
				System.out.println(ex);
			}
		}
        
    }
	
	public void login(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CNIC : ");
        cnicMatch = sc.next();
		if(Pattern.matches("[0-9]{13}", cnicMatch)){
		
			System.out.println("Enter password : ");
			passwordMatch = sc.next();
			if(Pattern.matches("^[a-zA-z0-9]{8,}$",passwordMatch)){
				System.out.println("\nLogin Successfully");
			}/*else{
				try{
					throw new CDMException("\nPassword atleast have 8 characters including special keywords numbers & character.");
				}catch(CDMException ex){
					System.out.println(ex);
				}
			}*/
		}/*else{
			try{
				throw new CDMException("CNIC must contains 13 numbers.");
			}catch(CDMException ex){
				System.out.println(ex);
			}
		}*/
		
		
	}
	
	public void displayAfterLogin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n1.Deposit Cash");
        System.out.println("2.Balance Inquiry");
        System.out.println("3.Get Profile \n");
		System.out.print("Enter any Choice : ");
        choice = sc.nextInt();
        
    }
	
	public void cashDeposite(){
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		System.out.println("Enter Account No : ");
		accounNo = sc.nextLine();
		if(Pattern.matches("[0-9]{8,}", accounNo)){
			
			System.out.println("Enter Phone No : ");
			phoneNo = sc.nextLine();
			if(Pattern.matches("[0-9]{11,}", phoneNo)){
				System.out.println("Enter Amount : ");
				amount = sc.nextInt();
				
				System.out.println("\nDear "+name+", your A/C ("+accounNo+") has been credit with Rs. "+amount+" via Cash Deposite Machine, on "+date.format(now)+" at "+time.format(now)+".\n");
			}else{
				System.out.println("Invalid Phone Number.");
			}
		}else{
			System.out.println("Invalid account number.");
		}
		
		
	}
	
	public void balaceInquiry(){
		System.out.println("\nYour current balance is  : "+amount+".\n");
	}
	
	public void profile(){
		System.out.println("\n=========Your Information=========\n");
		System.out.println("Name		: "+name);
		System.out.println("CNIC		: "+cnic);
		System.out.println("Email		: "+email);
		System.out.println("Current Balance	: "+amount+ "\n\n");
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        CDM cdm = new CDM();
		char ch = 'n';
		
        System.out.println("\n\n======================Welcome to Cash Deposite Machine======================\n\n");
        
        while(ch == 'n'){
			cdm.display();
			if (choice == 1){
				cdm.createAccount();
				cdm.display();
				if(choice == 2){
					cdm.login();
					if(cnicMatch.equals(cnic) && passwordMatch.equals(password)){
						do{
							cdm.displayAfterLogin();
							if(choice == 1){
								cdm.cashDeposite();
							}else if(choice == 2){
								cdm.balaceInquiry();
							}else if(choice == 3){
								cdm.profile();
							}else{
								System.out.println("\nInvalid Choice.\n");
							}
							System.out.println("Do you want to Continue then press y or n.");
							ch = sc.next().charAt(0);
						}while(ch == 'y');
					}else{
						System.out.println("\nWrong Credentials, please try again.\n");
					}
					
				}
				else{
					System.out.println("\nInvalid Choice.\n");
				}
			}else{
				System.out.println("\nplease create account first and then login.\n\n");
			}
		}
    }
}