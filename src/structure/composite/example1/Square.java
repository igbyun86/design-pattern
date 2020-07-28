package structure.composite.example1;

/**
 * Leaf object
 * @author big
 *
 */
public class Square implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Square with color " + fillColor);
	}

}
