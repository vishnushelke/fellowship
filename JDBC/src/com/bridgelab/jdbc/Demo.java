package com.bridgelab.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/abc";
		String userName="root";
		String password="root";
		String query="select * from student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, userName, password);
		
		//create a statement
		Statement st=con.createStatement();
		
		//execute a query and store chunk of data in tabular structure
		ResultSet rs=st.executeQuery(query);
//		rs.next();
//		String name=rs.getString("name");
//		System.out.println(name);
		while(rs.next())
		{
			String userDate=rs.getInt(1)+" "+rs.getString(2);
			System.out.println(userDate);
		}
		
		st.close();
		con.close();
	}

}
