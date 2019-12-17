package com.capgemini.jpawithhibernate.mapping.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.mapping.onetoone.EmployeeInfo;



@Entity
@Table(name="EmployeeExperience")
public class EmployeeExperience {
	@Id
	@Column
	private int expid;
	@Column
	private String cname;
	@Column
	private int noOfyoe;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	
	private EmployeeInfo employeeexp;

	public int getNoOfyoe() {
		return noOfyoe;
	}
	public void setNoOfyoe(int noOfyoe) {
		this.noOfyoe = noOfyoe;
	}
	public EmployeeInfo getEmployee() {
		return employeeexp;
	}
	public void setEmployee(EmployeeInfo employee) {
		this.employeeexp = employee;
	}
	public int getExpid() {
		return expid;
	}
	public void setExpid(int expid) {
		this.expid = expid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
