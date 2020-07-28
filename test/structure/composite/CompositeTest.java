package structure.composite;

import org.junit.Test;

import structure.composite.example1.Circle;
import structure.composite.example1.Drawing;
import structure.composite.example1.Shape;
import structure.composite.example1.Square;
import structure.composite.example1.Triangle;

/**
 * 여러개의 객체가 하나의 객체처럼 동작해야하는 경우 사용할 수 있다.
 * 트리와 같은 구조를 만들수 있다.
 * @author big
 *
 */
public class CompositeTest {
	
	@Test
	public void drawingTest() {
		Shape triangle1 = new Triangle();
		Shape triangle2 = new Triangle();
		Shape cirle = new Circle();
		Shape square = new Square();
		
		Drawing drawing = new Drawing();
		drawing.add(triangle1);
		drawing.add(triangle2);
		drawing.add(cirle);
		
		drawing.draw("Red");
		
		System.out.println();
		drawing.clear();
		System.out.println();
		
		drawing.add(triangle2);
		drawing.add(cirle);
		drawing.add(square);
		
		drawing.draw("Blue");
		
	}

}
