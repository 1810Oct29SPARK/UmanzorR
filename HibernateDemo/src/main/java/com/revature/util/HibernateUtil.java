package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (HibernateUtil.sessionFactory == null) {
			// if no sessionfactory has been created, create one
			Configuration c = new Configuration();
//			c.setProperty("hibernate.connection.username", System.getenv("USERNAME"));
//			c.setProperty("hibernate.connection.password", System.getenv("PASSWORD"));
//			c.setProperty("hibernate.connection.url", System.getenv("URL"));
			c.configure(); // by default, it looks for hibernate.cfg.xml in src/main/resources
			HibernateUtil.sessionFactory = c.buildSessionFactory();
		}
		return HibernateUtil.sessionFactory;
	}

}
