package creation.factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import creation.factory.example1.Computer;
import creation.factory.example1.ComputerFactory;

/**
 * Factory Design Pattern Examples in JDK
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * 
 * Calendar class는 super class이고 
 * subclass로 GregorianCalendar class가 있다.
 * 
 * @author big
 *
 */
public class FactoryTest {

	@Test
	public void computerFactoryTest() {
		Computer pc = ComputerFactory.getComputer("PC", "16GB", "1TB", "2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "32GB", "10TB", "3.2GHz");
		
		Assertions.assertNotNull(pc);
		Assertions.assertNotNull(server);
		
		System.out.println("Factory PC Config : " + pc.toString());
		System.out.println("Factory Server Config : " + server.toString());
		
		Calendar c = Calendar.getInstance();
		Assertions.assertTrue(c instanceof GregorianCalendar);
		
	}
}
