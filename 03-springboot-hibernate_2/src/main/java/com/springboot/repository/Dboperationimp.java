package com.springboot.repository;

import org.hibernate.Session;

import com.springboot.config.HibernetConfig;
import com.springboot.entities.User;

public class Dboperationimp implements Dboperation{

	@Override
	public User getUserdetail(long id) {
		User user = null;
		
		try(
				Session  session = HibernetConfig.getSessionFactory().openSession(); 
			)
		{
			user = session.get(User.class, 1L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
