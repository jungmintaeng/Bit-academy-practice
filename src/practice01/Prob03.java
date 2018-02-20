package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner( System.in );
		int number = scanner.nextInt();
		
		int result = 0;
		
		if(number % 2 == 0) { //짝수
			for(int i = 0 ; i <= number; i += 2)
				result += i;
		}else { //홀수
			for(int i = 1 ; i <= number; i += 2)
				result += i;
		}
		
		System.out.println("결과 값 : " + result);
		
		scanner.close();
	}

}
