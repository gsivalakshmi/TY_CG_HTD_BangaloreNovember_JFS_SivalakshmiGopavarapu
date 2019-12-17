package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
public static void main(String[] args) {
	EntityTransaction entityTransaction=null;
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	String jpql="delete from Movie where mid=:id ";
	Query query=entityManager.createQuery(jpql);
	query.setParameter("id", 5);
	query.executeUpdate();
	entityTransaction.commit();
	System.out.println("record deleted");
	entityManager.close();
}
}
