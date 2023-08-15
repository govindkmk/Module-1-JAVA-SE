package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class IODemo{
    public static void main(String[] args) throws FileNotFoundException {
        IODemo demo = new IODemo();
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\bhara\\OneDrive\\Desktop\\JAVA\\java SE\\src\\File_Handling\\IO.txt");
        demo.writeToFile(file);
        demo.readToFile(file);
    }

    public void writeToFile(File writeFile){
        Scanner sc = new Scanner(System.in);
        PrintWriter writeToFile = null;

        System.out.println("Enter a Employee Name: ");
        String name = sc.nextLine();
        try {
            writeToFile = new PrintWriter(writeFile);
            writeToFile.println("Hello!\nThis is "+name);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            writeToFile.close();
        }
    }

    public void readToFile(File readFile) throws FileNotFoundException {
        Scanner sc = new Scanner(readFile);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}