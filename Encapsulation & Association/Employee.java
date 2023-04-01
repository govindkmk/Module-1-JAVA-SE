class Employee{
	private int iD;
	private String fName;
	private String lName;
	private EmpHireDate hireDate;
	
	public void setID(int iD){
		this.iD = iD;
	}
	public int getID(){
		return this.iD;
	}
	
	public void setFName(String fName){
		this.fName = fName;
	}
	public String getFName(){
		return this.fName;
	}
	
	public void setLName(String lName){
		this.lName = lName;
	}
	public String getLName(){
		return this.lName;
	}
	
	public void setHireDate(EmpHireDate hireDate){
		this.hireDate = hireDate;
	}
	public EmpHireDate getHireDate(){
		return this.hireDate;
	}
	
	
	
	public static void main(String[] args){
		
		Employee emp = new Employee();
		
		emp.setID(35);
		emp.setFName("Govind");
		emp.setLName("Kumar");
		
		EmpHireDate emphd = new EmpHireDate();
		emphd.setMonth("October");
		emphd.setDay(16);
		emphd.setYear(2023);
		
		emp.setHireDate(emphd);
		
		System.out.println("ID: " +emp.getID());
		System.out.println("First Name: " +emp.getFName());
		System.out.println("Last Name: " +emp.getLName());
		System.out.println("Hire Date: "  +emp.getHireDate().getDay()+ " " +emp.getHireDate().getMonth()+ "," +emp.getHireDate().getYear());
		
	}

}
