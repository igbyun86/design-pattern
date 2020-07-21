package creation.singleton;

/**
 * �ʱ⿡ �ν��Ͻ� ����
 * �ۼ��ϱ� ���� ���� ��������� �޼��带 ȣ������ �ʾƵ� �ν��Ͻ�ȭ��.
 * ����ó���� ó���� �� �ִ� ����� ����.
 * @author big
 *
 */
public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
	
	// �����ڸ� ���� �ν��Ͻ� ������ ���� ���� private���� ����
	private EagerInitializedSingleton() {}
	
	public EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
