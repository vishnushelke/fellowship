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
	public void insertValueInPreparedStatement(Student student) {
		String query = "insert into student values(?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, student.getRollNumber());
			st.setString(2, student.getName());
			int count=st.executeUpdate();
			System.out.println(count+" row/s updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
	public void updateInPreparedStatement(Student student,int rollNumber) {
		int countUpdate;
		String queryUpdate = "update student set name='"+ student.getName()+"' where rollno=?";
		PreparedStatement stUpdate;
		try {
			stUpdate = con.prepareStatement(queryUpdate);
			stUpdate.setInt(1, rollNumber);
			countUpdate = stUpdate.executeUpdate();
			System.out.println("Update output :");
			System.out.println(countUpdate + " row/s affected");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void deleteInPreparedStatement() {

		int countDelete;
		String queryDelete = "delete from student where rollno=?";
		PreparedStatement stDelete;
		try {
			stDelete = con.prepareStatement(queryDelete);
			System.out.println("enter roll number");
			int rollDelete = ImplCrudPreparedStatement.intScan();
			stDelete.setInt(1, rollDelete);
			countDelete = stDelete.executeUpdate();
			System.out.println("delete output :");
			System.out.println(countDelete + " row/s affected");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static int intScan() {
		int n = sc.nextInt();
		return n;
	}

	public static String stringScan() {
		String n = sc.nextLine();
		return n;

	}
}
