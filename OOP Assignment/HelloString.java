interface Shape{
	void printLine(String s);
}
class HelloString implements Shape{

	public void printLine(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		HelloString hs = new HelloString();
		hs.printLine("Hello Everybody");
		System.out.println("*********************");
		System.out.println("\n");
		hs.printLine("How are you");
		System.out.println("____________________");
	}
}