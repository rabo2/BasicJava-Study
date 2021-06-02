package Assignment3;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	public boolean speedUp(double speed) {
		if (this.speed >= 0 && this.speed <= MAX_SPEED) {
			this.speed += speed;
			if(this.speed > MAX_SPEED) {
				this.speed = MAX_SPEED;
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("Car [speed=%s, color=%s]", speed, color);
	}

}