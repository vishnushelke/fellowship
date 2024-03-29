/******************************************************************************
 *  Compilation:  javac -d bin TestComputer.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.TestComputer n
 *  
 *  Purpose: Example of Factory Design Pattern
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   29-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory;

public class TestComputer {

	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("pc", "8GB", "250GB", "2.4GHz");
		Computer laptop=ComputerFactory.getComputer("laptop", "8GB", "500GB", "2.9GHz");
		Computer Server=ComputerFactory.getComputer("server", "15GB", "1.5TB", "3.8GHZ");
		
		System.out.println("Factory PC configuration is : "+pc);
		System.out.println("Factory laptop configuration is : "+laptop);
		System.out.println("Factory Server configuration is : "+Server);
	}

}
