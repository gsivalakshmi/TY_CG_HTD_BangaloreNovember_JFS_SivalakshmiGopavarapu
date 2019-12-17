package com.capgemini.jpawithhibernate.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.mapping.manytoone.EmployeeExperience;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="emp_info")
public class EmployeeInfo {
	@Id
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private int password;
	@Exclude
	@OneToOne(cascade=CascadeType.ALL,mappedBy="employee")
	private EmpOtherInfo other;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
