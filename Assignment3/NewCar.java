package Assignment3;

public class NewCar {
	private double speed;
	private String color;
	private static double MAX_SPEED = 200.0 / 1.6;

	NewCar() {

	}

	NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return this.speed = mileToKillo(this.speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		if (this.speed >= 0 && this.speed <= MAX_SPEED) {
			this.speed += killoToMile(speed);
			if (this.speed > MAX_SPEED) {
				this.speed = MAX_SPEED;
			}
			return true;
		} else {
			return false;
		}
	}

	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}

	private double killoToMile(double distance) {
		return distance / 1.6;
	}

	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", this.speed, this.color, MAX_SPEED);
	}
}
