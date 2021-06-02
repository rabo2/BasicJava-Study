package Assignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

import chapter4.Exceoption;

public class Divide {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("어떤 수로 나누시겠습니까>>");
				int inputNum = scanner.nextInt();

				System.out.print("어떤 수를 나누시겠습니까>>");
				int diviedNum = scanner.nextInt();
				System.out.println(inputNum + "/" + diviedNum + "=" + inputNum / diviedNum);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			} catch (ArithmeticException e)	{
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				continue;
				
			}
		}
	}
}
