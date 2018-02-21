package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		Goods [] goods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		String good;
		String[] split;
		for(int i = 0 ; i < COUNT_GOODS; i++) {
			good = scanner.nextLine();
			split = good.split(" ");
			try {
				goods[i] = new Goods(split[0], 
						Integer.parseInt(split[1]), 
						Integer.parseInt(split[2]));
			}catch(IndexOutOfBoundsException iobex) {
				System.out.println("잘못된 입력입니다.");
				System.exit(-1);
			}catch(NumberFormatException nfex) {
				System.out.println("잘못된 입력입니다.");
				System.exit(-1);
			}
		}
		for(int i = 0 ; i < 3; i++)
			goods[i].show();
		scanner.close();
	}
}