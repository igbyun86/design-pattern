package creation.builder;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
									
		Assertions.assertEquals("1TB", computer.getHDD());
		Assertions.assertEquals(true, computer.isGraphicsCardEnabled());
		Assertions.assertEquals(false, computer.isBluetoothEnabled());
									
	}
}
