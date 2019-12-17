package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.mapping.onetoone.EmpOtherInfo;
import com.capgemini.jpawithhibernate.mapping.onetoone.EmployeeInfo;

public class TestOnetoOne {
	public static void main(String[] args) {
		//	EmployeeInfo emp=new EmployeeInfo();
		//	emp.setEid(10);
		//	emp.setEname("shiva");
		//	emp.setEname("shiva@gmail.com");
		//	emp.setPassword(1234);
		//	
		//	EmpOtherInfo other=new EmpOtherInfo();
		//	other.setId(10);
		//	other.setPancard(12354);
		//	other.setFathername("Narayana Reddy");
		//	other.setMothername("Obulamma");
		//	other.setEmployee(emp);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			EmployeeInfo emp=entityManager.find(EmployeeInfo.class, 10);
			entityManager.persist(emp);
			//System.out.println(other1);
			System.out.println("record saved successfully");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}

