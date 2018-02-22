package prob04;

public class Depart extends Employee{
	private String department;
	
	/**
	 * Constructors
	 */
	
	public Depart() {
		
	}
	
	public Depart(String name, int salary) {
		super(name, salary);
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	/**
	 * getter-setter
	 */
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Methods
	 */
	
	@Override
	public void getInformation() {
		System.out.printf("이름: %s   연봉: %d  부서 : %s\n", getName(), getSalary(), department);
	}
}
