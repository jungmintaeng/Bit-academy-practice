package prob03;

public class Marine extends Unit implements Upgradable{
	/**
	 * Constructor
	 */
	
	public Marine(String name, String species, int hp, int power) {
		super(name, species, hp, power);
	}
	
	/**
	 * methods
	 */

	@Override
	public void move(int x, int y) {
		System.out.println("Marine Runs!!");
	}

	@Override
	public void upgrade(int upgradeCode) {
		//코드에 따라 공업 방업 사업
	}
	
	public void stimPack() {
		
	}
}
