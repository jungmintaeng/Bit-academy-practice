package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		//-	문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
		//-	예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.
		if(str == null)
			return null;
		int length = str.length();
		char [] output = new char[length];
		for(int i = 0; i < length; i++)
			output[i] = str.charAt(length - 1 - i);
		return output;
	}
	
	public static void printCharArray(char [] array) {
		//-	char[]을 받아들여 출력한다.
		//-	{‘!’, ‘i’, ‘H’}   배열을 파라미터로 전달하면 다음과 같이 출력된다.
		//!iH
		System.out.println(array);
	}
}
