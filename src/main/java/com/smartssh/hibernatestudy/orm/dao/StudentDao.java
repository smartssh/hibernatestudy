/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.dao.StudentDao.java
 * 所含类: StudentDao.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/

package com.smartssh.hibernatestudy.orm.dao;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.smartssh.hibernatestudy.base.Hibernate4DaoBase;
import com.smartssh.hibernatestudy.orm.model.StudentModel;
import com.smartssh.hibernatestudy.util.HibernateUtil;

/**
 * <p>StudentDao</p>
 * 
 * <p>学生管理管理模块Dao</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName StudentDao
 * @author kelvem
 * @version 1.0
 */
@Component("studentDao")
public class StudentDao extends Hibernate4DaoBase<StudentModel, Integer> {
//	public class StudentDao {

	private static Log log = LogFactory.getLog(StudentDao.class);
	
	/**
	 * <p>查询学生管理</p>
	 * 
	 * @param id 学生管理唯一ID
	 * @return StudentModel 学生管理
	 * @see
	 */
	public StudentModel getStudentById(Integer id) {

		return super.getById(StudentModel.class, id);
	}

//	/**
//	 * <p>保存学生管理</p>
//	 * 
//	 * @param student 学生管理
//	 * @return Integer keyId
//	 * @see
//	 */
//	public Integer saveStudent(StudentModel student) {
//		return (Integer)super.save(student);
//	}
//
//	/**
//	 * <p>更新学生管理</p>
//	 * 
//	 * @param student 学生管理
//	 * @return void
//	 * @see
//	 */
//	public void updateStudent(StudentModel student) {
//		super.update(student);
//	}
//
//	/**
//	 * <p>删除学生管理</p>
//	 * 
//	 * @param student 学生管理
//	 * @return void
//	 * @see
//	 */
//	public void deleteStudent(StudentModel student){
//		super.delete(student);
//	}
}
