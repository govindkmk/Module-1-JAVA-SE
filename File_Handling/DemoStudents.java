package File_Handling;


import java.io.*;
import java.util.Scanner;

public class DemoStudents {

    public void writeToFile(File writeFile) throws IOException {
        FileWriter fileWrite = null;
        try{
            fileWrite = new FileWriter(writeFile);
            Students std1 = new Students();
            std1.setId(25);
            std1.setName("Govind Kumar");
            std1.setDepartment("Computer Science");
            std1.setAge(20);
            std1.setEmail("govindkk152@gmail.com");

            Students std2 = new Students();
            std2.setId(13);
            std2.setName("Suleman Serai");
            std2.setDepartment("Computer Science");
            std2.setAge(22);
            std2.setEmail("seraisuleman22@gmail.com");

            Students std3 = new Students();
            std3.setId(9);
            std3.setName("Ahmed Qazi");
            std3.setDepartment("Computer Science");
            std3.setAge(21);
            std3.setEmail("ahmed353@gmail.com");

            Students std4 = new Students();
            std4.setId(21);
            std4.setName("Hammas Khan");
            std4.setDepartment("Computer System");
            std4.setAge(20);
            std4.setEmail("hammas21@gmail.com");

            Students std5 = new Students();
            std5.setId(15);
            std5.setName("Saifullah Korai");
            std5.setDepartment("Telecommunication");
            std5.setAge(22);
            std5.setEmail("korai22@gmail.com");

            fileWrite.write("ID     Name            Department          Age     Email\n");
            fileWrite.write(std1.getId()+"  "+std1.getName()+"       "+std1.getDepartment()+"        "+std1.getAge()+"  "+std1.getEmail()+"\n");
            fileWrite.write(std2.getId()+"  "+std2.getName()+"       "+std2.getDepartment()+"        "+std2.getAge()+"  "+std2.getEmail()+"\n");
            fileWrite.write(std3.getId()+"  "+std3.getName()+"       "+std3.getDepartment()+"        "+std3.getAge()+"  "+std3.getEmail()+"\n");
            fileWrite.write(std4.getId()+"  "+std4.getName()+"       "+std4.getDepartment()+"        "+std4.getAge()+"  "+std4.getEmail()+"\n");
            fileWrite.write(std5.getId()+"  "+std5.getName()+"       "+std5.getDepartment()+"        "+std5.getAge()+"  "+std5.getEmail()+"\n");


        }catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            fileWrite.close();
        }

    }

    public void readToFile(File readFile) throws IOException {



        System.out.println("\n--------------Get Students Data--------------\n");

        FileReader fr = new FileReader(readFile);

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null){
            System.out.println(line);
            line = br.readLine();

        }
        br.close();

    }

    public void count_Volwels(File readFile) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(readFile);

            BufferedReader br = new BufferedReader(fr);


            int no_Vowels = 0;

            String line = br.readLine();

            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        no_Vowels++;
                    }

                }
                line = br.readLine();
            }
            br.close();
            System.out.println("No: of Vowels : " + no_Vowels);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void count_Spaces(File readFile) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(readFile);

            BufferedReader br = new BufferedReader(fr);


            int no_spaces = 0;

            String line = br.readLine();

            while(line != null){

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == ' ') {
                        no_spaces++;
                    }
                }
                line = br.readLine();
            }
            br.close();
            System.out.println("No: of Spaces : " + no_spaces);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void count_Consonants(File readFile) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(readFile);

            BufferedReader br = new BufferedReader(fr);


            int no_Consonants = 0;

            String line = br.readLine();

            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == ' ') {
                        System.out.print("");
                    } else {
                        no_Consonants++;
                    }
                }
                line = br.readLine();
            }
            br.close();
            System.out.println("No: of Consonants : " + no_Consonants);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void count_Palindromes(File readFile) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(readFile);

            BufferedReader br = new BufferedReader(fr);

            String reverse = " ";
            int no_palindromes = 0;


            String line = br.readLine();

            while(line != null){
                for (int i = 0; i < line.length(); i++) {
                    reverse = line.charAt(i) + reverse;
                    if (line.equals(reverse)) {
                        no_palindromes++;
                    }
                }
                line = br.readLine();
            }

            System.out.println("No: of Palindromes : " + no_palindromes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException {

        DemoStudents demo = new DemoStudents();
        File file = new File("StudentDemo.txt");

        demo.writeToFile(file);
        demo.readToFile(file);
        System.out.println("\n--------------Get Students Data--------------\n");
        demo.count_Volwels(file);
        demo.count_Consonants(file);
        demo.count_Spaces(file);  
        demo.count_Palindromes(file);

    }








}
