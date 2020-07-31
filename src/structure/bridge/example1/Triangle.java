package structure.bridge.example1;


/**
 * implementation class
 * @author big
 *
 */
public class Triangle extends Shape {

	
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		super.color.applyColor();
	}

}
