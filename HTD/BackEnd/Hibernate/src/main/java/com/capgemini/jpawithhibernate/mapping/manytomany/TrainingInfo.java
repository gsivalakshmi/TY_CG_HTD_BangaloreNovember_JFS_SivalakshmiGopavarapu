package com.capgemini.jpawithhibernate.mapping.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.mapping.onetoone.EmployeeInfo;
@Entity
@Table(name="TrainingInfo")
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="training_employee",joinColumns=@JoinColumn(name="tid"),
	inverseJoinColumns=@JoinColumn(name="eid"))
	private List<EmployeeInfo> emp;

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<EmployeeInfo> getEmp() {
		return emp;
	}
	public void setEmp(List<EmployeeInfo> emp) {
		this.emp = emp;
	}
}
