package Assignment;

public class season{
	public static void chooseSeason(int month) {
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월 은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월 은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월 은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월 은 겨울입니다.");
			break;
		default:
			System.out.println(month + "월 은 잘못된 입력입니다.");
		}
		
	
	}
}