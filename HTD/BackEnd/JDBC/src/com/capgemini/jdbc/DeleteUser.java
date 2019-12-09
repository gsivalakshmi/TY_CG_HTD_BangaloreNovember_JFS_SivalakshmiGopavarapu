package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
public static void main(String[] args) throws ClassNotFoundException {
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	PreparedStatement pstmt=null;
	//load the driver
	try {
		//Driver driver =new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded.....");
		//get DBConnection via driver
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter DB usr and Password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		con=DriverManager.getConnection(dbUrl, user, password);
		System.out.println("connection established!!!!!");
		//issue sql query via connection
		String query="DELETE FROM users_info WHERE userid=? AND password=?";
		pstmt=con.prepareStatement(query);
		System.out.println("enter userid....");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter password......");
		pstmt.setString(2, sc.nextLine());
		
		int count=pstmt.executeUpdate();
		//proccess the result returned by sql stmts

		if(count>0) {
			System.out.println("user deleted....");
		}else {
			System.err.println("something wrong...");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		//close all jdbc objects

			try {
				if(con!=null) {

				con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

