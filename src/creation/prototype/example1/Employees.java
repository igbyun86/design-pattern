package creation.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}
	
	public void loadData() {
		//read all employees from database and put into the list
		empList.add("���缮");
		empList.add("�ڸ��");
		empList.add("����");
		empList.add("��ȫö");
		empList.add("������");
		empList.add("������");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		for (String s : empList) {
			tempList.add(s);
		}
		
		return new Employees(tempList);
	}
	
	
	
}
