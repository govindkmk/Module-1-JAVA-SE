package CRUD_using_ArrayList;

public class Employees {
    private int id, age, experience;
    private String name, email;

    public void display(){
        System.out.print("1. Add Employee\n");
        System.out.print("2. Update Employee\n");
        System.out.print("3. Delete Employee\n");
        System.out.print("4. Get Employees by ID \n");
        System.out.print("5. Get all Employees\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
