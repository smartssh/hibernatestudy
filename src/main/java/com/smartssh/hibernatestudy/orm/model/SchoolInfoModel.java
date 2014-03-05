/**============================================================
 * 版权：kelvem.com 版权所有 (c) 2012 - 2014
 * 文件：com.smartssh.hibernatestudy.orm.model.SchoolInfoModel.java
 * 所含类: SchoolInfoModel.java
 * 修改记录：
 * 日期				作者						内容
 * =============================================================
 * 2014-02-23	kelvem			创建文件，实现基本功能
 * ============================================================*/
package com.smartssh.hibernatestudy.orm.model;

import java.util.Date;
import java.util.Set;


/**
 * <p>SchoolInfoModel</p>
 * 
 * <p>学校管理Model</p>
 * 
 * <p>Copyright: 版权所有 (c) 2012 - 2014</p>
 * <p>Company: kelvem.com</p>
 * 
 * @ClassName SchoolInfoModel
 * @author kelvem
 * @version 1.0
 */
public class SchoolInfoModel implements java.io.Serializable {

	private static final long serialVersionUID = -1L;
	
	// Fields
	private Integer schoolInfoId;

	private String name;

	/** default constructor */
	public SchoolInfoModel() {
	}

	public Integer getSchoolInfoId() {
		return schoolInfoId;
	}

	public void setSchoolInfoId(Integer schoolInfoId) {
		this.schoolInfoId = schoolInfoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
