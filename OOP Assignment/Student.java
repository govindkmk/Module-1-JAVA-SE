class Student{
	private static int id;
	private String name;
	private int age;
	
	public void setID(int id){
		this.id = id;
	}
	public int getID(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public static void main(String[] args){
		
		Student st1 = new Student();
		st1.setID(1001);
		st1.setName("Govind Kumar");
		st1.setAge(20);
		
		System.out.println("ID	: "+st1.getID());
		System.out.println("Name	: "+st1.getName());
		System.out.println("Age	: "+st1.getAge());
		
		System.out.println("\n");
		
		Student st2 = new Student();
		st2.setID(1002);
		st2.setName("Suleman Serai");
		st2.setAge(21);
		
		System.out.println("ID	: "+st2.getID());
		System.out.println("Name	: "+st2.getName());
		System.out.println("Age	: "+st2.getAge());
		
		System.out.println("\n");
		
		Student st3 = new Student();
		st3.setID(1003);
		st3.setName("Tushar Lakhani");
		st3.setAge(22);
		
		System.out.println("ID	: "+st3.getID());
		System.out.println("Name	: "+st3.getName());
		System.out.println("Age	: "+st3.getAge());
		
		System.out.println("\n");
		
		Student st4 = new Student();
		st4.setID(1004);
		st4.setName("Ahmed Qazi");
		st4.setAge(21);
		
		System.out.println("ID	: "+st4.getID());
		System.out.println("Name	: "+st4.getName());
		System.out.println("Age	: "+st4.getAge());
		
		System.out.println("\n");
		
		Student st5 = new Student();
		st5.setID(1005);
		st5.setName("Saifullah Korai");
		st5.setAge(20);
		
		System.out.println("ID	: "+st5.getID());
		System.out.println("Name	: "+st5.getName());
		System.out.println("Age	: "+st5.getAge());
	
	}
}