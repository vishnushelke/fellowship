/******************************************************************************
 *  Compilation:  javac -d bin PrototypeTest.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.PrototypeTest n
 *  
 *  Purpose: Example of Factory Prototype Pattern
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   29-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
