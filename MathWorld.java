import java.util.Scanner;
import java.util.Date;

public class MathWorld{
    Scanner sc = new Scanner(System.in);

    public void Display(){
        System.out.println("1.Area of Triangle");
        System.out.println("2.Area of Circle");
        System.out.println("3.Area of Sphere");
        System.out.println("4.Distance Between two Points");
        System.out.println("5.Table");
        System.out.println("6.Generate Marksheet");
        System.out.println("7.Current Bill");
        System.out.println("8.Reverse of a Number");
        System.out.println("9.Check Strong Number");
        System.out.println("10.Check Armstrong Number");
    }

    public double areaOfTriangle(double base, double height){
        double a = (base * height) / 2;
        System.out.println("The Area of Triangle is "+a+ "."); 
        return a;
    }

    public double areaOfCircle(double radius){
        double a = 3.17 * (radius * radius);
        System.out.println("The Area of Circle is "+a+ "."); 
        return a;
    }

    public double areaOfSphere (double radius){
        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();
    
        double a = 4 * 3.17 * (radius * radius);
        System.out.println("The Area of Sphere is "+a+ "."); 
        return a;
    }

    public void distancePoints(){
        System.out.println("Enter X1: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter X2: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter Y1");
        float y1 = sc.nextFloat();
        System.out.println("Enter Y2");
        float y2 = sc.nextFloat();

        float d = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 -y1));
        System.out.println("Distance between two points is " +d+ ".");
    }

    public void table(){
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i+ " * " +num+ " = " +i*num);
        }
    }

    public void generateMarksheet(){
        String gradeOOP = "E";
        String gradeMath = "E";
        String gradeITC = "E";
        String gradeCS = "E";
        String gradePM = "E";
        
        System.out.println("\n\nEnter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll Number:");
        String rollnum = sc.nextLine();
        System.out.println("Enter Father Name:");
        String fname = sc.nextLine();
        
        System.out.println("\n\nEnter marks of OOP out of 100:");
        int oop = sc.nextInt();
        System.out.println("Enter marks of Mathmatics out of 100:");
        int math = sc.nextInt();
        System.out.println("Enter marks of Introduction to Computing out of 100:");
        int itc = sc.nextInt();
        System.out.println("Enter marks of Communication Skills out of 100:");
        int cs = sc.nextInt();
        System.out.println("Enter Principle of Management out of 100:");
        int pm = sc.nextInt();

        int total = 100;
        int fromTotal = 500;
        int totalMarks = oop + math + itc + cs + pm;
        
        if(oop >= 91  && oop <= 100){
            gradeOOP = "A";
        }
        else if(oop >= 80  && oop <= 90){
            gradeOOP = "B";
        }
        else if(oop >= 65 && oop <= 79){
            gradeOOP = "C";
        }
        else if(oop >= 51 && oop <= 64){
            gradeOOP = "D";
        }else{
            gradeOOP = "Fail";
        }

        if(math >= 91 && math <= 100){
            gradeMath = "A";
        }
        else if(math >= 80 && math <= 90){
            gradeMath = "B";
        }
        else if(math >= 65 && math <= 79){
            gradeMath = "C";
        }
        else if(math >= 51 && math <= 64){
            gradeMath = "D";
        }else{
            gradeMath = "Fail";
        }

        if(itc >= 91 && itc <= 100){
            gradeITC = "A";
        }
        else if(itc >= 80 && itc <= 90){
            gradeITC = "B";
        }
        else if(itc >= 65 && itc <= 79){
            gradeITC = "C";
        }
        else if(itc >= 51 && itc <= 64){
            gradeITC = "D";
        }else{
            gradeITC = "Fail";
        }

        if(cs >= 91 && cs <= 100){
            gradeCS = "A";
        }
        else if(cs >= 80 && cs <= 90){
            gradeCS = "B";
        }
        else if(cs >= 65 && cs <= 79){
            gradeCS = "C";
        }
        else if(cs >= 51 && cs <= 64){
            gradeCS = "D";
        }else{
            gradeCS = "Fail";
        }

        if(pm >= 91 && pm <= 100){
            gradePM = "A";
        }
        else if(pm >= 80 && pm <= 90){
            gradePM = "B";
        }
        else if(pm >= 65 && pm <= 79){
            gradeOOP = "C";
        }
        else if(pm >= 51 && pm <= 64){
            gradePM = "D";
        }else{
            gradePM = "Fail";
        }

        System.out.println("\n\n                Mehran University of Engineering & Technology, Jamshoro                \n\n");
        System.out.println("Roll Number: " +rollnum);
        System.out.println("Name:        " +name+ "                                     Date:"+new Date());
        System.out.println("Father Name: " +fname);
        System.out.println("\n");

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| Subjects                      | Obtained Marks | Total Marks | Grade          |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| Object Oriented Programming   |    "+oop+"          |   "+total+"       |    "+gradeOOP+"           |");
        System.out.println("| Mathematics                   |    "+math+"          |   "+total+"       |    "+gradeMath+"           |");
        System.out.println("| Introduction to Computing     |    "+itc+"          |   "+total+"       |    "+gradeITC+"           |");
        System.out.println("| Communication Skills          |    "+cs+"          |   "+total+"       |    "+gradeCS+"           |");
        System.out.println("| Principle of Management       |    "+pm+"          |   "+total+"       |    "+gradePM+"           |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                 Total Marks   |      "+totalMarks+"      |         " +fromTotal+"             |");
        System.out.println("---------------------------------------------------------------------------------");
    
    }

    public void Reverse(){

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int rev = 0, rem;

        for(int i = 1; i <= num; num = num/10){
            rem = num % 10;
            rev = (rev * 10) + rem;
        }

        System.out.println("The Reverse of a Number is = " +rev);
    }

    public void Strong(){

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        long fac = 1L;
        int sum = 0;

        for(int i = 0; i <= num; i++){
            fac *= i;
            sum += i;
        }

        System.out.println("Factorial of a Number is = " +fac);
        System.out.println("Sum of a Number is = " +sum);

        if(fac == sum){
            System.out.println("The given number is a STRONG NUMBER.");
        }
        else {
            System.out.println("The given number is NOT a Strong Number.");
        }
    }

    public void Armstrong(){
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int number, temp, sum = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            sum = sum + temp*temp*temp;
            number /= 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

    }





    public static void main(String[] args){
        MathWorld mw = new MathWorld();
        Scanner sc = new Scanner(System.in);

        try{
                char ch = 'n';

            do{
                mw.Display();

                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Enter Base: ");
                        double base = sc.nextDouble();
                        System.out.println("Enter Height: ");
                        double height = sc.nextDouble();
                        mw.areaOfTriangle(base,height);
                        break;
                    
                    case 2:
                        System.out.println("Enter Radius: ");
                        double radius = sc.nextDouble();
                        mw.areaOfCircle(radius);
                        break;
                    
                    case 3:
                        System.out.println("Enter Radius: ");
                        double rad = sc.nextDouble();
                        mw.areaOfSphere(rad);
                        break;
                    case 4:
                        mw.distancePoints();
                        break;
                    
                    case 5:
                        mw.table();
                        break;
                
                    case 6:
                        mw.generateMarksheet();
                        break;
                    
                    case 7:
                        
                        break;
                    
                    case 8:
                        mw.Reverse();
                        break;
                    
                    case 9:
                        mw.Strong();
                        break;
                    
                    case 10:
                        mw.Armstrong();
                        break;
                    default:
                        System.out.println("Invalid Number.");
                    
                }
                System.out.println("Do you wanna try more then press y other n.");
                ch = sc.next().charAt(ch);
            }while(ch == 'y');
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}