package structure.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 * �ѹ� ������ ��ü�� ������ü�� ����
 * �� ȣ��Ǵ� ��� ������ü���� ���� ����Ѵ�.
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
