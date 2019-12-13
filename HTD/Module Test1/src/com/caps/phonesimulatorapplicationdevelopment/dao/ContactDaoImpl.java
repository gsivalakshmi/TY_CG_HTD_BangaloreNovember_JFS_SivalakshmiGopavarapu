package com.caps.phonesimulatorapplicationdevelopment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;

public class ContactDaoImpl implements ContactDao{
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	List<ContactBean> contactbeans=new ArrayList<ContactBean>();

	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return contactbeans;
	}

	@Override
	public boolean deleteContact(String contactname) {
		ContactBean bean=null;
	       for (ContactBean contactBean : contactbeans) {
	    	   if(contactBean.getName()==contactname) {
	    	    	  bean=contactBean;
	    	       }
	       }
	    	       if(bean!=null) {
	    	       contactbeans.remove(bean);
	    	       return true;
	    	       }
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addContact(ContactBean bean) {
		for (ContactBean contactBean : contactbeans) {
			if(contactBean.getName()==bean.getName()) 
			{
				return false;
			}
		}
		contactbeans.add(bean);
		return true;
		}

	@Override
	public ContactBean getContact(int contactnumber) {
		for (ContactBean contactBean : contactbeans) {
			if(contactBean.getNumber()==contactnumber) {
				return contactBean;
			}
		}
		return null;
}

	
	@Override
	public boolean updateContact(String name,int number) {
		try(Connection con=DriverManager.getConnection("name");
			PreparedStatement pstmt=con.prepareStatement(name))
		{
			
			System.out.println("enter values to update");
			System.out.println("Enter contact name to update");
			pstmt.setString(1,sc.nextLine());
			System.out.println("enter new number");
			pstmt.setInt(2, sc.nextInt());
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
	public ContactBean userLogin(String Username, String Password) {
		// TODO Auto-generated method stub
		return null;
	}
}
