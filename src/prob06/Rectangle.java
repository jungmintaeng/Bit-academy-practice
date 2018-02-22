package prob06;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	/**
	 * Constructor
	 */
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	/**
	 * methods
	 */

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
	
}
