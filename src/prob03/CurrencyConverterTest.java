package prob03;

public class CurrencyConverterTest {
	private static double rate = 1121;
	public static void main(String[] args) {
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러입니다.");
		System.out.println("백달러는 " + CurrencyConverter.toKRW(100) + "원입니다.");
	}
}
