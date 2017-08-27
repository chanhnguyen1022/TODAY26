/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fjs.cs.action.form.UserLoginForm;
import fjs.cs.dao.UserLoginDAO;
/**
 * Is a method of handling login actions. The result of this method is the basis
 * for struts-config to forward to the next operation site, the next page.
 */
public class UserLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		/**
		 * Here we have derived the fields from the client side by forcing the
		 * Action Form to the LoginForm and using it to retrieve the
		 * corresponding fields.
		 */
		UserLoginForm loginForm = (UserLoginForm) form;
		/*
		 * Create String name is value userId taken from UserLoginForm
		 */
		String username = loginForm.getUserId();
		/*
		 * Create String name is value password taken from UserLoginForm
		 */
		String password = loginForm.getPassword();
		UserLoginDAO dao = new UserLoginDAO();
		/**
		 * The function used to get the return result of the authenticate method
		 * is true or false.
		 */
		if (dao.authenticate(username, password)) {
			HttpSession se = request.getSession();
			/**
			 * 
			 The method used to SET a username property.
			 */
			se.setAttribute("username", username);
			/**
			 * Variables used for struts-congif page navigation. If the variable
			 * is success then struts-config will navigate to the search.jsp
			 * page
			 */
			return mapping.findForward("success");
		}else {
			String error="sfadfsdfsd";
			request.setAttribute("error",error);
		}
		/**
		 * If the variable is failure then struts-config will navigate to the
		 * login.jsp page
		 */
	
		return mapping.findForward("failure");
		
	}

}