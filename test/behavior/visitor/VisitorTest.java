package behavior.visitor;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import behavior.visitor.example1.Book;
import behavior.visitor.example1.Fruit;
import behavior.visitor.example1.ItemElement;
import behavior.visitor.example1.ShoppingCartVisitor;
import behavior.visitor.example1.ShoppingCartVisitorImpl;

public class VisitorTest {

	@Test
	public void shoppingTest() {
		ItemElement[] items = new ItemElement[4];
		items[0] = new Book(20, "1234");
		items[1] = new Book(100, "5678");
		items[2] = new Fruit(10, 2, "Orange");
		items[3] = new Fruit(5, 5, "Apple");
		
		int total = calculatePrice(items);
		Assertions.assertEquals(160, total);
	}
	
	private int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		
		return sum;
	}
	
}
