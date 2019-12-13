package com.caps.phonesimulatorapplicationdevelopment.addservices;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;

public interface AddServices {
	public List<ContactBean> getAllContacts();
	public boolean insertContact(ContactBean bean);
	public boolean deleteContact(String name);
}
