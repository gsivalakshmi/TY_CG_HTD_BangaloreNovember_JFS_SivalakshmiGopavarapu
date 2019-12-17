package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
	entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	Movie record=entityManager.find(Movie.class, 103);
	System.out.println(entityManager.contains(record));
	entityManager.detach(record);
	System.out.println(entityManager.contains(record));
	Movie reattachMovie=entityManager.merge(record);
	reattachMovie.setMname("dhruva chirutha");
	System.out.println("record updated successfully.......");
	entityTransaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();

}
}
