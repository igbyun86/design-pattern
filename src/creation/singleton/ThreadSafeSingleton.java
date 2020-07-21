package creation.singleton;

/**
 * thread safe한 방법이지만 호출될때마다 synchronized 키워드로 인해
 * 성능이 저하된다.
 * @author big
 *
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}
	
}
