package activity;

public abstract class Shape {

	public String color;


	public Shape() {
	}

	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	abstract double CalculateArea();

	abstract double calculatePerimeter();


	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}


	//public static void main(String[] args) {
//		System.out.println("Area is: ");
//		System.out.println("Perimeter is: ");
//	}
}