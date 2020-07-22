package behavior.strategy;

import org.junit.Test;

import behavior.strategy.example1.CreditCardStrategy;
import behavior.strategy.example1.Item;
import behavior.strategy.example1.PaypalStrategy;
import behavior.strategy.example1.ShoppingCart;

public class StrategyTest {

	@Test
	public void shoppingCartTest() {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234", 10000);
		Item item2 = new Item("5678", 30000);
		Item item3 = new Item("1359", 25000);
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		
		// pay by paypal
		cart.pay(new PaypalStrategy("test@test.com", "1234"));
		
		// pay by credit card
		cart.pay(new CreditCardStrategy("big", "123456789", "345", "12/22"));
		
	}
}
