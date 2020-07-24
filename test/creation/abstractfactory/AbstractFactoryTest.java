package creation.abstractfactory;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import creation.abstractfactory.example1.Computer;
import creation.abstractfactory.example1.ComputerFactory;
import creation.abstractfactory.example1.PCFactory;
import creation.abstractfactory.example1.ServerFactory;

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
	public void ComputerAbstractFactoryTest() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "1TB", "2.4GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "10TB", "3.2GHz"));
		
		Assertions.assertNotNull(pc);
		Assertions.assertNotNull(server);
		
		System.out.println("AbstractFactory PC Config : " + pc.toString());
		System.out.println("AbstractFactory Server Config : " + server.toString());
		
	}
}
