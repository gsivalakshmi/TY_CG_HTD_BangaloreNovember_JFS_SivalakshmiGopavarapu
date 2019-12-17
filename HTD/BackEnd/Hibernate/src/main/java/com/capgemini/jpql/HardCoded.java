package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HardCoded {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	String jpql="update Movie set mname=:mn where mid=:id";
	Query query=entityManager.createQuery(jpql);
	query.setParameter("id", 103);
	query.setParameter("mn", "SHIVA");
	int result=query.executeUpdate();
	System.out.println(result);
	entityTransaction.commit();
	entityManager.close();
}
}
