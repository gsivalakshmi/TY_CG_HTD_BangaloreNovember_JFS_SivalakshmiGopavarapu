package com.caps.phonesimulatorapplicationdevelopment.dao;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;

public interface ContactDao {
	public List<ContactBean> getAllContacts() ;
	public ContactBean userLogin(String Username,String Password);
	public boolean deleteContact(String contactname);
	public ContactBean getContact(int contactnumber);
	public boolean addContact(ContactBean bean);
	boolean updateContact(String name, int number);
	
}
