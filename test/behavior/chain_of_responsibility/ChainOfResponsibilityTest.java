package behavior.chain_of_responsibility;

import org.junit.Test;

import behavior.chain_of_responsibility.example1.ATMDispenseChain;

/**
 * Chain of Responsibility Pattern Examples in JDK
 * java.util.logging.Logger#log()
 * javax.servlet.Filter#doFilter()
 * 
 * @author big
 *
 */
public class ChainOfResponsibilityTest {

	@Test
	public void currencyDispenseTest() {
		ATMDispenseChain chain = new ATMDispenseChain();
		chain.excute(483);
	}
}
