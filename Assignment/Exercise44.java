package Assignment;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String player1 = scr.next();
		String player2 = scr.next();
		
		if(player1.equals(player2)) {
			System.out.println("비김");
		}else if(player1 == "가위" && player2 =="보"
				||player1 == "바위" && player2 == "가위"
				||player1 == "보" && player2 =="바위") {
			System.out.println("철수 승리");
		}else {
			System.out.println("영희 승리");
		}
		
	}

}



// public static void gameResult(String result) {
// System.out.println(result);
// }
//
// public static void main(String[] args) {
// System.out.println("가위 바위 보 게임");
// Scanner scr = new Scanner(System.in);
//
// System.out.print("철수 : ");
// String chul = scr.next();
//
// System.out.print("영희 : ");
// String young = scr.next();
// System.out.print("결과 : ");
//
// games.game(chul, young);
// }
// }

// if (chul.equals(young)) {
// System.out.println("무승부");
// } else if (chul.equals("가위")) {
// if (young.equals("보")) {
// System.out.println("철수 승리!");
// } else {
// System.out.println("영희 승리!");
// }
// } else if (chul.equals("바위")) {
// if (young.equals("가위")) {
// System.out.println("철수 승리!");
// } else {
// System.out.println("영희 승리!");
// }
//
// } else if (chul.equals("보")) {
// if (young.equals("가위")) {
// System.out.println("철수 승리!");
// } else {
// System.out.println("영희 승리!");
// }
//
// }