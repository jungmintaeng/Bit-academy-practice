package prob03;

public class Dropship extends Unit implements Flyable{
	/**
	 * Constructor
	 */
	
	public Dropship(String name, String species, int hp, int power) {
		super(name, species, hp, power);
	}
	
	/**
	 * methods
	 */

	@Override
	public void fly() {
		System.out.println("Dropship is flying!!");
	}

	@Override
	public void move(int x, int y) {
		fly();
	}
	
	public void load() {
		/* 선택된 대상을 태운다.*/ 
	}
	
	public void unload() {
		/* 선택된 대상을 내린다.*/ 
	}
}
