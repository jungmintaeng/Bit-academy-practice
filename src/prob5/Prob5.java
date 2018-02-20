package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int answer, userInput;
		String end;
		
		while(true) {
			answer = rand.nextInt(100) + 1;
			userInput = -1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			while(userInput != answer) {
				userInput = scanner.nextInt();
				if(userInput > answer) {
					System.out.println("더 낮게");
				}else if(userInput < answer){
					System.out.println("더 높게");
				}
			}
			System.out.println("맞았습니다.");
			end = "start";
			System.out.println("다시 하시겠습니까(y/n)>>");
			while(!end.equals("y") || !end.equals("n")) {
				end = scanner.nextLine();
				if(end.equals("n")) {
					scanner.close();
					System.exit(1);
				}
				else if(end.equals("y"))
					break;
			}
		}
	}
}