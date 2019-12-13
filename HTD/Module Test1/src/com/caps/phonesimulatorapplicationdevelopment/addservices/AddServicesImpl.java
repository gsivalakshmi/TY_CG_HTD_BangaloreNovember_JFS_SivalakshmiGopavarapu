package com.caps.phonesimulatorapplicationdevelopment.addservices;

import java.util.List;

import com.caps.phonesimulatorapplicationdevelopment.bean.ContactBean;
import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDao;
import com.caps.phonesimulatorapplicationdevelopment.factory.ContactFactory;

public class AddServicesImpl implements AddServices {
	ContactDao dao=ContactFactory.instanceOfContactDaoImpl();


	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
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
