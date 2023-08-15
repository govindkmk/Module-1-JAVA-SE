package CRUD_using_LinkedList;

public class Student {
    private int id, age;
    private String name, email, department;

    public void display(){
        System.out.print("1. Add Student\n");
        System.out.print("2. Update Student\n");
        System.out.print("3. Delete Student\n");
        System.out.print("4. Get Student by ID \n");
        System.out.print("5. Get all Student\n");
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

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {
        this.department= department;
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
