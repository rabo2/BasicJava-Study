package Assignment5;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return Math.round(Math.sqrt(3) / 4 * Math.pow(side, 2) * 100) / 100.0;
	}

	@Override
	public double perimeter() {
		return Math.round(this.side * 3 * 100) / 100.0;
	}

	@Override
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %s㎝, 넓이: %s㎠", perimeter(), area());
	}
}
