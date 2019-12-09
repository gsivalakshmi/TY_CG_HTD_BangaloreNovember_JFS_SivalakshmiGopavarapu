package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UserMailUpdate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        PreparedStatement pstmt=null;
		Connection con=null;
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			//getDBConnection
			String dbUrl="jdbc:mysql://127.0.0.1/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			con=DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connection established!!!!!");
			
			//issue SQL queries via connection
			String query="UPDATE users_info SET email= ? WHERE Userid = ? AND Password= ? ";
		    pstmt=con.prepareStatement(query);
			System.out.println("enter userid....");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter new UserMail......");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password......");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("query executd....");
			
			//process results returned by sql queries
			if(count>0) {
				System.out.println("user mail updateddd....");
			}else {
				
				System.err.println("couldnt find the account");
			}
		} catch (Exception e) {
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
				
			}
	}
	}
		
