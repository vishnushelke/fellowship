/******************************************************************************
 *  Compilation:  javac -d bin ProxyPatternTest.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.ProxyPatternTest n
 *  
 *  Purpose: Example of Factory Prototype Pattern
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   29-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}

}
