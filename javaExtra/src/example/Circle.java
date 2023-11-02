package example;

public class Circle {

	public double radius;
	public static double pi = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	public double getArea() {
		return radius * radius * pi;
	}
	
}
