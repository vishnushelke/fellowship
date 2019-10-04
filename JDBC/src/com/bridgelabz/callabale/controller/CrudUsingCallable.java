/******************************************************************************
 *  Compilation:  javac -d bin CrudUsingCallable.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.CrudUsingCallable n
 *  
 *  Purpose: Does CRUD operations using callable statement
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   04-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.callabale.controller;

import java.util.Scanner;

import com.bridgelabz.callabale.model.Student;
import com.bridgelabz.callabale.services.ImplCrudUsingCallable;

public class CrudUsingCallable {

	public static void main(String[] args) {
		Student student=new Student();
		Scanner sc = new Scanner(System.in);
		ImplCrudUsingCallable util = new ImplCrudUsingCallable();
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"What do you want to do?\n1.create using callable statement\n2.read using callable statement\n3.update using callable statement\n4.delete using callable statement\n5.exit");
			switch (sc.nextInt()) {
			case 1:// create using callable
				System.out.println("Enter roll number");
				student.setRollnumber(sc.nextInt());
				System.out.println("Enter name");
				student.setName(sc.next());
				util.createCallable(student);

				break;

			case 2:// read using callable
				util.readCallable();
				break;

			case 3://update using callable
				Student studentUpdate=new Student();
				System.out.println("Enter roll number");
				int rollNumberUpdate = sc.nextInt();
				System.out.println("Enter name");
				studentUpdate.setName(sc.next());
				util.updateCallable(rollNumberUpdate, studentUpdate);;
				break;

			case 4://delete using callable
				System.out.println("Enter roll number");
				int rollNumberDelete = sc.nextInt();
				util.deleteCallable(rollNumberDelete);
				break;

			case 5://exit
				exit = true;
				break;

			default:
				System.out.println("Enter valid input");
				break;
			}
		}
		sc.close();
	}

}
