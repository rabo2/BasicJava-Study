package chapter36;

//abstract class => interface
public interface RemoteControl {
	// 필드(변수)는 불가능 하지만 상수는 가능
	// public static final => 생략
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;

	// public abstract => 생략
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// JDK 1.8부터 추상메소드가 아닌 일반 메소드도 선언가능
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 모드");
		} else {
			System.out.println("음소거 해제");
		}

	}
	static void chageBettery() {
		System.out.println("건전지를 교환합니다.");
	}

}
