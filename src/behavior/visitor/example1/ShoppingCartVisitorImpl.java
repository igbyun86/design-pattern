package behavior.visitor.example1;

/**
 * concrete visitor class
 * 항목별 로직 구성
 * 로직이 변경되거나 추가되는 경우 해당 visitor class만 변경하면 된다.
 * @author big
 *
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		cost = book.getPrice();
		
		// apply 5$ discount if book price is greater than 50
		if (book.getPrice() > 50) {
			cost -= 5;
		}
		
		System.out.println("Book ISBN : " + book.getIsbnNumber() + " cost = " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeigth();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}
