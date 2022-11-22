package com.xworkz.krawardeesRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.krawardees.entity.KRAwardeesEntity;


public class KRAwardeesRepositoryImpl implements KRAwardeesRepository {
	
	EntityManagerFactory factory;
	EntityManager manager;

	@Override
	public boolean save(KRAwardeesEntity dto) {
		try {
			System.out.println("running save method");
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
			
		} catch (PersistenceException e) {
			e.getStackTrace();

		}
		finally {
			manager.close();
			factory.close();
		}
		return true;
	}

}
