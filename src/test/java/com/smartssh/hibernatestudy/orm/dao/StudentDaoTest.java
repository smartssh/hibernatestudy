package com.smartssh.hibernatestudy.orm.dao;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.smartssh.hibernatestudy.orm.model.SchoolModel;
import com.smartssh.hibernatestudy.orm.model.StudentModel;
import com.smartssh.hibernatestudy.orm.model.TeacherModel;
import com.smartssh.hibernatestudy.util.HibernateUtil;

public class StudentDaoTest {
	
	private StudentDao studentDao;
	private TeacherDao teacherDao;
	private SchoolDao schoolDao;

	@Before
	public void setUp() throws Exception {
    	
    	try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			studentDao = new StudentDao();
			studentDao.setSessionFactory(sessionFactory);

			teacherDao = new TeacherDao();
			teacherDao.setSessionFactory(sessionFactory);

			schoolDao = new SchoolDao();
			schoolDao.setSessionFactory(sessionFactory);

			HibernateUtil.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		try {
			HibernateUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetStudentById() {
    	
    	StudentModel student = studentDao.getStudentById(1);
    	
    	System.out.println(student.getName());
    	
		assertNotNull(student);
		
	}

}
