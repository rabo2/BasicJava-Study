package chapter35;

class TimeVO {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	// 1. 시간은 0~23시 까지이다. 매개변수에 저장된 값이 0~23로만 저장되도록
	// setHour메서드를 구현하여라.
	public void setHour(int hour) {
		if (hour >= 0) {
			this.hour += hour % 24;
			this.hour = this.hour % 24;
		}
	}

	public int getMinute() {
		return minute;
	}

	// 2. 분은 0~59분 까지이다. 매개변수에 저장된 값이 0~59로만 저장되도록
	// setMinute메서드를 구현하여라.
	// 단. 분이 60을 넘는다면 1시간을 의미하므로 시간을 추가하도록 하여라.
	public void setMinute(int minute) {
		if (minute >= 0) {
			setHour(this.hour += minute/60);
			this.minute = minute % 60;
		}
	}

	public int getSecond() {
		return this.second;
	}
	// 3. 초은 0~59초 까지이다. 매개변수에 저장된 값이 0~59로만 저장되도록
	// setSecond메서드를 구현하여라.
	// 단. 초가 60을 넘는다면 1분을 의미하므로 시간을 추가하도록 하여라.

	public void setSecond(int second) {
		if (second >= 0) {
			setMinute(this.minute += second/60);
			this.second = second % 60;
		}

	}

	@Override
	public String toString() {
		// System.out.printf();
		return String.format("TimeVO [hour=%s, minute=%s, second=%s]", hour, minute, second);
	}
	
	
//	@Override
//	  public String toString() {
//        final StringBuilder sb = new StringBuilder("현재 시각: ");
//        sb.append(hour).append("시 ");
//        sb.append(minute).append("분 ");
//        sb.append(second).append("초");
//        return sb.toString();
//    }

}