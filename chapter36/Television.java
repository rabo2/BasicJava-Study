package chapter36;

public class Television implements RemoteControl,Searchable {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public void search(String word) {
		System.out.println(word + "의 검색결과입니다.");
	}
}
