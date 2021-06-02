package chapter36;

public class RemoteControlExam {
	public static void main(String[] args) {
		RemoteControl audio = new Audio();
		audio.turnOff();
		audio.turnOn();
		RemoteControl tv = new Television();
		tv.turnOff();
		tv.turnOn();
		tv.setVolume(20);
		tv.setMute(true);
		RemoteControl.chageBettery();
		
		
	}
}
