package com.smartssh.hibernatestudy.orm.dao;

import static org.junit.Assert.assertNotNull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.smartssh.hibernatestudy.orm.model.StudentModel;
import com.smartssh.hibernatestudy.orm.model.TeacherModel;

public class MicroActionStep2Test {
	
	public static SessionFactory sessionFactory;
	public static Session session;
	public static Transaction transaction;
	
	/**
	 * 读取并创建SessionFactory
	 */
	static {
		Configuration cfg = new Configuration().configure("hibernate/hibernate.cfg.xml");

		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(sr);
	}
	
	@Test
	public void test() {
    	
		try {
			/**
			 * 获取session
			 */
			if (session == null) {
				session = sessionFactory.getCurrentSession();
			}
			if (session.isOpen() == false) {
				print(session);
				System.out.println("================= sessionFactory.openSession() ===============");
				session = sessionFactory.openSession();
			}
			
			/**
			 * 开始事务
			 */
			if (transaction == null || transaction.isActive() == false) {
				transaction = session.beginTransaction();
			}
			
			/**
			 * 打印信息
			 */
			print(sessionFactory);
			print(session);
			print(transaction);
			
			/**
			 * 查询学生信息
			 */
	    	StudentModel student = (StudentModel)session.get(StudentModel.class, 1);
	    	System.out.println("########### student ############");
	    	System.out.println("student.getName() = " + student.getName());
			assertNotNull(student);

			/**
			 * 提交事务
			 */
			transaction.commit();

			// ################################################################################
			
			for (int i = 0; i < 3; i++) {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("!@#$%^&*------------------------ Test Cnt " + i + " ------------------------!@#$%^&*");
				/**
				 * 获取session
				 */
				System.out.println("================= 获取session ===============");
				if (session.isOpen() == false) {
					System.out.println("================= sessionFactory.openSession() ===============");
					
					// 二选一
					session = sessionFactory.openSession();
//					session = sessionFactory.getCurrentSession();
				}
	
				/**
				 * 开始事务
				 */
				System.out.println("================= 开始事务 ===============");
				if (transaction == null || transaction.isActive() == false) {
					System.out.println("================= session.beginTransaction() ===============");
					transaction = session.beginTransaction();
				}
	
				/**
				 * 打印信息
				 */
				System.out.println("================= 打印信息 ===============");
				print(sessionFactory);
				print(session);
				print(transaction);
	
				/**
				 * 查询老师信息
				 */
				System.out.println("================= 查询老师信息 ===============");
				TeacherModel teacher = (TeacherModel)session.get(TeacherModel.class, 1);
				System.out.println("########### teacher ############");
				System.out.println("teacher.getName() = " + teacher.getName());
				assertNotNull(teacher);
	
				/**
				 * 提交事务
				 */
				System.out.println("================= 提交事务 ===============");
				transaction.commit();
	
				/**
				 * 打印信息
				 */
				System.out.println("================= 打印信息 ===============");
				print(sessionFactory);
				print(session);
				print(transaction);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void print(SessionFactory sessionFactory){
		System.out.println();
		System.out.println("########### SessionFactory ############");
		System.out.println("SessionFactory.getClass() = " + sessionFactory.getClass());
		System.out.println("SessionFactory.isClosed() = " + sessionFactory.isClosed());
		System.out.println("sessionFactory.getCurrentSession() = " + sessionFactory.getCurrentSession());
		System.out.println("sessionFactory.getCurrentSession().hashCode() = " + sessionFactory.getCurrentSession().hashCode());
		System.out.println();
	}
	
	private void print(Session session){
		System.out.println();
		System.out.println("########### Session ############");
		System.out.println("session = " + session);
		System.out.println("session.isOpen() = " + session.isOpen());
		System.out.println("session.isConnected() = " + session.isConnected());
		System.out.println("session.hashCode() = " + session.hashCode());
		System.out.println();
	}
	
	private void print(Transaction transaction){
		System.out.println();
		System.out.println("########### Transaction ############");
		System.out.println("transaction.isActive() = " + transaction.isActive());
		System.out.println("transaction.getLocalStatus().name() = " + transaction.getLocalStatus().name());
		System.out.println();
	}
}
