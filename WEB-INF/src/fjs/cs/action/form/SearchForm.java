/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.action.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
/**
 * SearchForm is a place to receive input from login.jsp for checking and
 * temporary storage before moving to Action for processing. SearchForms are
 * supported by the abstract base class org.apache.struts.action.ActionForm, so
 * when installed we will have to inherit from this class. The Action Form must
 * be defined in the Struts-config to pass the application using the action form
 */
public class SearchForm extends ActionForm {
	/**
	 * Contain CustomerName,sex,birthDayStart,birthDayEnd set same name as
	 * login.jsp, and generate a get / set for it. Generates a constructor that
	 * accepts CustomerName,sex,birthDayStart,birthDayEnd parameters
	 */
	private String customer_Name;
	private String sex;
	private String birthDayStart;
	private String birthDayEnd;
	/**
	 * @return value Customer_Name
	 */
	public String getCustomer_Name() {
		return customer_Name;
	}
	/**
	 * Pass values ​​to variables customer_Name.
	 */
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
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
	 * @return value birthDayStart
	 */
	public String getBirthDayStart() {
		return birthDayStart;
	}
	/**
	 * Pass values ​​to variables birthDayStart.
	 */
	public void setBirthDayStart(String birthDayStart) {
		this.birthDayStart = birthDayStart;
	}
	/**
	 * @return value birthDayEnd
	 */
	public String getBirthDayEnd() {
		return birthDayEnd;
	}
	/**
	 * Pass values ​​to variables birthDayEnd.
	 */
	public void setBirthDayEnd(String birthDayEnd) {
		this.birthDayEnd = birthDayEnd;
	}

	@Override
	public String toString() {
		return "SearchForm [Customer_Name=" + customer_Name + ", sex=" + sex
				+ ", birthDayStart=" + birthDayStart + ", birthDayEnd="
				+ birthDayEnd + "]";
	}

}