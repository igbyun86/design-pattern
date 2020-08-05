package behavior.chain_of_responsibility.example1;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispanse(Currency currency) {
		if (currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			
			if (remainder != 0) {
				this.chain.dispanse(new Currency(remainder));
			}
		}
		else {
			this.chain.dispanse(currency);
		}
	}

}
