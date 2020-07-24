package creation.factory.example1;

/**
 * Super class
 * Super class는 interface, abstract class, normal class가 될수 있다.
 * @author big
 *
 */
public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "RAM=" + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
	}
	
}
