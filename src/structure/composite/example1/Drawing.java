package structure.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite object
 * @author big
 *
 */
public class Drawing implements Shape {

	//collection of Shapes
	private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		for (Shape shape : shapes) {
			shape.draw(fillColor);
		}
	}

	// shape �߰�
	public void add(Shape s) {
		shapes.add(s);
	}
	
	// shape ����
	public void remove(Shape s) {
		shapes.remove(s);
	}
	
	// ��� shape ����
	public void clear() {
		System.out.println("Clearing all shapes from drawing");
		shapes.clear();
	}
}
