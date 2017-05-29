package baseball;

import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args) {
		BaseBall baseball = new BaseBall();

		baseball.makingNum();
		System.out.println(baseball.com[0]);
		System.out.println(baseball.com[1]);
		System.out.println(baseball.com[2]);
		
		outer_loop:
		while (true) {
			try {
				while (true) {
					System.out.println("3가지 숫자를 입력하세요");
					baseball.userNum();
					baseball.checkingNum();

					if (baseball.strike == 3) {
						System.out.println("\nYOU WIN");
						break outer_loop;
					} else if (baseball.out == 9) {
						System.out.println("\nYOU LOSE");
						break outer_loop;
					}
					baseball.strike = 0;
					baseball.ball = 0;

				}

			} catch (InputMismatchException e) {
				System.out.println("오류발생 : 숫자를 입력하세요");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}