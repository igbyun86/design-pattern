package behavior.visitor.example1;

public class Fruit implements ItemElement {

	private int pricePerKg;
	private int weigth;
	private String name;
	
	public Fruit(int priceKg, int wt, String nm) {
		this.pricePerKg = priceKg;
		this.weigth = wt;
		this.name = nm;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeigth() {
		return weigth;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
