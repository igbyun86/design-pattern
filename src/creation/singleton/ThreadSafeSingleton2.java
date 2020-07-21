package creation.singleton;

/**
 * synchronized Ű����� �������ϰ� ������
 * block synchronized�� ����Ͽ� �ʱ��� � �����常�� �����ϱ� ������
 * thread safe�ϰ� ����� �� �ִ�.
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
