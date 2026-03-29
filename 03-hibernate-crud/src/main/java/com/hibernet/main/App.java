package com.hibernet.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.hibernet.entity.User;

public class App {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Insert opeation

		User user = new User();
		// user.setId(1);
		user.setName("om");
		user.setEmail("om@gmail.com");
		user.setPassword("123");
		user.setGender("M");
		user.setCity("bvd");

		/*
		 * try { session.save(user); transaction.commit();
		 * System.out.println("Data inserted...!"); } catch (Exception e) {
		 * transaction.rollback(); e.printStackTrace();
		 * System.out.println("Data not inserted...Due to Some Error!"); }
		 */

		// select opetion

		/*
		 * try { User user2 = session.get(User.class, 3L); if (user2 != null) {
		 * System.out.println(user2.getId()); System.out.println(user2.getName());
		 * System.out.println(user2.getCity()); System.out.println(user2.getGender());
		 * System.out.println(user2.getEmail());
		 * System.out.println(user2.getPassword()); } else {
		 * System.out.println("No Founded...!"); }
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

		/* update operation */

		/*
		 * try { User user3 = session.get(User.class, 2L); user3.setGender("male");
		 * user3.setPassword("1234");
		 * 
		 * session.saveOrUpdate(user3); transaction.commit();
		 * System.out.println("Data updated...!"); } catch (Exception e) {
		 * transaction.rollback(); e.printStackTrace();
		 * System.out.println("Data not updated...Due to Some Error!"); }
		 */

		
		
		/* delete operation */


		try {
			User user4 = new User();
			user4.setId(1L);
			
			session.delete(user4);
			transaction.commit();
			System.out.println("Data deleted ...!");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("Data not deleted...Due to Some Error!");
		}
	}
}
