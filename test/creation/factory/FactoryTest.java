package creation.factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import creation.factory.example1.Computer;
import creation.factory.example1.ComputerFactory;

/**
 * Factory Design Pattern Examples in JDK
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * 
 * Calendar class�� super class�̰� 
 * subclass�� GregorianCalendar class�� �ִ�.
 * 
 * @author big
 *
 */
public class FactoryTest {

	@Test
	public void computerFactoryTest() {
		Computer pc = ComputerFactory.getComputer("PC", "16GB", "1TB", "2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "32GB", "10TB", "3.2GHz");
		
		Assert.assertNotNull(pc);
		Assert.assertNotNull(server);
		
		System.out.println("Factory PC Config : " + pc.toString());
		System.out.println("Factory Server Config : " + server.toString());
		
		Calendar c = Calendar.getInstance();
		Assert.assertTrue(c instanceof GregorianCalendar);
		
	}
}
