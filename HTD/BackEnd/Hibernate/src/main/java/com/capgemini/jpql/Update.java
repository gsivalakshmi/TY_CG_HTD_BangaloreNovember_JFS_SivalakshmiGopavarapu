package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class Update {
public static void main(String[] args) {
	EntityTransaction entityTransaction=null;
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	 entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	String jpql="update Movie set mname='defg' where mid=5";
	Query query=entityManager.createQuery(jpql);
	query.executeUpdate();
	entityTransaction.commit();
	System.out.println("record updated..");
	entityManager.close();
}
}
