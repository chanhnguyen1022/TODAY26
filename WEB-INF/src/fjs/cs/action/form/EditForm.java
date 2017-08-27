/**
 *@author chanh-nm,
 * @(#)Connect database .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 * Version 1.1.
 */
package fjs.cs.action.form;

import java.sql.Date;

import org.apache.struts.action.ActionForm;

/**
 * Contains userid, customerName, sex, birthDay, address, email, insert,
 * insertPSN and updatePSN set same name as edit.jsp, and generate a get / set
 * for it. Generates a constructor that accepts serid, customerName, sex,
 * birthDay, address, email, insert, insertPSN and updatePSN parameters
 */
@SuppressWarnings("serial")
public class EditForm extends ActionForm {
	private int userid;
	private String customerName;
	private String sex;
	private String birthDay;
	private String address;
	private String email;
	private Date insert;
	private int insertPSN;
	private int updatePSN;
	/**
	 * @return value userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * Pass values ​​to variables userid.
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return value customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * Pass values ​​to variables customerName.
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return value sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * Pass values ​​to variables sex.
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return value birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * Pass values ​​to variables birthDay.
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return value address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Pass values ​​to variables address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return value email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Pass values ​​to variables email.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return value insert
	 */
	public Date getInsert() {
		return insert;
	}
	/**
	 * Pass values ​​to variables insert.
	 */
	public void setInsert(Date insert) {
		this.insert = insert;
	}
	/**
	 * @return value insertPSN
	 */
	public int getInsertPSN() {
		return insertPSN;
	}
	/**
	 * Pass values ​​to variables insertPSN.
	 */
	public void setInsertPSN(int insertPSN) {
		this.insertPSN = insertPSN;
	}
	/**
	 * @return value updatePSN
	 */
	public int getUpdatePSN() {
		return updatePSN;
	}
	/**
	 * Pass values ​​to variables updatePSN.
	 */
	public void setUpdatePSN(int updatePSN) {
		this.updatePSN = updatePSN;
	}

	@Override
	public String toString() {
		return "EditForm [userid=" + userid + ", customerName=" + customerName
				+ ", sex=" + sex + ", birthDay=" + birthDay + ", address="
				+ address + ", email=" + email + ", insert=" + insert
				+ ", insertPSN=" + insertPSN + ", updatePSN=" + updatePSN + "]";
	}
}
