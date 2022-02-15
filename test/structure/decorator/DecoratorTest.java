package structure.decorator;

import org.junit.Test;

import structure.decorator.example1.BasicCar;
import structure.decorator.example1.Car;
import structure.decorator.example1.LuxuryCar;
import structure.decorator.example1.SportsCar;

/**
 * Decorator 패턴은 런타임시에 필요에 따라 기능을 확장할 수 있다.
 * Decorator 패턴은 Java IO class에서 많이 사용된다.
 * ex) FileReader, BufferedReader...
 * @author big
 *
 */
public class DecoratorTest {

	@Test
	public void carTest() {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("\n====================");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		
		
		/*
		 => print
		 	Basic Car. Adding features of Sports Car.
			====================
			Basic Car. Adding features of Luxury Car. Adding features of Sports Car.
		 */
	}
}
