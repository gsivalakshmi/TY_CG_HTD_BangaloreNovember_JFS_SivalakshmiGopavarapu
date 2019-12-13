package com.caps.phonesimulatorapplicationdevelopment.manager;

import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDao;
import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDaoImpl;

public class ContactManager {
	public static ContactDao getContactDao() {
		return new ContactDaoImpl(); 	
	}
}
