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

	// shape 추가
	public void add(Shape s) {
		shapes.add(s);
	}
	
	// shape 삭제
	public void remove(Shape s) {
		shapes.remove(s);
	}
	
	// 모든 shape 삭제
	public void clear() {
		System.out.println("Clearing all shapes from drawing");
		shapes.clear();
	}
}
