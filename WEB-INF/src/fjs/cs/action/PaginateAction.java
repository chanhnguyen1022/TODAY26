/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
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
/**
 * Is the method used to process the partition for the client list of database
 * has been be up
 */
public class PaginateAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CustomerDAO dao = new CustomerDAO();
		int start = Integer.parseInt(request.getParameter("start"));
		request.setAttribute("list", dao.getAllcustomers(start));
		request.setAttribute("start", start);
		request.setAttribute("all", dao.countCustomers());
		return mapping.findForward("page");
	}
}
