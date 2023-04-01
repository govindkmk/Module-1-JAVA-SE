class AreasOverloading{
	
	public void area(int a){
		int areaOfSquare = a * a;
		System.out.println("Area of Square is : "+areaOfSquare);
	}
	
	public void area(int length, int width){
		int areaOfRectangle = length * width;
		System.out.println("Area of Rectangle is : "+areaOfRectangle);
	}
	
	public void area(double r){
			double pi = 3.17;
			double areaOfCircle = pi * (r * r);
			System.out.println("Area of Circle is : "+String.format("%.2f",areaOfCircle));
	}
	
	public static void main(String[] args){
		AreasOverloading ar = new AreasOverloading();
		ar.area(22);
		ar.area(54, 56);
		ar.area(22.44);
	
	}

}