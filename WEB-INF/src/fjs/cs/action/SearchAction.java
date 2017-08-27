/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 *
 * Version 1.00.
 */
package fjs.cs.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fjs.cs.action.form.SearchForm;
import fjs.cs.action.form.CustomerForm;
import fjs.cs.dao.SearchDAO;
/**
 * Is a method of handling search actions. The result of this method is the basis
 * for struts-config to forward to the next operation site, the next page.
 */
public class SearchAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/**
		 * Here we have derived the fields from the client side by forcing the
		 * Action Form to the SearchForm and using it to retrieve the
		 * corresponding fields.
		 */
		SearchForm searchForm = (SearchForm) form;
		SearchDAO dao = new SearchDAO();
		/**
		 * Returns the result of the customer list after the search. The search
		 * method was initialized in the SearchDAO class
		 */
		List<CustomerForm> list = dao.searchCustomers(searchForm);
		request.setAttribute("list", list);
		request.setAttribute("start", 0);
		request.setAttribute("all", 0);
		/**
		 * Variables used for struts-congif page navigation. If the variable is
		 * result then struts-config will navigate to the search.jsp page
		 */
		return mapping.findForward("result");
	}
}
