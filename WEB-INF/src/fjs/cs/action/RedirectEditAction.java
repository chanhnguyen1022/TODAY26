/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fjs.cs.dao.CustomerDAO;
import fjs.cs.action.form.EditForm;
public class RedirectEditAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CustomerDAO dao = new CustomerDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		EditForm editForm = dao.getEditForm(id);
		request.setAttribute("editForm", editForm);
		/**
		 * The user action set is the editcustomer projected into the userid
		 * user option.
		 */
		request.setAttribute("action", "processEdit.do?id=" + id);
		/**
		 * Variables used for struts-congif page navigation. If the variable is
		 * edit then struts-config will navigate to the edit.jsp page
		 */
		return mapping.findForward("edit");

	}
}