package baseball;

import java.util.Scanner;

public class BaseBall {
	
	int strike = 0;
	int ball = 0;
	int[] com = new int[3];
	int[] user = new int[3];
	
	
	public BaseBall(){
		strike = 0;
		ball = 0;
	}
	
	
	
	
	public void makingNum() {
		
		while (true) {

			for (int j = 0; j <= 2; j++) {
				com[j] =(int)(Math.random() * 10);// random 함수는 double 반환 하기 때문에 int형으로 typecasting
													
			}
			if (com[0] != com[1] && com[1] != com[2] && com[2] != com[0])
				break;
		}

	}
	
	
	public void userNum() throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			user[i] = sc.nextInt();
			
			if (user[i] < 0 || user[i] > 9) {
				throw new Exception("0~9 사이의 숫자를 입력하세요");
			}
		}

	}
	
	
	public void checkingNum(){
		  
			for(int i=0; i<3; i++)
	        {
	            for(int j=0; j<3; j++)
	            {
	                if((com[i] == user[j])){
	                	if(i==j){
	                		strike += 1;
	                	}else{
	                		ball += 1;
	                	}
	            	
	                }
	            }        
	        }System.out.println("Strike /// Ball /// OUT");
	         System.out.printf("%d        %d" ,strike,ball);
		 }
	
	
	
}
