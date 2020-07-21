package creation.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	public void enumSingletonTest() {
		EnumSingleton instance = EnumSingleton.INSTANCE;
		instance.doSomething();
		Assert.assertNotNull(instance);
	}
	
}
