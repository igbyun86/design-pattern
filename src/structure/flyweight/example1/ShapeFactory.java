package structure.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 * 한번 생성된 객체는 공유객체에 담기고
 * 재 호출되는 경우 공유객체에서 꺼내 사용한다.
 * @author big
 *
 */
public class ShapeFactory {

	private static final Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

	public static Shape getShape(ShapeType type) {
		Shape shapeImpl = shapes.get(type);
		
		if (shapeImpl == null) {
			if (ShapeType.OVAL_FILL == type) {
				shapeImpl = new Oval(true);
			}
			else if (ShapeType.OVAL_NOFILL == type) {
				shapeImpl = new Oval(false);
			}
			else if (ShapeType.LINE == type) {
				shapeImpl = new Line();
			}
			
			shapes.put(type, shapeImpl);
		}
		
		return shapeImpl;
	}
	
	
	public static enum ShapeType {
		OVAL_FILL,
		OVAL_NOFILL,
		LINE
	}
}
