package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		if(text.length() == 0) {
			scanner.close();
			return;
		}
		int length = 1;
		for(int i = 0 ; i < text.length(); i++) {
			for(int j = 0; j < text.length() && j < length; j++)
				System.out.print(text.charAt(j));
			length++;
			System.out.println();
		}
		
		scanner.close();
	}
}