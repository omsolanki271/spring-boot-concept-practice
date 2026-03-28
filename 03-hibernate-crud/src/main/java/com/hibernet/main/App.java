package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.hibernet.entity.User;

public class App {
	public static void main(String[] args) {
		User user = new User();
		//user.setId(1);
		user.setName("om");
		user.setEmail("om@gmail.com");
		user.setPassword("123");
		user.setGender("M");
		user.setCity("bvd");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		try 
		{
			session.save(user);
			transaction.commit();
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			e.printStackTrace();
		}

	}
}
