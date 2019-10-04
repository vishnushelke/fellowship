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
		Student student = new Student();
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
				student.setRollnumber(sc.nextInt());
				System.out.println("enter name");
				student.setName(sc.next());
				util.insertValueInStatement(student);
				System.out.println("after creating :");
				util.readFromStatement();
				break;
				
			case 2:// read data from the table
				System.out.println("Table is :");
				util.readFromStatement();
				break;
				
			case 3:// update into the table
				Student studentUpdate=new Student();
				System.out.println("enter rollnumber");
				int rollNumberUpdate=sc.nextInt();
				System.out.println("Enter name");
				studentUpdate.setName(sc.next());
				util.updateInStatement(studentUpdate,rollNumberUpdate);
				System.out.println("after updating :");
				util.readFromStatement();
				break;
				
			case 4:// delete from table
				util.deleteInStatement();
				System.out.println("after deleting :");
				util.readFromStatement();
				break;
				
			case 5:exit=true;
					break;
				
			default:
				System.out.println("enter valid input");
				break;
			}
			
		}
		

	}
}
