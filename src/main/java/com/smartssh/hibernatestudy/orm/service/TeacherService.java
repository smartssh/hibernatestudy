/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.service.TeacherService.java
 * 所含类: TeacherService.java
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

import com.smartssh.hibernatestudy.orm.dao.TeacherDao;
import com.smartssh.hibernatestudy.orm.model.TeacherModel;

/**
 * <p>TeacherService</p>
 * 
 * <p>教师管理管理模块Service</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName TeacherService
 * @author kelvem
 * @version 1.0
 */
@Component("teacherService")
public class TeacherService {

	private static Log log = LogFactory.getLog(TeacherService.class);

	@Autowired private TeacherDao teacherDao; 

	/**
	 * <p>查询教师管理</p>
	 * 
	 * @param id 唯一ID
	 * @return TeacherModel 教师管理
	 * @see
	 */
	public TeacherModel getTeacherById(Integer id){
		
		TeacherModel result = this.getTeacherDao().getTeacherById(id);
		return result;
	}

	/**
	 * <p>保存教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return Integer keyId
	 * @see
	 */
	public Integer saveTeacher(TeacherModel teacher){
		
		return this.getTeacherDao().saveTeacher(teacher);
	}

	/**
	 * <p>更新教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return void
	 * @see
	 */
	public void updateTeacher(TeacherModel teacher){
				
		this.getTeacherDao().updateTeacher(teacher);
	}

	/**
	 * <p>删除教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return void
	 * @see
	 */
	public void deleteTeacher(TeacherModel teacher){

		this.getTeacherDao().deleteTeacher(teacher);
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

}
