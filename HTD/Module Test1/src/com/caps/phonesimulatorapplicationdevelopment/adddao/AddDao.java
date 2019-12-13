package com.caps.phonesimulatorapplicationdevelopment.adddao;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;

public interface AddDao {
	public List<ContactBean> getAllContacts() ;
	public boolean deleteaddContact(String contactname);
	public ContactBean getaddContact(int contactnumber);
	public boolean addContacts(ContactBean bean);
}
