/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.model.StudentModel.java
 * 所含类: StudentModel.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.model;

import java.sql.Blob;
import java.util.Date;


/**
 * <p>StudentModel</p>
 * 
 * <p>学生管理Model</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName StudentModel
 * @author kelvem
 * @version 1.0
 */
public class StudentModel implements java.io.Serializable {

	private static final long serialVersionUID = -1L;
	
	// Fields
	private Integer id;

	private String name;
	private Integer sex;
	private Date birthday;
	private Float meatCardBalance;
	private String phone;
	private boolean joinFootballTeam;
	private Blob photograph;
	private Date udateTime;


	/** default constructor */
	public StudentModel() {
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
	
	public Date getUdateTime() {
		return this.udateTime;
	}
	public void setUdateTime(Date udateTime) {
		this.udateTime = udateTime;
	}

	public Float getMeatCardBalance() {
		return meatCardBalance;
	}

	public void setMeatCardBalance(Float meatCardBalance) {
		this.meatCardBalance = meatCardBalance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isJoinFootballTeam() {
		return joinFootballTeam;
	}

	public void setJoinFootballTeam(boolean joinFootballTeam) {
		this.joinFootballTeam = joinFootballTeam;
	}

	public Blob getPhotograph() {
		return photograph;
	}

	public void setPhotograph(Blob photograph) {
		this.photograph = photograph;
	}

}
