package com.cg.employeespringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.employeespringmvc.bean.EmployeeAddressBean;
import com.cg.employeespringmvc.bean.EmployeeBean;
import com.cg.employeespringmvc.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired	
	private EmployeeDao dao;

	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		
		// TODO Auto-generated method stub
		return dao.auth(email, password);
	}
	@Override
	public boolean register(EmployeeBean bean) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		
		List<EmployeeAddressBean> addressBeans=bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressBeans) {
			employeeAddressBean.setBean(bean);
		}
				
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		return dao.getEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String Password) {
		return dao.changePassword(id, encoder.encode(Password));
	}

}
