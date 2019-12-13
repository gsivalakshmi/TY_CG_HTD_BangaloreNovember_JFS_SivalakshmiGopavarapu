package com.caps.phonesimulatorapplicationdevelopment.services;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDao;
import com.caps.phonesimulatorapplicationdevelopment.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices {
	ContactDao dao=ContactFactory.instanceOfContactDaoImpl();


	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

	@Override
	public ContactBean userLogin(String Username, String Password) {
		

		return dao.userLogin(Username, Password);
	}

	@Override
	public boolean updatecontact(String name, int number) {
		return dao.updateContact(name,number);
	}

	@Override
	public boolean insertContact(ContactBean bean) {
		// TODO Auto-generated method stub
		return dao.addContact(bean);
	}

	@Override
	public boolean deleteContact(String name) {
		// TODO Auto-generated method stub
		return dao.deleteContact(name);
	}
}

	