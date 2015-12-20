package com.simpletech.anniversaryd.model;

import com.simpletech.anniversaryd.annotations.dbmodel.Id;
import com.simpletech.anniversaryd.annotations.dbmodel.Table;
import com.simpletech.anniversaryd.model.base.ModelBase;

/**
 * 数据库表flower
 * @author zimu
 * @date 2015-12-16 11:53:03 中国标准时间
 */
@Table("flower")
public class Flower extends ModelBase{

	/**
	 * 数据库列id
	 */
	@Id
	private Integer id;
	/**
	 * 数据库列name
	 */
	private String name;
	/**
	 * 数据库列flowerNum
	 */
	private Integer flowerNum;
	/**
	 * 数据库列updateTime
	 */
	private java.util.Date updateTime;
	/**
	 * 数据库列createTime
	 */
	private java.util.Date createTime;
	/**
	 * 数据库列deleFlag
	 */
	private Boolean deleFlag;
	/**
	 * 数据库列description
	 */
	private String description;

	public Flower() {
	}
	
	public Integer getId(){
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getFlowerNum(){
		return this.flowerNum;
	}

	public void setFlowerNum(Integer flowerNum) {
		this.flowerNum = flowerNum;
	}
	
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	public Boolean getDeleFlag(){
		return this.deleFlag;
	}

	public void setDeleFlag(Boolean deleFlag) {
		this.deleFlag = deleFlag;
	}
	
	public String getDescription(){
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}