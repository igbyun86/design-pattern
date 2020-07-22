package behavior.strategy.example1;

/**
 * concrete class
 * @author big
 *
 */
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}
	
	/**
	 * 입력받은 정보로 결제처리
	 */
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit/debit card.");
	}

}
