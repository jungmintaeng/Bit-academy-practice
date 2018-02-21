package prob06;

import java.util.Scanner;
import java.util.HashMap;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		String[] split;
		Calculate cal;
		HashMap<String, Calculate> calcMap = new HashMap<>();
		
		calcMap.put("add", new Add());
		calcMap.put("sub", new Sub());
		calcMap.put("mul", new Mul());
		calcMap.put("div", new Div());
		
		while( true ) {
			input = scanner.nextLine();
			if (input.equals("quit"))
				break;
			split = input.split(" ");
			
			switch (split[1].charAt(0)) {
			case '+' :
				cal = calcMap.get("add");
				break;
			case '-' :
				cal = calcMap.get("sub");
				break;
			case '*' :
				cal = calcMap.get("mul");
				break;
			case '/' :
				cal = calcMap.get("div");
				break;
			default:
				cal = null;
			}
			
			if(cal != null) {
				cal.setValue(Integer.parseInt(split[0]), Integer.parseInt(split[2]));
				System.out.println(cal.calculate());
			}
		}
		
		scanner.close();
	}

}
