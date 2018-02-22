package prob06;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Shape rect = new Rectangle(5,6);
		Shape rectri = new RectTriangle(6,2);
		
		shapes.add(rect);
		shapes.add(rectri);
		
		for(Shape shape : shapes) {
			System.out.println("area :   " + shape.getArea());
			System.out.println("perimeter :   " + shape.getPerimeter());
			if(shape instanceof Resizable) {
				((Resizable) shape).resize(0.5);
				System.out.println("new area :   " + shape.getArea());
				System.out.println("new perimeter :   " + shape.getPerimeter());
			}
		}
	}
}
