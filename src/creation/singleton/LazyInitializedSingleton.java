package creation.singleton;

/**
 * 단일 쓰레드환경에서는 문제가 없지만 
 * 다중쓰레드환경에서는 여러개의 instance가 생성될수 있는 문제가 발생한다.
 * @author big
 *
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		
		return instance;
	}
}
