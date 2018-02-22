package prob03;

public class Tank extends Unit implements Upgradable{
	/**
	 * Constructor
	 */
	
	public Tank(String name, String species, int hp, int power) {
		super(name, species, hp, power);
	}

	/**
	 * methods
	 */
	
	@Override
	public void move(int x, int y) {
		System.out.println("Tank moves forward!");
	}

	@Override
	public void upgrade(int upgradeCode) {
		//코드에 따라 공업 방업
	}
}
