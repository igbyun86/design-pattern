package creation.prototype;

import java.util.List;

import org.junit.Test;

import creation.prototype.example1.Employees;

public class PrototypeTest {
	
	@Test
	public void employeeCopyTest() throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew2 = (Employees) emps.clone();
		
		List<String> list = empsNew.getEmpList();
		list.add("��");
		
		List<String> list2 = empsNew2.getEmpList();
		list2.remove("��ȫö");
		
		System.out.println("emps List : " + emps.getEmpList());
		System.out.println("empsNew List : " + list);
		System.out.println("empsNew2 List : " + list2);
		
		/*
			emps List : [���缮, �ڸ��, ����, ��ȫö, ������, ������]
			empsNew List : [���缮, �ڸ��, ����, ��ȫö, ������, ������, ��]
			empsNew2 List : [���缮, �ڸ��, ����, ������, ������]
		*/
	}

}
