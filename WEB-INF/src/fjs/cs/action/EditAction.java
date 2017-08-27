/**
 *@author chanh-nm,
 * @(#)Connect database .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 * Version 1.1.
 */
package fjs.cs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fjs.cs.dao.CustomerDAO;
import fjs.cs.action.form.EditForm;

/**
 * Is a method of handling edit actions. The result of this method is the basis
 * for struts-config to forward to the next operation site, the next page.
 */
public class EditAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		/**
		 * Session is the method used to manage the session between the user and
		 * the system.
		 */
		HttpSession session = request.getSession();
		CustomerDAO dao = new CustomerDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = (String) session.getAttribute("username");
		/**
		 * Here we have derived the fields from the client side by forcing the
		 * Action Form to the EditForm and using it to retrieve the
		 * corresponding fields.
		 */
		EditForm editForm = (EditForm) form;
		int PSN_CD = dao.getPSNCDbyUsername(name);
		editForm.setUpdatePSN(PSN_CD);
		editForm.setUserid(id);
		/**
		 * Taking the value, the return result of the EdittCustomer method has
		 * been initialized in the CustomerDAO class, the attribute values ​​are
		 * set and get in the EditForm class.
		 */
		dao.EditCustomer(editForm);
		/**
		 * Variables used for struts-congif page navigation. If the variable is
		 * result then struts-config will navigate to the search.jsp page
		 */
		return mapping.findForward("result");

	}
}