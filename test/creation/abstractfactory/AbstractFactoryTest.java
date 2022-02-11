package creation.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

import creation.abstractfactory.example1.Computer;
import creation.abstractfactory.example1.ComputerFactory;
import creation.abstractfactory.example1.PCFactory;
import creation.abstractfactory.example1.ServerFactory;
import creation.abstractfactory.example2.Application;
import creation.abstractfactory.example2.MacFactory;
import creation.abstractfactory.example2.WinFactory;

/**
 * Abstract Factory Design Pattern Examples in JDK
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 * javax.xml.xpath.XPathFactory#newInstance()
 * 
 * @author big
 *
 */
public class AbstractFactoryTest {

	@Test
	public void computerAbstractFactoryTest() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "1TB", "2.4GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "10TB", "3.2GHz"));

		Assert.assertNotNull(pc);
		Assert.assertNotNull(server);

		System.out.println("AbstractFactory PC Config : " + pc.toString());
		System.out.println("AbstractFactory Server Config : " + server.toString());
		
	}
	
	@Test
	public void applicationFactoryTest() {
		Application winApp = new Application(new WinFactory());
		Application macApp = new Application(new MacFactory());
		
		winApp.createUI();
		macApp.createUI();
		
		winApp.paint();
		macApp.paint();
	}
}
