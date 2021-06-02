package Assignment;

import java.util.Scanner;

public class RcpGame {

	public static void main(String[] args) {
		
		Scanner scr	= new Scanner(System.in);
		System.out.println("[1.가위, 2.바위,3.보]");
		System.out.print("철수 : ");
		String chulSoo = scr.next();
		System.out.print("영희 : ");
		String youngHee = scr.next();

		System.out.println("\n" + chulSoo + "vs" + youngHee + "\n");
		
		RcpGame2 setGame = new RcpGame2();
		setGame.game(chulSoo, youngHee);
		
	}
}
