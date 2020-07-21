package creation.singleton;

/**
 * ���� ������ȯ�濡���� ������ ������ 
 * ���߾�����ȯ�濡���� �������� instance�� �����ɼ� �ִ� ������ �߻��Ѵ�.
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
