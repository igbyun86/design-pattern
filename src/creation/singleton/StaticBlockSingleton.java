package creation.singleton;

/**
 * EagerInitializedSingleton�� ��ɰ� ��������� ����ó���� ���ԵǾ��ִ�.
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
