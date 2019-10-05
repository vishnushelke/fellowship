package com.bridgelabz.callabale.services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.callabale.model.Student;
import com.bridgelabz.statement.repository.DbConnector;

public class ImplCrudUsingCallable implements ICrudUsingCallable {

	Connection con = DbConnector.getConnection();

	@Override
	public int createCallable(Student student) {
		try {
			CallableStatement st = con.prepareCall("call createStudent(?,?)");
			st.setInt(1, student.getRollnumber());
			st.setString(2, student.getName());
			return st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void readCallable() {

		try {
			CallableStatement st = con.prepareCall("call getTable");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String userInfo = rs.getInt(1) + " " + rs.getString(2);
				System.out.println(userInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int updateCallable(int rollNumber, Student student) {
		try {
			CallableStatement st = con.prepareCall("call updateStudent(?,?)");
			st.setInt(1, rollNumber);
			st.setString(2, student.getName());
			return st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteCallable(int rollNumber) {
		try {
			CallableStatement st = con.prepareCall("call deleteStudent(?)");
			st.setInt(1, rollNumber);
			return st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	

}
