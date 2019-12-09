package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices {
	UserDAO dao=UserFactory.instanceOfUserDAOImpl();

	@Override
	public List<UserBean> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String Username, String Password) {
		return dao.userLogin(Username, Password);
	}

	@Override
	public boolean updateUser(int Userid, String Password, String email) {
		return dao.updateUser(Userid, Password, email);
	}

	@Override
	public boolean insertUser(UserBean user) {
		return dao.insertUser(user);
	}

	@Override
	public boolean deleteUser(int Userid, String Password) {
		return dao.deleteUser(Userid, Password);
	}

	
}
