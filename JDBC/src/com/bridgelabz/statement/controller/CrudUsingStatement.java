/******************************************************************************
 *  Compilation:  javac -d bin CrudUsingStatement.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.CrudUsingStatement n
 *  
 *  Purpose: Does CRUD operations using statement
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.statement.controller;


import java.util.Scanner;

import com.bridgelabz.statement.model.Student;
import com.bridgelabz.statement.services.ImplCrudStatement;

public class CrudUsingStatement {

	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		ImplCrudStatement util = new ImplCrudStatement();
		boolean exit=false;
		while(!exit)
		{
			System.out.println(
					"What do you want to do?\n1.create in database\n2.read from database\n3.Update the database\n4.delete from database\n5.exit");
			switch (ImplCrudStatement.intScan()) {
			case 1:// create into table
				System.out.println("enter roll number");
				int rollNumber=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println(util.insertValueInStatement(createStudent(rollNumber,name))+" row/s updated");
				break;
				
			case 2:// read data from the table
				System.out.println("Table is :");
				util.readFromStatement();
				break;
				
			case 3:// update into the table
				
				System.out.println("enter rollnumber");
				int rollNumberUpdate=sc.nextInt();
				System.out.println("Enter name");
				System.out.println(util.updateInStatement(createStudent(rollNumberUpdate,sc.next()))+" row/s updated");
				break;
				
			case 4:// delete from table
				System.out.println("Enter roll number");
				System.out.println(util.deleteInStatement(sc.nextInt())+" row/s updated");
				break;
				
			case 5:exit=true;
					break;
				
			default:
				System.out.println("enter valid input");
				break;
			}
			
		}
		
		sc.close();
	}
	
	public static Student createStudent(int rollNumer,String name)
	{
		Student student = new Student();
		student.setName(name);
		student.setRollnumber(rollNumer);
		return student;
	}
}
