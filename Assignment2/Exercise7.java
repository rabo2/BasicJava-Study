package Assignment2;

import java.util.Random;
import java.util.Scanner;

class Game {
	static String[] computer = { "가위", "바위", "보" };
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public void rspGame() {
		int ranNum = this.random.nextInt(3);
		String com = computer[ranNum];
		System.out.print("가위 바위 보를 입력하세요 : ");
		String user = scanner.next();
		String result = "";
		if (user.equals(com)) {
			result = "무승부!";
		} else if ((user.equals("가위") && com.equals("보")) 
				|| (user.equals("바위") && com.equals("가위"))
				|| (user.equals("보") && com.equals("바위"))) {
			result = "게이머 승리!";
		} else {
			result = "인공지능 승리!";
		}
		System.out.println("게이머 : "+user);
		System.out.println("인공지능 컴퓨터 : "+com);
		System.out.println("결과 : "+result);
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		Game game = new Game();
		game.rspGame();
	}
}
