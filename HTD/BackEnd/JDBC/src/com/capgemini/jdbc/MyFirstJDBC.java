package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		     //Load the Driver

			//Driver driver=new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded....");
			
			//get DBconnection via driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+ "?user=root&password=gvnr";
			con=DriverManager.getConnection(dbUrl);
			System.out.println("connection estalished....");
			
			//Issue the sql queries via connection
			String query="SELECT * FROM users_info";
			stmt= con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued....");
			System.out.println("----------");
			
			//process the result returned by sql statemets
			while (rs.next()) {
				System.out.println("Userid :"+rs.getInt("userid"));
				System.out.println("UserName:"+rs.getString("username"));
				System.out.println("UserMail:"+rs.getString("email"));
				System.out.println("Passwrd:"+rs.getString("password"));
				System.out.println("----------------------");
				
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			//close all JDBC objects
			
				try {
					if(con!=null) {
					con.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(stmt!=null) {
					stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null) {
					rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		
	
	}

}
