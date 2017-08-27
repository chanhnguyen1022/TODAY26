/**
 * @(#)Login form .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * LoginForm is a place to receive input from login.jsp for checking and
 * temporary storage before moving to Action for processing. LoginForms are
 * supported by the abstract base class org.apache.struts.action.ActionForm, so
 * when installed we will have to inherit from this class. The Action Form must
 * be defined in the Struts-config to pass the application using the action form
 */
public class UserLoginForm extends ActionForm {
	/**
	 * Define two userId and password set same name as login.jsp, and generate a
	 * get / set for it. Generates a constructor that accepts two userid and
	 * password parameters
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;

	/**
	 * Function to check the value entered in the login.jsp page.
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		/**
		 * Return result is error if check username is null or username inputed
		 * is have lenght maller 1 character.
		 */

		if (userId == null || userId.length() < 1) {
			errors.add("userId", new ActionMessage("error.userId.required"));
		}
		/**
		 * Return result is error if check password is null or username inputed
		 * is have lenght maller 1 character.
		 */
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));
		}
		return errors;
	}

	public UserLoginForm() {
	}
	/**
	 * @return value userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * Pass values ​​to variables userId.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return value userId
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Pass values ​​to variables password.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}