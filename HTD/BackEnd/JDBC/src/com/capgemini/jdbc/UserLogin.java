package com.capgemini.jdbc;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class UserLogin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	//load the driver
	try {
		Driver driver =new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver loaded...........");
		//get a DBconnection via driver	
		String dbUrl="jdbc:mysql://127.0.0.1/ty_cg_nov6";
		
		System.out.println("Enter username and password");
		String dbUser=sc.nextLine();
		String dbPass=sc.nextLine();
		con=DriverManager.getConnection(dbUrl,dbUser,dbPass);
		System.out.println("connection established!!!!!");
		
		//issue SQL queries via connection
		String query="SELECT * FROM users_info WHERE userid= ? AND password= ? ";
	    pstmt=con.prepareStatement(query);
		System.out.println("enter userid....");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter password......");
		pstmt.setString(2, sc.nextLine());
		
		rs=pstmt.executeQuery();
		System.out.println("query executd....");
		
		//process results returned by sql queries
			if (rs.next()) {
			System.out.println("Userid :"+rs.getInt(1));
			System.out.println("UserName:"+rs.getString(2));
			System.out.println("UserMail:"+rs.getString(3));
			System.out.println("----------------------");
			
		}else {
			System.err.println("couldnt find the account");
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
				if(pstmt!=null) {
				pstmt.close();
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
