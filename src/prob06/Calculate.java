package prob06;

public abstract class Calculate {
	int a,b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
