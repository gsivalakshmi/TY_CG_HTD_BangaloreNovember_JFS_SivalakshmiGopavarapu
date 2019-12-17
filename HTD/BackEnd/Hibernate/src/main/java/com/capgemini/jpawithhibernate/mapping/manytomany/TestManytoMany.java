package com.capgemini.jpawithhibernate.mapping.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.mapping.onetoone.EmployeeInfo;


public class TestManytoMany {
	public static void main(String[] args) {
		EmployeeInfo info=new EmployeeInfo();
		info.setEid(54);
		info.setEname("Littu");
		info.setEmail("littu@gmail.com");
		info.setPassword(12345);

		EmployeeInfo info1=new EmployeeInfo();
		info1.setEid(55);
		info1.setEname("Honey");
		info1.setEmail("Honey@gmail.com");
		info1.setPassword(5678);

		ArrayList<EmployeeInfo> alist=new ArrayList<EmployeeInfo>();
		alist.add(info);
		alist.add(info1);

		TrainingInfo tinfo=new TrainingInfo();
		tinfo.setTid(1000);
		tinfo.setTname("JFullStack");
		tinfo.setEmp(alist);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(tinfo);
			System.out.println("record saved successfully");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}

