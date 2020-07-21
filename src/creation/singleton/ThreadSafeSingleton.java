package creation.singleton;

/**
 * thread safe�� ��������� ȣ��ɶ����� synchronized Ű����� ����
 * ������ ���ϵȴ�.
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
