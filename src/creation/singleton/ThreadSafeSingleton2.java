package creation.singleton;

/**
 * synchronized 키워드로 성능저하가 있지만
 * block synchronized를 사용하여 초기의 몇개 쓰레드만이 접근하기 때문에
 * thread safe하게 사용할 수 있다.
 * @author big
 *
 */
public class ThreadSafeSingleton2 {

	private static ThreadSafeSingleton2 instance;
	
	private ThreadSafeSingleton2() {}
	
	public static ThreadSafeSingleton2 getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton2();	
				}
			}
		}
		
		return instance;
	}
	
}
