package com.springboot.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetConfig {

	public static SessionFactory getSessionFactory()
	{
		Configuration configuration = new Configuration();
		configuration.configure("/com/springboot/resource/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
 
		return factory;
	}
}
