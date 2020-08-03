package structure.decorator.example1;

/**
 * Decorator
 * @author big
 *
 */
public class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c) {
		this.car = c;
	}
	
	@Override
	public void assemble() {
		car.assemble();
	}

}
