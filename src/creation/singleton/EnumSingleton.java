package creation.singleton;

/**
 * BillPughSingleton 방식과 비슷하게 사용할 수 있으나
 * enum은 지연초기화를 허용하지 않는다.
 * @author big
 *
 */
public enum EnumSingleton {

	INSTANCE;
	
	public void doSomething() {
		System.out.println("EnumSingleton 객체 생성!!");
	}
}
