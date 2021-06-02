package Assignment5;

abstract class Shape implements Comparable<Shape> {

	abstract double area();

	abstract double perimeter();

	@Override
	public int compareTo(Shape shape) {
		if(area()==shape.area()) {
			return 0;
		}else if (area() > shape.area()) {
			return 1;
		}else {
			return -1;
		}
	}
}