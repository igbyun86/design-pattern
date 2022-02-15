package behavior.template;

import org.junit.Test;

import behavior.template.example1.GlassHouse;
import behavior.template.example1.HouseTemplate;
import behavior.template.example1.WoodenHouse;

/**
 * Template method 패턴
 * 순서가 보장되야 하거나 특정 부분만 변경하여 사용할 때 
 * super class에서 sub class를 호출
 * sub class에서 override하지 않으려면 final로 선언
 * @author big
 *
 */
public class TemplateMethodTest {

	@Test
	public void buildTest() {
		HouseTemplate houseType = new WoodenHouse();
		
		//template method 사용
		houseType.buildHouse();
		
		System.out.println("=============================");
		
		houseType = new GlassHouse();
		houseType.buildHouse();
		
	}
}
