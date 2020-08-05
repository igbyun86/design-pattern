package behavior.chain_of_responsibility.example1;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispanse(Currency currency) {
		if (currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			
			if (remainder != 0) {
				this.chain.dispanse(new Currency(remainder));
			}
		}
		else {
			this.chain.dispanse(currency);
		}
	}

}
