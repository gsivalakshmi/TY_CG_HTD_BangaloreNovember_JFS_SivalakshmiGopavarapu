package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {
		Movie movie=new Movie();
		movie.setMid(109);
		movie.setMname("nrnm");
		movie.setRating("good");
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);
		System.out.println("record saved successfully");
		transaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
	}
}
