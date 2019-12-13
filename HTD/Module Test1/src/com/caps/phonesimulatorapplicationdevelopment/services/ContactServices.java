package com.caps.phonesimulatorapplicationdevelopment.services;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;



public interface ContactServices {
	public List<ContactBean> getAllContacts();
	//public ContactBean userLogin(String Username,String Password);
	public boolean updatecontact(String name,int number);
	public boolean insertContact(ContactBean bean);
	public boolean deleteContact(String name);
	ContactBean userLogin(String Username, String Password);
}
