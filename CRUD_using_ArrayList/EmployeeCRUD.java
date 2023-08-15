package CRUD_using_ArrayList;

import java.util.*;
import java.util.regex.*;

class EmployeeCRUD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employees employee = new Employees();

		ArrayList<Employees> employees = new ArrayList<>();

		System.out.println("\n<<<<<<<<<<Welcome to Employees Data>>>>>>>>>>>\n");

		int id, age, experience;
		String name, email;
		char ch = 'n';
		do {
			Employees emp = new Employees();
			emp.display();

			System.out.print("\nSelect any choice : ");
			int num = sc.nextInt();
			switch (num) {
				case 1:
					System.out.print("\nEnter Employee ID : ");
					id = sc.nextInt();
					emp.setId(id);
					sc.skip("\\R?");
					System.out.print("Enter Employee Name : ");
					name = sc.nextLine();
					emp.setName(name);
					System.out.print("Enter Employee Experience(years) : ");
					experience = sc.nextInt();
					emp.setExperience(experience);
					System.out.print("Enter Employee Age : ");
					age = sc.nextInt();
					emp.setAge(age);
					System.out.print("Enter Employee Email : ");
					email = sc.next();
					if (Pattern.matches("^(.+)(@)(.+)$", email)) {
						emp.setEmail(email);
						employees.add(emp);
						System.out.println("\nEmployee Added Successfully...");
					} else {
						System.out.println("\nInvalid Email.\n");
					}


					break;
				case 2:

					try{

						System.out.println("\nEnter Employee Id to update the record : ");
						id = sc.nextInt();
						int i = 0;
						for (; i < employees.size(); i++) {
							if (employees.get(i).getId() == id) {
								System.out.println("\nWhich Date do you want to update... \n1. Name \n2. Experience \n3. Age \n4. Email \n5. Update all above \n\nSelect your choice : ");
								num = sc.nextInt();
								if (num == 1) {
									sc.skip("\\R?");
									System.out.println("Enter New Name : ");
									name = sc.nextLine();
									employees.get(i).setName(name);
									System.out.println("\nEmployee Name Updated Successfully...\n");
								} else if (num == 2) {
									System.out.println("Enter New Experience : ");
									experience = sc.nextInt();
									employees.get(i).setExperience(experience);
									System.out.println("\nEmployee Experience Updated Successfully...\n");
								} else if (num == 3) {
									System.out.println("Enter New Age : ");
									age = sc.nextInt();
									employees.get(i).setAge(age);
									System.out.println("\nEmployee Age Updated Successfully...\n");
								} else if (num == 4) {
									System.out.println("Enter New Email : ");
									email = sc.next();
									employees.get(i).setEmail(email);
									System.out.println("\nEmployee Email Updated Successfully...\n");
								} else if (num == 5) {
									sc.skip("\\R?");
									System.out.print("Enter Employee Name : ");
									name = sc.nextLine();
									employees.get(i).setName(name);
									System.out.print("Enter Employee Experience(years) : ");
									experience = sc.nextInt();
									employees.get(i).setExperience(experience);
									System.out.print("Enter Employee Age : ");
									age = sc.nextInt();
									employees.get(i).setAge(age);
									System.out.print("Enter Employee Email : ");
									email = sc.next();
									if (Pattern.matches("^(.+)(@)(.+)$", email)) {
										employees.get(i).setEmail(email);
										System.out.println("\nEmployee Updated Successfully...\n");
									} else {
										System.out.println("\nInvalid Email.\n");
									}

								} else {
									System.out.println("Invalid Choice...");
								}
								break;
							}
						}
						if (employees.get(i).getId() != id) {
							System.out.println("Employee ID doesn't Found.");
						}
					}catch (Exception e){
						System.out.println("Student ID doesn't Found.");

					}

					break;
				case 3:
					try {
						System.out.println("\nEnter Employee Id : ");
						id = sc.nextInt();

						boolean bl = false;
						int j = 0;
						for(; j < employees.size(); j++){
							if (employees.get(j).getId() == id) {
								bl = true;
								break;
							}
						}
						if(bl == true){
							employees.remove(employees.toArray()[j]);
							System.out.println("\nEmployee Deleted Successfully...\n");
						}else {
							System.out.println("Employee ID doesn't Found.");
						}


					} catch (IndexOutOfBoundsException e) {
						System.out.println(e);
					}

					break;
				case 4:

					try {
						System.out.println("\nEnter Employee Id : ");
						id = sc.nextInt();
						int k = 0;
						for(; k < employees.size(); k++) {
							if (employees.get(k).getId() == id) {
								System.out.println("\nID 			: " + employees.get(k).getId());
								System.out.println("Name 		: " + employees.get(k).getName());
								System.out.println("Experience 	: " + employees.get(k).getExperience() + " Year");
								System.out.println("Age 		: " + employees.get(k).getAge());
								System.out.println("Email 		: " + employees.get(k).getEmail());
								break;
							}
						}
						if (employees.get(k).getId() != id) {
							System.out.println("Employee ID doesn't Found.");
						}


					} catch (IndexOutOfBoundsException e) {
						System.out.println("Employee ID doesn't Found."+e);
					}

					break;
				case 5:
					System.out.println("\n\nID	Name		Age	Experience	Email\n");

					for (Employees e : employees) {
						System.out.println(e.getId() + "	" + e.getName() + "	" + e.getAge() + "	" + e.getExperience() + " Year		" + e.getEmail());
					}
					break;

				default:
					System.out.println("Invalid Choice...");
			}

			System.out.println("\nDo you want to continue then press y otherwise n... ");
			ch = sc.next().charAt(0);
			System.out.println("\n");
		}while(ch =='y');
		
		System.out.println("\nThank you for Using Employee Data Operations...");
	}
}
