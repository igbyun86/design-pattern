package behavior.visitor.example1;

/**
 * visitor interface
 * @author big
 *
 */
public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
