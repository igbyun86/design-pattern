package creation.singleton;

/**
 * BillPughSingleton ��İ� ����ϰ� ����� �� ������
 * enum�� �����ʱ�ȭ�� ������� �ʴ´�.
 * @author big
 *
 */
public enum EnumSingleton {

	INSTANCE;
	
	public void doSomething() {
		System.out.println("EnumSingleton ��ü ����!!");
	}
}
