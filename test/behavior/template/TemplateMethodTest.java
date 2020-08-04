package behavior.template;

import org.junit.Test;

import behavior.template.example1.GlassHouse;
import behavior.template.example1.HouseTemplate;
import behavior.template.example1.WoodenHouse;

/**
 * Template method ����
 * ������ ����Ǿ� �ϰų� Ư�� �κи� �����Ͽ� ����� �� 
 * super class���� sub class�� ȣ��
 * sub class���� override���� �������� final�� ����
 * @author big
 *
 */
public class TemplateMethodTest {

	@Test
	public void buildTest() {
		HouseTemplate houseType = new WoodenHouse();
		
		//template method ���
		houseType.buildHouse();
		
		System.out.println("=============================");
		
		houseType = new GlassHouse();
		houseType.buildHouse();
		
	}
}
