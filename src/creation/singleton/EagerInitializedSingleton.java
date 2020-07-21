package creation.singleton;

/**
 * 초기에 인스턴스 생성
 * 작성하기 가장 쉬운 방법이지만 메서드를 호출하지 않아도 인스턴스화됨.
 * 예외처리를 처리할 수 있는 방법이 없음.
 * @author big
 *
 */
public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
	
	// 생성자를 통한 인스턴스 생성을 막기 위해 private으로 선언
	private EagerInitializedSingleton() {}
	
	public EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
