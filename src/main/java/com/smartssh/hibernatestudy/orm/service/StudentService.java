/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.service.StudentService.java
 * 所含类: StudentService.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smartssh.hibernatestudy.orm.dao.StudentDao;
import com.smartssh.hibernatestudy.orm.model.StudentModel;

/**
 * <p>StudentService</p>
 * 
 * <p>学生管理管理模块Service</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName StudentService
 * @author kelvem
 * @version 1.0
 */
@Component("studentService")
public class StudentService {

	private static Log log = LogFactory.getLog(StudentService.class);

	@Autowired private StudentDao studentDao; 

	/**
	 * <p>查询学生管理</p>
	 * 
	 * @param id 唯一ID
	 * @return StudentModel 学生管理
	 * @see
	 */
	public StudentModel getStudentById(Integer id){
		
		StudentModel result = this.getStudentDao().getStudentById(id);
		return result;
	}

	/**
	 * <p>保存学生管理</p>
	 * 
	 * @param student 学生管理
	 * @return Integer keyId
	 * @see
	 */
//	public Integer saveStudent(StudentModel student){
//		
//		return this.getStudentDao().saveStudent(student);
//	}

	/**
	 * <p>更新学生管理</p>
	 * 
	 * @param student 学生管理
	 * @return void
	 * @see
	 */
//	public void updateStudent(StudentModel student){
//				
//		this.getStudentDao().updateStudent(student);
//	}

	/**
	 * <p>删除学生管理</p>
	 * 
	 * @param student 学生管理
	 * @return void
	 * @see
	 */
//	public void deleteStudent(StudentModel student){
//
//		this.getStudentDao().deleteStudent(student);
//	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
