package baseball;

import java.util.InputMismatchException;

public class Test {

	public static void main(String[] args)  {
		BaseBall baseball = new BaseBall();

		try {
			baseball.makingNum();
			System.out.println(baseball.com[0]);
			System.out.println(baseball.com[1]);
			System.out.println(baseball.com[2]);

			
			  while(true){
			baseball.userNum(); baseball.checkingNum();
			  if(baseball.strike ==3){ break; }
			  
			  
			  }
			 

		} catch (InputMismatchException   e) {
			System.out.println("숫자를 입력하세요");
		} catch(Exception e){
			System.out.println(e.toString());
		}

	}
}
