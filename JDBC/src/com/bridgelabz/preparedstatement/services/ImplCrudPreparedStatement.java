package com.bridgelabz.preparedstatement.services;

import java.sql.*;
import java.util.*;

import com.bridgelabz.preparedstatement.model.Student;
import com.bridgelabz.preparedstatement.services.ImplCrudPreparedStatement;
import com.bridgelabz.statement.repository.DbConnector;

public class ImplCrudPreparedStatement implements ICrudPreparedStatement {
	static Connection con = DbConnector.getConnection();
	static Scanner sc = new Scanner(System.in);

	@Override
	public int insertValueInPreparedStatement(Student student) {
		String query = "insert into student values(?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, student.getRollNumber());
			st.setString(2, student.getName());
			return st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void readFromPreparedStatement() {
		ResultSet rs;
		String queryRead = "select * from student";
		PreparedStatement stRead;
		try {
			stRead = con.prepareStatement(queryRead);
			rs = stRead.executeQuery();
			System.out.println("Read output :");
			while (rs.next()) {
				String userInfo = rs.getInt(1) + " " + rs.getString(2);
				System.out.println(userInfo);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public int updateInPreparedStatement(Student student,int rollNumber) {
		
		String queryUpdate = "update student set name='"+ student.getName()+"' where rollno=?";
		PreparedStatement stUpdate;
		try {
			stUpdate = con.prepareStatement(queryUpdate);
			stUpdate.setInt(1, rollNumber);
			return stUpdate.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteInPreparedStatement(int rollDelete) {

		
		String queryDelete = "delete from student where rollno=?";
		PreparedStatement stDelete;
		try {
			stDelete = con.prepareStatement(queryDelete);
			stDelete.setInt(1, rollDelete);
			return stDelete.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
	}
}
