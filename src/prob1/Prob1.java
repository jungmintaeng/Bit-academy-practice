package prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "금액:" );
		int money = -1;
		try {
			money = scanner.nextInt();
		}catch(InputMismatchException ime) {
			System.out.println("잘못된 입력값입니다.");
			System.exit(-1);
		}
		
		System.out.println("50000원 : " + (money / 50000) + "개");
		money -= 50000 * (money / 50000);
		
		System.out.println("10000원 : " + (money / 10000) + "개");
		money -= 10000 * (money / 10000);
		
		System.out.println("5000원 : " + (money / 5000) + "개");
		money -= 5000 * (money / 5000);
		
		System.out.println("1000원 : " + (money / 1000) + "개");
		money -= 1000 * (money / 1000);
		
		System.out.println("500원 : " + (money / 500) + "개");
		money -= 500 * (money / 500);
		
		System.out.println("100원 : " + (money / 100) + "개");
		money -= 100 * (money / 100);
		
		System.out.println("50원 : " + (money / 50) + "개");
		money -= 50 * (money / 50);
		
		System.out.println("10원 : " + (money / 10) + "개");
		money -= 10 * (money / 10);
		
		System.out.println("5원 : " + (money / 5) + "개");
		money -= 5 * (money / 5);
		
		System.out.println("1원 : " + (money / 1) + "개");
		
		scanner.close();
 	}
}