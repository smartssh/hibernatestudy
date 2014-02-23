/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.model.TeacherModel.java
 * 所含类: TeacherModel.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.model;

import java.util.Date;


/**
 * <p>TeacherModel</p>
 * 
 * <p>教师管理Model</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName TeacherModel
 * @author kelvem
 * @version 1.0
 */
public class TeacherModel implements java.io.Serializable {

	private static final long serialVersionUID = -1L;
	
	// Fields
	private Integer id;

	private String name;
	private Integer sex;
	private Date birthday;
	private Integer subject;
	private Date updateTime;
	private Integer schoolId;


	/** default constructor */
	public TeacherModel() {
	}

	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getSex() {
		return this.sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Integer getSubject() {
		return this.subject;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Integer getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	

}
