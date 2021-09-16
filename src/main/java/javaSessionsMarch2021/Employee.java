package javaSessionsMarch2021;

import java.util.ArrayList;

public class Employee {

	public Object[] getEmpData() {
		Object emp[] = new Object[4];
		emp[0] = "Poonam";
		emp[1] = 25;
		emp[2] = "Pune";
		emp[3] = "12-12-1990";
		return emp;
	}

	public ArrayList<String> getEmpList() {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Lisa");
		empList.add("Neha");

		return empList;
	}

	
	
	//this  type of method is allowed in java 
	//we just have return keyword but actually returning nothinng 
	
	public void getNumber() {
		System.out.println("hi this is number 101");
		return;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		// System.out.println(e1.getEmpData()[0]);
		for (Object e : e1.getEmpData()) {
			System.out.println(e);
		}

		e1.getEmpList().stream().forEach(ele -> System.out.println(ele));

		//this method is void in nature even it has return keyword
		e1.getNumber();
		
		
	}

}