package Assignment6;

public class BankExample {
	public static void main(String[] args) {
		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steveAccount = new CheckingAccount(4000);
		
		try{
			tonyAccount.transfer(5000, steveAccount);
			System.out.println("송금완료");
		}catch (NullPointerException e){
			System.out.println("해당하는 계좌x");
			System.out.println("송금실패");
		}catch (IllegalArgumentException e){
			System.out.println("해당 금액을 보낼 수 없습니다.");
			System.out.println("송금실패");
		}
		
		try {
			tonyAccount.transfer(2000, null);
			System.out.println("송금 성공");
		} catch (NullPointerException e) {
			System.out.println("해당계좌 x");
			System.out.println("송금실패");
		} catch (IllegalArgumentException e)	{
		System.out.println("해당금액 보내기 x");
			System.out.println("송금실패");
		}
		
	}
}
