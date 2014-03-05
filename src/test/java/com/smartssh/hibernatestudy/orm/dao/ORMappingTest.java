package com.smartssh.hibernatestudy.orm.dao;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.smartssh.hibernatestudy.orm.model.SchoolModel;
import com.smartssh.hibernatestudy.orm.model.TeacherModel;
import com.smartssh.hibernatestudy.util.HibernateUtil;

public class ORMappingTest {
	
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
	public void testManyToOne() {
    	
		System.out.println("");
		System.out.println("testManyToOne");
		System.out.println("");
		
		try {
			TeacherModel teacher = teacherDao.getTeacherById(1);
			
			System.out.println(teacher.getName());
			
			assertNotNull(teacher);
			
			System.out.println(teacher.getSchoolId());
			System.out.println(teacher.getSchool().getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testOneToMany() {
    	
		System.out.println("");
		System.out.println("testOneToMany");
		System.out.println("");
    	
		try {
			SchoolModel school = schoolDao.getSchoolById(1);
			
			System.out.println(school.getName());
			
			assertNotNull(school);
			
			System.out.println(school.getTeacherSet());
			System.out.println(school.getTeacherSet().size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testOneToOne() {
    	
		System.out.println("");
		System.out.println("testOneToOne");
		System.out.println("");
    	
		try {
			SchoolModel school = schoolDao.getSchoolById(1);
			
			System.out.println(school.getName());
			
			assertNotNull(school);
			
			System.out.println(school.getSchoolInfo());
			System.out.println(school.getSchoolInfo().getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
