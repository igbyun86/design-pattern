package structure.decorator;

import org.junit.Test;

import structure.decorator.example1.BasicCar;
import structure.decorator.example1.Car;
import structure.decorator.example1.LuxuryCar;
import structure.decorator.example1.SportsCar;

/**
 * Decorator ������ ��Ÿ�ӽÿ� �ʿ信 ���� ����� Ȯ���� �� �ִ�.
 * Decorator ������ Java IO class���� ���� ���ȴ�.
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
