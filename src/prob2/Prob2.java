package prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob2 {
	private static final int ARRAY_LENGTH = 5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.println( ARRAY_LENGTH + "개의 숫자를 입력하세요." );
		int intArray[] = new int[ARRAY_LENGTH];
		double sum = 0;
		for(int i = 0 ; i < ARRAY_LENGTH; i++) {
			try {
				intArray[i] = scanner.nextInt();
			}catch(InputMismatchException ime) {
				System.out.println("잘못된 입력값입니다.");
				System.exit(-1);
			}
			sum += (double)intArray[i];
		}
		System.out.println("평균은 " + (sum / ARRAY_LENGTH) + " 입니다.");
		scanner.close();
	}
}
