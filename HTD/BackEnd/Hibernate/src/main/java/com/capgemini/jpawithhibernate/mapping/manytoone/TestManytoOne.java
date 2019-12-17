package com.capgemini.jpawithhibernate.mapping.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.mapping.onetoone.EmployeeInfo;


public class TestManytoOne {
	public static void main(String[] args) {
	EmployeeInfo info=new EmployeeInfo();
	info.setEid(12);
	info.setEname("chandu");
	info.setEmail("chand@gmail.com");
	info.setPassword(36547);
	
	EmployeeExperience exp=new EmployeeExperience();
	exp.setExpid(11);
	exp.setCname("IBM");
	exp.setNoOfyoe(3);
	exp.setEmployee(info);
	EmployeeExperience exp1=new EmployeeExperience();
	exp1.setExpid(16);
	exp1.setCname("Info");
	exp1.setNoOfyoe(2);
	exp1.setEmployee(info);
	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(exp);
		entityManager.persist(exp1);
		System.out.println("record saved successfully");
		entityTransaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
	}
}
