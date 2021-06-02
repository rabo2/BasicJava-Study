package Assignment3;

public class Time {
	private int hour;
	private int minute;
	private int second;

	Time() {
	}
	
	Time(int hour, int minute, int second) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public String toString() {
	// %02d = 2자리숫자로 채우고 10의자리 수가 없으면 0으로 채워라.
		return String.format("%02d:%02d:%02d",this.hour,this.minute,this.second);
	}
}
