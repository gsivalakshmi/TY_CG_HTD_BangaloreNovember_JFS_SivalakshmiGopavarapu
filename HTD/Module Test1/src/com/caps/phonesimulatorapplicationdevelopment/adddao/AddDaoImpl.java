package com.caps.phonesimulatorapplicationdevelopment.adddao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;

public class AddDaoImpl implements AddDao {
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	List<ContactBean> contactbeans=new ArrayList<ContactBean>();
	private ContactBean bean;


	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return contactbeans;
	}

	@Override
	public boolean deleteaddContact(String contactname) {
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
	public ContactBean getaddContact(int contactnumber) {
		for (ContactBean contactBean : contactbeans) {
			if(contactBean.getNumber()==contactnumber) {
				return contactBean;
			}
		}
		return null;
}

	@Override
	public boolean addContacts(ContactBean bean) {
		for (ContactBean contactBean : contactbeans) {
			if(contactBean.getName()==bean.getName()) 
			{
				return false;
			}
		}
		contactbeans.add(bean);
		return true;
		}
		// TODO Auto-generated method stub

	
}
