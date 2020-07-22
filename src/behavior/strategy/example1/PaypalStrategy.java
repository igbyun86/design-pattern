package behavior.strategy.example1;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	/**
	 * 입력받은 정보로 결제처리
	 */
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
