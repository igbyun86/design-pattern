package creation.builder;

import org.junit.Assert;
import org.junit.Test;

import creation.builder.example1.Computer;

/**
 * Builder Design Pattern Example in JDK
 * StringBuilder.append()
 * StringBuffer.append()
 * @author big
 *
 */
public class BuilderTest {
	
	@Test
	public void computerBuilderTest() {
		Computer computer = new Computer.ComputerBuilder("1TB", "2.4GHz","16GB")
										.setGraphicsCardEnabled(true)
										.build();
									
		Assert.assertEquals("1TB", computer.getHDD());
		Assert.assertEquals(true, computer.isGraphicsCardEnabled());
		Assert.assertEquals(false, computer.isBluetoothEnabled());
									
	}
}
