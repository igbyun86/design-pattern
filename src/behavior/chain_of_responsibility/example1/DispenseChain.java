package behavior.chain_of_responsibility.example1;

/**
 * base interface
 * @author big
 *
 */
public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispanse(Currency currency);
}
