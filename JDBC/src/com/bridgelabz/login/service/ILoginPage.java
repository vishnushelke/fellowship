package com.bridgelabz.login.service;

import com.bridgelabz.preparedstatement.model.Student;

public interface ILoginPage {
	public void createRegistration(Student student);
	public boolean login(Student student);
}
