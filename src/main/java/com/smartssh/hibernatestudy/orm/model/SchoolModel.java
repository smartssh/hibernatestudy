/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.model.SchoolModel.java
 * 所含类: SchoolModel.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.model;

import java.util.Date;


/**
 * <p>SchoolModel</p>
 * 
 * <p>学校管理Model</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName SchoolModel
 * @author kelvem
 * @version 1.0
 */
public class SchoolModel implements java.io.Serializable {

	private static final long serialVersionUID = -1L;
	
	// Fields
	private Integer id;

	private String name;
	private String address;
	private String zip;
	private String presidend;
	private Date updateTime;


	/** default constructor */
	public SchoolModel() {
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
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPresidend() {
		return this.presidend;
	}
	public void setPresidend(String presidend) {
		this.presidend = presidend;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

}
