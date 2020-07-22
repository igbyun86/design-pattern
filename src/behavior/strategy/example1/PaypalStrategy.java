package behavior.strategy.example1;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	/**
	 * �Է¹��� ������ ����ó��
	 */
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}