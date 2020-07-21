package creation.singleton;

/**
 * 내부 정적클래스를 사용하기 때문에 실행전까지 메모리에 로드되지 않으며
 * synchronized 키워드를 사용하지 않고 thread safe하게 사용할 수 있다.
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
