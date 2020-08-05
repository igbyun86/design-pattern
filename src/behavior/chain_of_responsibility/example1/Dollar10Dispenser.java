package behavior.chain_of_responsibility.example1;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			
			
			if (remainder != 0) {
				if (this.chain == null) {
					try {
						this.chain.dispense(new Currency(remainder));
					}
					catch (Exception e) {
						System.out.println("더이상 나눌수 없습니다.");
					}
				}
			}
		}
		else {
			this.chain.dispense(currency);
		}
	}

}
