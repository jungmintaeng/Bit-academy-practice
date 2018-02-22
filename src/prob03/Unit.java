package prob03;

public abstract class Unit {
	private String name;
	private String species;
	private int hp;
	private int power;
	private int armor;
	private int x,y;
	
	/**
	 * Constructor
	 */
	public Unit(String name, String species, int hp, int power) {
		this.name = name;
		this.species = species;
		this.hp = hp;
		this.power = power;
	}
	
	/**
	 * getter - setter
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * methods
	 */
	
	/**
	 * 공중유닛과 지상유닛은 move하는 방법이 다름 ex)직선, 길 고려 등
	 * @param x
	 * @param y
	 */
	public abstract void move(int x, int y);
	
	public void stop() {
		//멈춤
	}
}
