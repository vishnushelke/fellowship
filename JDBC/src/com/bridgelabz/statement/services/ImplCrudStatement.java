package com.bridgelabz.statement.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bridgelabz.statement.model.Student;
import java.util.Scanner;

import com.bridgelabz.statement.repository.DbConnector;

public class ImplCrudStatement implements ICrudStatement {

	static Scanner sc = new Scanner(System.in);
	static Connection con = DbConnector.getConnection();
	static Statement st = null;

	@Override
	public int insertValueInStatement(Student student) {

		String queryCreate = "insert into student values('" + student.getRollnumber() + "','" + student.getName()
				+ "')";
		int count=0;
		Statement stCreate;
		try {
			stCreate = con.createStatement();
			count = stCreate.executeUpdate(queryCreate);
			System.out.println(count + " row/s affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void readFromStatement() {
		String query = "select * from student";
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
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
	public int updateInStatement(Student student) {
		String queryUpdate = "update student set name='" + student.getName() + "' where rollno=" + student.getRollnumber() + "";

		Statement stUpdate;
		try {
			stUpdate = con.createStatement();
			return stUpdate.executeUpdate(queryUpdate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteInStatement(int rollNumber) {
		String queryDelete = "delete from student where rollno="+rollNumber+"";

		Statement stDelete;
		try {
			stDelete = con.createStatement();
			return stDelete.executeUpdate(queryDelete);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
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
