/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.service.SchoolService.java
 * 所含类: SchoolService.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smartssh.hibernatestudy.orm.dao.SchoolDao;
import com.smartssh.hibernatestudy.orm.model.SchoolModel;

/**
 * <p>SchoolService</p>
 * 
 * <p>学校管理管理模块Service</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName SchoolService
 * @author kelvem
 * @version 1.0
 */
@Component("schoolService")
public class SchoolService {

	private static Log log = LogFactory.getLog(SchoolService.class);

	@Autowired private SchoolDao schoolDao; 

	/**
	 * <p>查询学校管理</p>
	 * 
	 * @param id 唯一ID
	 * @return SchoolModel 学校管理
	 * @see
	 */
	public SchoolModel getSchoolById(Integer id){
		
		SchoolModel result = this.getSchoolDao().getSchoolById(id);
		return result;
	}

	/**
	 * <p>保存学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return Integer keyId
	 * @see
	 */
	public Integer saveSchool(SchoolModel school){
		
		return this.getSchoolDao().saveSchool(school);
	}

	/**
	 * <p>更新学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return void
	 * @see
	 */
	public void updateSchool(SchoolModel school){
				
		this.getSchoolDao().updateSchool(school);
	}

	/**
	 * <p>删除学校管理</p>
	 * 
	 * @param school 学校管理
	 * @return void
	 * @see
	 */
	public void deleteSchool(SchoolModel school){

		this.getSchoolDao().deleteSchool(school);
	}

	public SchoolDao getSchoolDao() {
		return schoolDao;
	}

	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}

}
