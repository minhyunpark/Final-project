package baseball;

import java.util.Scanner;

public class BaseBall {

	int strike;
	int ball;
	int out;
	int[] com = new int[3];
	int[] user = new int[3];

	public BaseBall() {
		strike = 0;
		ball = 0;
		out = 0;
	}

	public void makingNum() {

		while (true) {

			for (int j = 0; j <= 2; j++) {
				com[j] = (int) (Math.random() * 9) + 1;// typecasting

			}
			if (com[0] != com[1] && com[1] != com[2] && com[2] != com[0])
				break;
		}

	}

	public void userNum() throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			user[i] = sc.nextInt();

			if (user[i] < 1 || user[i] > 9) {
				throw new Exception("오류발생 : 1~9 사이의 숫자를 입력하세요");
			}
		}
		if (user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
			throw new Exception("오류발생 : 서로 다른 숫자를 입력하세요");
		}

	}

	public void checkingNum() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((com[i] == user[j])) {
					if (i == j) {
						strike += 1;
					} else {
						ball += 1;
					}

				}
			}
		}
		out += 1;
		System.out.printf("Strike /// Ball /// OUT(%d chance left)\n", 9 - out);
		System.out.printf("%d        %d        %d\n", strike, ball, out);

	}

}
