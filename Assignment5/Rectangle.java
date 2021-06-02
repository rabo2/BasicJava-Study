package Assignment5;

public class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return Math.round(width*height*100)/100.0;
	}
	@Override
	public double perimeter() {
		return Math.round(2*(width+height)*100)/100.0;
	}
	@Override
	public String toString() {
		return String.format("도형의 종류 : 사각형, 둘레: %s㎝, 넓이: %s㎠",perimeter(),area());
	}
	
}