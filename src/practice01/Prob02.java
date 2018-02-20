package practice01;

public class Prob02 {

	public static void main(String[] args) {
		int startNum = 1;
		for(int i = 0 ; i < 9; i++) {
			for(int j = startNum; j < startNum + 10; j++)
				System.out.print(j + " ");
			System.out.println();
			startNum++;
		}
	}

}
