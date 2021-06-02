package Assignment4;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}@Override
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	@Override
	public String toString() {
		return String.format("도형의 형태: 원, 둘레: %s, 넓이: %s", perimeter(), area());
	}
	
}
