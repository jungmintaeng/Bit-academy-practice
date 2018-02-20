package practice01;

public class Prob05 {

	public static void main(String[] args) {
		String value;
		int count;
		for(int i = 1 ; i < 100; i++) {
			count = 0;
			value = String.valueOf(i);
			for(int j = 0; j < value.length(); j++) {
				if(value.charAt(j) == '3' 
						|| value.charAt(j) == '6' 
						|| value.charAt(j) == '9')
					count++;
			}
			if(count < 1)
				continue;
			System.out.print(i + " ");
			for(int j = 0 ; j < count; j++)
				System.out.print("짝");
			System.out.println();
		}
	}

}
