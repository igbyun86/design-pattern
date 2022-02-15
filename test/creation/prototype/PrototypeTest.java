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
		list.add("길");
		
		List<String> list2 = empsNew2.getEmpList();
		list2.remove("노홍철");
		
		System.out.println("emps List : " + emps.getEmpList());
		System.out.println("empsNew List : " + list);
		System.out.println("empsNew2 List : " + list2);
		
		/*
			emps List : [유재석, 박명수, 하하, 노홍철, 정형돈, 정준하]
			empsNew List : [유재석, 박명수, 하하, 노홍철, 정형돈, 정준하, 길]
			empsNew2 List : [유재석, 박명수, 하하, 정형돈, 정준하]
		*/
	}

}
