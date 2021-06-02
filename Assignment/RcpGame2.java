package Assignment;

public class RcpGame2 {

	public static void gameResult(String result) {
		System.out.println(result);
	}
	
	public static void game(String chulSoo, String youngHee) {
		
		switch (chulSoo) {
		case "가위" :
			switch(youngHee) {
			case "가위": gameResult("무승부");
			break;	
			case "바위": gameResult("영희 승리");
			break;
			case "보": gameResult("철수 승리");
			break;
			}
			break;
		case "바위" :
			switch(youngHee) {
			case "가위": gameResult("철수 승리");
			break;
			case "바위" : gameResult("무승부");
			break;
			case "보":gameResult("영희 승리");
			break;
			}
			break;
		case "보" :
			switch(youngHee) {
			case "가위":gameResult("영희 승리");
			break;
			case "바위":gameResult("철수 승리");
			break;
			case "보":gameResult("무승부");
			break;
			}
		}

	}
}
