package com.bridgelabz.login.controller;

import java.util.Scanner;

import com.bridgelabz.login.service.ImplLoginPage;
import com.bridgelabz.preparedstatement.model.Student;

public class LoginPage {

	public static void main(String[] args) {

		ImplLoginPage util = new ImplLoginPage();
		Scanner sc = new Scanner(System.in);
		

		System.out.println("What do you want to do?\n1.Login\n2.Register\n3.exit");
		switch (sc.nextInt()) {
		case 1:// login into page
			Student student = new Student();
			System.out.println("enter your roll number");
			student.setRollNumber(sc.nextInt());
			if (util.login(student))
			{
				System.out.println("Logged in successfully!");
			}
			
			else {
				System.out.println("your rollnumber not found.kindly register yourself.\nEnter your name");
				student.setName(sc.next());
				util.createRegistration(student);
			}
			break;

		case 2:// register
			Student studentRegister = new Student();
			System.out.println("Enter your roll number");
			studentRegister.setRollNumber(sc.nextInt());
			System.out.println("Enter name");
			studentRegister.setName(sc.next());
			util.createRegistration(studentRegister);
			break;
		}

		sc.close();
	}

}
