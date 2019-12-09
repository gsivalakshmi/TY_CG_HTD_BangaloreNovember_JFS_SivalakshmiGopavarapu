package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices {
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String Username,String Password);
	public boolean updateUser(int Userid,String Password,String email);
	public boolean insertUser(UserBean user);
	public boolean deleteUser(int Userid,String Password);
}
