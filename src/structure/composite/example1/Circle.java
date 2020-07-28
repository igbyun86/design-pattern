package structure.composite.example1;

/**
 * Leaf object
 * @author big
 *
 */
public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}

}