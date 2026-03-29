package com.springboot.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.springboot.config.HibernetConfig;
import com.springboot.entities.User;

@Repository
public class Dboperationimp implements Dboperation{

	@Override
	public User getUserdetail(long id) {
		User user = null;
		
		try(
				Session  session = HibernetConfig.getSessionFactory().openSession(); 
			)
		{
			user = session.get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
