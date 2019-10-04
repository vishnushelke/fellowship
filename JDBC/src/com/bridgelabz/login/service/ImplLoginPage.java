package com.bridgelabz.login.service;

import java.sql.*;

import com.bridgelabz.preparedstatement.model.Student;
import com.bridgelabz.preparedstatement.repository.DbConnector;

public class ImplLoginPage implements ILoginPage {

	static Connection con = DbConnector.getConnection();
	PreparedStatement st = null;

	@Override
	public void createRegistration(Student student) {
		String query="insert into student values(?,?)";
		try {
			st=con.prepareStatement(query);
			st.setInt(1, student.getRollNumber());
			st.setString(2, student.getName());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(Student student) {
		String query = "select * from student";
		int i = 0;
		try {
			st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(student.getRollNumber());
				System.out.println(rs.getInt(1));
				if (rs.getInt(1) == student.getRollNumber()) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
