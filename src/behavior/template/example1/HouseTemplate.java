package behavior.template.example1;

/**
 * Template method abstract class
 * @author big
 *
 */
public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
}
