package creation.singleton;

/**
 * ���� ����Ŭ������ ����ϱ� ������ ���������� �޸𸮿� �ε���� ������
 * synchronized Ű���带 ������� �ʰ� thread safe�ϰ� ����� �� �ִ�.
 * @author big
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {}
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
