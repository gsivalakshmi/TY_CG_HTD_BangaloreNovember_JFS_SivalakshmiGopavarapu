package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOImpl implements UserDAO {
	FileReader reader;
	Properties prop;
	UserBean user;
	Scanner sc=new Scanner(System.in);
	public UserDAOImpl() {
		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));

			System.out.println("Driver loaded.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserBean> getAllUsers() {
		List<UserBean> list=new ArrayList<UserBean>();
		try(Connection con= DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"),
					prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));){
			while(rs.next()) {
				user=new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
				}
			return list;
		}catch (Exception e) {
		}
		return null;
	}

	@Override
	public UserBean userLogin(String Username, String Password) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
			PreparedStatement pstmt=con.prepareStatement(prop.getProperty("loginQuery"));)
		{
			pstmt.setString(1, Username);
			pstmt.setString(2, Password);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				user=new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
			}
			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateUser(int Userid, String Password, String email) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
			PreparedStatement pstmt=con.prepareStatement(prop.getProperty("UpdateUser"));)
		{
			
			System.out.println("enter values to update");
			System.out.println("Enter Userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter new email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter password to update");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("Query Issued!!");
			if(count>0) {
				return true;
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		try(
				Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"));
				){
			
				pstmt.setInt(1, user.getUserid());
				pstmt.setString(2, user.getUsername());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPassword());
				
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(int Userid, String Password) {
		try(
				Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"));
				){
			
				pstmt.setInt(1, Userid);
				pstmt.setString(2, Password);
				
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	

}
