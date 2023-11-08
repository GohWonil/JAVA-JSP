package example;

public class Cylinder {

	Circle a;
	double height;
	
	public double Volum() {
		return a.getArea() * height;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		double height = 5.6;
		
		System.out.println(c.getArea()*height);
		
	}

}
