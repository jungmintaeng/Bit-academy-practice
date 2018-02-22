package prob06;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	/**
	 * Constructor
	 */
	
	public RectTriangle(double w, double h) {
		width = w;
		height = h;
	}
	
	/**
	 * methods
	 */

	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}
}
