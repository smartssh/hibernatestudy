package com.smartssh.hibernatestudy.orm.dao;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.smartssh.hibernatestudy.orm.model.StudentModel;
import com.smartssh.hibernatestudy.util.HibernateUtil;

public class StudentDaoTest {
	
	private StudentDao studentDao;

	@Before
	public void setUp() throws Exception {
    	
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
    	studentDao = new StudentDao();
    	
    	studentDao.setSessionFactory(sessionFactory);
    	
    	HibernateUtil.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		HibernateUtil.commit();
	}

	@Test
	public void testGetStudentById() {
    	
    	StudentModel student = studentDao.getStudentById(1);
    	
    	System.out.println(student.getName());
    	
		assertNotNull(student);
	}

}
