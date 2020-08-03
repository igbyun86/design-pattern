package structure.decorator.example1;

/**
 * Concreate decorator
 * @author big
 *
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
	
	

}
