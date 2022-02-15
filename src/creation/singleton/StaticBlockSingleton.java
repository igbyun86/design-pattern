package creation.singleton;

/**
 * EagerInitializedSingleton의 기능과 비슷하지만 예외처리가 포함되어있다.
 * @author big
 *
 */
public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(""); 
		}
	}
	
	public StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
