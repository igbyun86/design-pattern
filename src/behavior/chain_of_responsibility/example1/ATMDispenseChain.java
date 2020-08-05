package behavior.chain_of_responsibility.example1;

public class ATMDispenseChain {
	
	private DispenseChain chain; 
	
	public ATMDispenseChain() {
		this.chain = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();
		
		this.chain.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}
	
	public void excute(int amount) {
		chain.dispense(new Currency(amount));
	}
}
