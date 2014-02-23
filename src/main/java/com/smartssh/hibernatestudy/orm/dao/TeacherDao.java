/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.dao.TeacherDao.java
 * 所含类: TeacherDao.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/

package com.smartssh.hibernatestudy.orm.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.smartssh.hibernatestudy.base.Hibernate4DaoBase;
import com.smartssh.hibernatestudy.orm.model.TeacherModel;

/**
 * <p>TeacherDao</p>
 * 
 * <p>教师管理管理模块Dao</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName TeacherDao
 * @author kelvem
 * @version 1.0
 */
@Component("teacherDao")
public class TeacherDao extends Hibernate4DaoBase<TeacherModel, Integer> {

	private static Log log = LogFactory.getLog(TeacherDao.class);


	/**
	 * <p>查询教师管理</p>
	 * 
	 * @param id 教师管理唯一ID
	 * @return TeacherModel 教师管理
	 * @see
	 */
	public TeacherModel getTeacherById(Integer id) {
		return super.getById(TeacherModel.class, id);
	}

	/**
	 * <p>保存教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return Integer keyId
	 * @see
	 */
	public Integer saveTeacher(TeacherModel teacher) {
		return (Integer)super.save(teacher);
	}

	/**
	 * <p>更新教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return void
	 * @see
	 */
	public void updateTeacher(TeacherModel teacher) {
		super.update(teacher);
	}

	/**
	 * <p>删除教师管理</p>
	 * 
	 * @param teacher 教师管理
	 * @return void
	 * @see
	 */
	public void deleteTeacher(TeacherModel teacher){
		super.delete(teacher);
	}
}
