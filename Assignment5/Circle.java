package Assignment5;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.round(Math.PI*Math.pow(this.radius, 2)*100)/100.0;
	}@Override
	public double perimeter() {
		return Math.round(2*Math.PI*this.radius*100)/100.0;
	}
	@Override
	public String toString() {
		return String.format("도형의 형태: 원, 둘레: %s㎝, 넓이: %s㎠",perimeter(),area());
	}
	
	
}
