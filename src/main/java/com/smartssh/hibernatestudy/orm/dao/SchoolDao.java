/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.dao.SchoolDao.java
 * 所含类: SchoolDao.java
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
import com.smartssh.hibernatestudy.orm.model.SchoolModel;

/**
 * <p>SchoolDao</p>
 * 
 * <p>学校管理管理模块Dao</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName SchoolDao
 * @author kelvem
 * @version 1.0
 */
@Component("schoolDao")
public class SchoolDao extends Hibernate4DaoBase<SchoolModel, Integer> {

	private static Log log = LogFactory.getLog(SchoolDao.class);


	/**
	 * <p>查询学校管理</p>
	 * 
	 * @param id 学校管理唯一ID
	 * @return SchoolModel 学校管理
	 * @see
	 */
	public SchoolModel getSchoolById(Integer id) {
		return super.getById(SchoolModel.class, id);
	}

	/**
	 * <p>保存学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return Integer keyId
	 * @see
	 */
	public Integer saveSchool(SchoolModel school) {
		return (Integer)super.save(school);
	}

	/**
	 * <p>更新学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return void
	 * @see
	 */
	public void updateSchool(SchoolModel school) {
		super.update(school);
	}

	/**
	 * <p>删除学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return void
	 * @see
	 */
	public void deleteSchool(SchoolModel school){
		super.delete(school);
	}
}
