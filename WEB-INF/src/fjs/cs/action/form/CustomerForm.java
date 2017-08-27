/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 * Version 1.00.
 */
package fjs.cs.action.form;

/**
 * This class contain attribute of customer will showed in seatch.jsp.
 * Attributes include customer_Id, customer_name, sex, birthday,address.
 * 
 */
public class CustomerForm {

	private int Customer_Id;
	private String Customer_Name;
	private String sex;
	private String birthDay;
	private String address;
	/**
	 * @return value Customer_Id
	 */
	public int getCustomer_Id() {
		return Customer_Id;
	}
	/**
	 * Pass values ​​to variables Customer_Id.
	 */
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	/**
	 * @return value Customer_Name
	 */
	public String getCustomer_Name() {
		return Customer_Name;
	}
	/**
	 * Pass values ​​to variables Customer_Name.
	 */
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
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

	@Override
	public String toString() {
		return "CustomerForm [Customer_Id=" + Customer_Id + ", Customer_Name="
				+ Customer_Name + ", sex=" + sex + ", birthDay=" + birthDay
				+ ", address=" + address + "]";
	}

}