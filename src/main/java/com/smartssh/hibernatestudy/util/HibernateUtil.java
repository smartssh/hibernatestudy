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

	public static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration().configure("hibernate/hibernate.cfg.xml");

		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(sr);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public static Transaction transaction;
	
	public static void beginTransaction(){
		try {
			transaction = sessionFactory.getCurrentSession().getTransaction();
			if (transaction == null || transaction.isActive() == false) {
				transaction = sessionFactory.getCurrentSession().beginTransaction();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(){
		try {
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(){
		try {
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void print(SessionFactory sessionFactory){
		System.out.println("########### SessionFactory ############");
		System.out.println("SessionFactory.isClosed() = " + sessionFactory.isClosed());
		System.out.println("sessionFactory.getCurrentSession() = " + sessionFactory.getCurrentSession());
		System.out.println("sessionFactory.getCurrentSession().hashCode() = " + sessionFactory.getCurrentSession().hashCode());
		
	}
	
	public static void print(Session session){
		System.out.println("########### Session ############");
		System.out.println("session = " + session);
		System.out.println("session.isOpen() = " + session.isOpen());
		System.out.println("session.hashCode() = " + session.hashCode());
	}
	
	public static void print(Transaction transaction){
		System.out.println("########### Transaction ############");
		System.out.println("transaction.isActive() = " + transaction.isActive());
		System.out.println("transaction.getLocalStatus().name() = " + transaction.getLocalStatus().name());
	}
}
