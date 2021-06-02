package Assignment3;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	Plane() {
		numberOfPlanes++;
	}

	Plane(String manufacturer, String model, int maxNumberOfpassengers) {
		this();
		this.manufacture = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfpassengers;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", this.manufacture, this.model, this.maxNumberOfPassengers,
				numberOfPlanes);
	}
}
