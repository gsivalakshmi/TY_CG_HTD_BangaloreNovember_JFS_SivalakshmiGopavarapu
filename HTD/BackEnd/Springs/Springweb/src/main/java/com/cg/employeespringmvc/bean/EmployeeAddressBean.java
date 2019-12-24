package com.cg.employeespringmvc.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_addr_info")
public class EmployeeAddressBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String addresstype;
	@Column
	private String add1;
	@Column
	private String add2;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id", referencedColumnName="id")
	private EmployeeBean bean;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public EmployeeBean getBean() {
		return bean;
	}
	public void setBean(EmployeeBean bean) {
		this.bean = bean;
	}
}
