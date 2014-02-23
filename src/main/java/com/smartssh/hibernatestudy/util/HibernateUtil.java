package com.smartssh.hibernatestudy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private HibernateUtil() {
	}

	private static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration().configure("hibernate/hibernate.cfg.xml");

		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(sr);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private static Session session;
	public static Session getSession() {
		if (session == null) {
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}


	private static Transaction transaction;
	
	public static void beginTransaction(){
		transaction = getSession().beginTransaction();
	}
	
	public static void commit(){
		transaction.commit();
	}
	
	public static void rollback(){
		transaction.rollback();
	}
}
