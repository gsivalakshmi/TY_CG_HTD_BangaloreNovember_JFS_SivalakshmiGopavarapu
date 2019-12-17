package com.capgemini.jpawithhibernate.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_other_info")
public class EmpOtherInfo {
	@Id
	@Column
	private int id;
	@Column
	private int pancard;
	@Column
	private String fathername;
	@Column
	private String Mothername;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	
	private EmployeeInfo employee;
	

	public EmployeeInfo getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeInfo employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPancard() {
		return pancard;
	}
	public void setPancard(int pancard) {
		this.pancard = pancard;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return Mothername;
	}
	public void setMothername(String mothername) {
		Mothername = mothername;
	}

}
