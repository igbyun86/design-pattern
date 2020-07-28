package structure.composite.example1;

/**
 * Leaf object
 * @author big
 *
 */
public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color " + fillColor);
	}

}
