package structure.decorator.example1;

/**
 * Component implementation
 * @author big
 *
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}

}
