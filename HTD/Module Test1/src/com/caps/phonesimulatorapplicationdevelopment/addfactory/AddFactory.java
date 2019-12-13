package com.caps.phonesimulatorapplicationdevelopment.addfactory;

import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDao;
import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDaoImpl;
import com.caps.phonesimulatorapplicationdevelopment.services.ContactServices;
import com.caps.phonesimulatorapplicationdevelopment.services.ContactServicesImpl;

public class AddFactory {
private void ContactFactory() {
		
	}
	public static ContactDao instanceOfContactDaoImpl() {
		ContactDao dao= new ContactDaoImpl();
		return dao;
	}
	
	public static ContactServices instanceOfContactServices() {
		ContactServices services=new ContactServicesImpl();
		return services;
	}
	
}
