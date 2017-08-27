/**
 * @(#)Login action .java 01-00 2017/08/16.
 * Copyright(C) FUJINET CO., LTD.
 * Version 1.00.
 */
package fjs.cs.action;

import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fjs.cs.dao.CustomerDAO;

/**
 * Is a method of handling delete actions. The result of this method is the
 * basis for struts-config to forward to the next operation site, the next page.
 */
public class DeletedAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CustomerDAO dao = new CustomerDAO();
		String data = request.getParameter("data");
		/**
		 * From a list of customer proceeds remove customer at this location i
		 * selected
		 */
		ArrayList<Integer> isCus = idCustomers(data);
		for (int i : isCus) {
			dao.deleted(i);
		}
		/**
		 * If the variable is search then struts-config will navigate to the
		 * search.jsp page
		 */
		return mapping.findForward("search");
	}

	/*
	 * Method is used to get list customer after delele customer in i .
	 */
	public ArrayList<Integer> idCustomers(String data) {
		ArrayList<Integer> isCus = new ArrayList<Integer>();
		StringTokenizer strto = new StringTokenizer(data, "-");
		while (strto.hasMoreTokens()) {
			isCus.add(Integer.parseInt(strto.nextToken()));
		}
		return isCus;
	}
}
