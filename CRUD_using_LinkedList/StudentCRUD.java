package CRUD_using_LinkedList;

import java.util.*;
import java.util.regex.*;

class StudentCRUD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        LinkedList<Student> students = new LinkedList<>();

        System.out.println("\n<<<<<<<<<<Welcome to Student Data>>>>>>>>>>>\n");

        int id, age;
        String name, email, department;
        char ch = 'n';

        do {
            Student std = new Student();
            std.display();

            System.out.print("\nSelect any choice : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("\nEnter Student ID : ");
                    id = sc.nextInt();
                    std.setId(id);
                    sc.skip("\\R?");
                    System.out.print("Enter Student Name : ");
                    name = sc.nextLine();
                    std.setName(name);
                    System.out.print("Enter Student Department : ");
                    department = sc.nextLine();
                    std.setDepartment(department);
                    System.out.print("Enter Student Age : ");
                    age = sc.nextInt();
                    std.setAge(age);
                    System.out.print("Enter Student Email : ");
                    email = sc.next();
                    if (Pattern.matches("^(.+)(@)(.+)$", email)) {
                        std.setEmail(email);
                        students.add(std);
                        System.out.println("\nStudent Added Successfully...");
                    } else {
                        System.out.println("\nInvalid Email.\n");
                    }


                    break;
                case 2:
                    try {
                        System.out.println("\nEnter Student Id to update the record : ");
                        id = sc.nextInt();
                        int i;
                        for(i = 0; i < students.size(); i++) {
                            if (students.get(i).getId() == id) {
                                System.out.println("\nWhich Date do you want to update... \n1. Name \n2. Department \n3. Age \n4. Email \n5. Update all above \n\nSelect your choice : ");
                                num = sc.nextInt();
                                if (num == 1) {
                                    sc.skip("\\R?");
                                    System.out.println("Enter New Name : ");
                                    name = sc.nextLine();
                                    students.get(i).setName(name);
                                    System.out.println("\nStudent Name Updated Successfully...\n");
                                } else if (num == 2) {
                                    System.out.println("Enter New Department : ");
                                    department = sc.nextLine();
                                    students.get(i).setDepartment(department);
                                    System.out.println("\nStudent Department Updated Successfully...\n");
                                } else if (num == 3) {
                                    System.out.println("Enter New Age : ");
                                    age = sc.nextInt();
                                    students.get(i).setAge(age);
                                    System.out.println("\nStudent Age Updated Successfully...\n");
                                } else if (num == 4) {
                                    System.out.println("Enter New Email : ");
                                    email = sc.next();
                                    students.get(i).setEmail(email);
                                    System.out.println("\nStudent Email Updated Successfully...\n");
                                } else if (num == 5) {
                                    sc.skip("\\R?");
                                    System.out.print("Enter Student Name : ");
                                    name = sc.nextLine();
                                    students.get(i).setName(name);
                                    System.out.print("Enter Student Department : ");
                                    department = sc.nextLine();
                                    students.get(i).setDepartment(department);
                                    System.out.print("Enter Student Age : ");
                                    age = sc.nextInt();
                                    students.get(i).setAge(age);
                                    System.out.print("Enter Student Email : ");
                                    email = sc.next();
                                    if (Pattern.matches("^(.+)(@)(.+)$", email)) {
                                        students.get(i).setEmail(email);
                                        System.out.println("\nStudent Updated Successfully...\n");
                                    } else {
                                        System.out.println("\nInvalid Email.\n");
                                    }

                                } else {
                                    System.out.println("Invalid Choice...");
                                }
                                break;
                            }
                        }

                    }catch (Exception e){
                        System.out.println("Student ID doesn't Found.");

                    }

                    break;
                case 3:
                    try {
                        System.out.println("\nEnter Student Id : ");
                        id = sc.nextInt();
                        boolean bl = false;
                        int j = 0;
                        while(j < students.size()) {
                            if (students.get(j).getId() == id) {
                                bl = true;
                                break;
                            }
                            j++;
                        }
                        if(bl == true){
                            students.remove(students.toArray()[j]);
                            System.out.println("\nStudent Deleted Successfully...\n");
                        }else{
                            System.out.println("Student ID doesn't Found.");
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    break;
                case 4:

                    try {
                        System.out.println("\nEnter Student Id : ");
                        id = sc.nextInt();
                        int k = 0;
                        for(;k < students.size(); k++) {
                            if (students.get(k).getId() == id) {
                                System.out.println("\nID 		    : " + students.get(k).getId());
                                System.out.println("Name 		: " + students.get(k).getName());
                                System.out.println("Department 	: " + students.get(k).getDepartment());
                                System.out.println("Age 		: " + students.get(k).getAge());
                                System.out.println("Email 		: " + students.get(k).getEmail());
                                break;
                            }
                        }
                        if (students.get(k).getId() != id) {
                            System.out.println("Student ID doesn't Found.");
                        }


                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Student ID doesn't Found.");
                    }

                    break;
                case 5:
                    System.out.println("\n\nID	Name		    Age	Department	Email\n");

                    for (Student s : students) {
                        System.out.println(s.getId() + "	" + s.getName() + " " + s.getAge() + "	" + s.getDepartment() + "		" + s.getEmail());
                    }
                    break;

                default:
                    System.out.println("Invalid Choice...");
            }

            System.out.println("\nDo you want to continue then press y otherwise n... ");
            ch = sc.next().charAt(0);
            System.out.println("\n");
        }while(ch =='y');

        System.out.println("\nThank you for Using Student Data Operations...");
    }
}
