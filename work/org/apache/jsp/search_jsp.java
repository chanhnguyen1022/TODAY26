/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-08-27 18:22:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fjs.cs.action.form.CustomerForm;
import java.util.List;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>AJAX based CRUD operations using jTable in Servlet and\r\n");
      out.write("\tJSP</title>\r\n");
      out.write("<!-- Include one of jTable styles. -->\r\n");
      out.write("<link href=\"css/metro/crimson/jtable.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link href=\"css/jquery-ui-1.10.3.custom.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<!-- Include jTable script file. -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui-1.10.3.custom.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.jtable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"CCFFFF\">\r\n");
      out.write("\t");

		List<CustomerForm> list = (List<CustomerForm>) request.getAttribute("list");
	
      out.write("\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tstyle=\"width: 60%; margin-right: 20%; margin-left: 20%; text-align: center;\">\r\n");
      out.write("\t\t<h1 align=\"left\" style=\"color: red;\">Training</h1>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div id=\"center\">\r\n");
      out.write("\t\t\t<h3 align=\"left\"\">Login > Search Customer</h3>\r\n");
      out.write("\t\t\t<div id=\"1\">\r\n");
      out.write("\t\t\t\t<table align=\"left\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\" width=\"95%;\"><h4>Wellcome ");
      out.print(request.getSession().getAttribute("username") );
      out.write("</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"login.jsp\">Log Out</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<p style=\"padding: 2%;background-color: blue;\"></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"block-search\"\r\n");
      out.write("\t\t\t\tstyle=\"background-color: #F3F781; padding: 1%;\">\r\n");
      out.write("\t\t\t\t<form action=\"processSearch.do\" method=\"post\" id=\"searchForm\"\r\n");
      out.write("\t\t\t\t\tname=\"Form\">\r\n");
      out.write("\t\t\t\t\t<table align=\"center\" cellpadding=\"20%;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"error\" style=\"color: red;\"></span>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"size: 10%;\">Customer Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"customer_Name\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"size: 10%;\">Sex:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"sex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"F\">F</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"M\">M</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"size: 10%;\">Brithday:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" size=\"10%;\" name=\"birthDayStart\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"yyyy-mm-dd\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"padding: 1%;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" size=\"10%;\" name=\"birthDayEnd\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"yyyy-mm-dd\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"Search\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"return checkBirthday();\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table align=\"left\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\" width=\"91.5%;\" style=\"padding-top: 2%;\"><input type=\"button\" id=\"first\" value=\"<<\"><input type=\"button\" id=\"preOne\" value=\"<\"> Privous</td>\r\n");
      out.write("\t\t\t\t\t\t<td>Next <input type=\"button\" id=\"nextOne\" value=\" >\"><input type=\"button\" id=\"last\" value=\">>\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				int index = (Integer) request.getAttribute("start");
				int all = (Integer) request.getAttribute("all");
			
      out.write("\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$('#preOne')\r\n");
      out.write("\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar i =\r\n");
      out.write("\t\t\t");
      out.print(index);
      out.write("\r\n");
      out.write("\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (i == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"preOne\").disabled = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page.do?start=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ (i - 1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#nextOne')\r\n");
      out.write("\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar i =\r\n");
      out.write("\t\t\t");
      out.print(index);
      out.write("\r\n");
      out.write("\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif ((i * 5) + 5 >=\r\n");
      out.write("\t\t\t");
      out.print(all);
      out.write("\r\n");
      out.write("\t\t\t\t) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"nextOne\").disabled = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page.do?start=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ (i + 1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#first')\r\n");
      out.write("\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page.do?start=0\";\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#last')\r\n");
      out.write("\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar all =\r\n");
      out.write("\t\t\t");
      out.print(all);
      out.write("\r\n");
      out.write("\t\t\t\t;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar index = Math.floor(all / 5);\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page.do?start=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ index;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction checkBirthday() {\r\n");
      out.write("\t\t\t\t\tvar start = document.Form.birthDayStart.value;\r\n");
      out.write("\t\t\t\t\tvar end = document.Form.birthDayEnd.value;\r\n");
      out.write("\t\t\t\t\tvar rxDatePattern = /^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$/;\r\n");
      out.write("\t\t\t\t\tif (document.Form.birthDayStart.value === \"\"\r\n");
      out.write("\t\t\t\t\t\t\t&& document.Form.birthDayEnd.value === \"\") {\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tif (start.match(rxDatePattern)) {\r\n");
      out.write("\t\t\t\t\t\t\tif (end.match(rxDatePattern)) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar date1 = new Date(start);\r\n");
      out.write("\t\t\t\t\t\t\t\tvar date2 = new Date(end);\r\n");
      out.write("\t\t\t\t\t\t\t\tif (date2 > date1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(\"error\").innerHTML = \"Ngay sau phai lon hon ngay truoc\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementById(\"error\").innerHTML = \"Ngay sau nhap khong dung dinh dang\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"error\").innerHTML = \"Ngay truoc nhap khong dung dinh dang\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<table  align=\"left\" width=\"100%\" cellpadding=\"10%;\" style=\"margin-top: 3%;margin-bottom: 3%;\">\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"red;\">\r\n");
      out.write("\t\t\t\t\t<th><input type=\"checkbox\" onchange=\"checkAll(this)\"></th>\r\n");
      out.write("\t\t\t\t\t<th>Customer ID</th>\r\n");
      out.write("\t\t\t\t\t<th>Customer Name</th>\r\n");
      out.write("\t\t\t\t\t<th>Sex</th>\r\n");
      out.write("\t\t\t\t\t<th>Birthday</th>\r\n");
      out.write("\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					int count = 0;
					for (CustomerForm cus : list) {
						count ++;
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr class=\"listUser_");
      out.print(count%2 );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<td><input type=\"checkbox\" value=\"");
      out.print(cus.getCustomer_Id());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td><a href=\"edit.do?id=");
      out.print(cus.getCustomer_Id());
      out.write('"');
      out.write('>');
      out.print(cus.getCustomer_Id());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(cus.getCustomer_Name());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(cus.getSex());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(cus.getBirthDay());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(cus.getAddress());
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"block_button\" style=\"padding: 2%;\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<td>\t<input type=\"button\" value=\"Add New\" class=\"button\" onclick=\"location.href='add.do'\"><td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<td>\t<input type=\"submit\" name=\"actionMethod\" id=\"delete\"\r\n");
      out.write("\t\t\t\t\tvalue=\"Delete\"\"></td>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\" align=\"left\">\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<label>Copy right@ 2000-2008 FUJINET, All Rights Reserved.</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$('#delete')\r\n");
      out.write("\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tvar r = confirm(\"Do you like freetuts.net\");\r\n");
      out.write("\t\t\t\t\t\t\tif (r == true) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar selected = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[type=checkbox]:checked\").each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tselected = selected + \"-\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $(this).val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/delete.do?data=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ selected,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talert(\"deleted:\" + selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \" thanh cong\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\terror : function(xhr, status, error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talert('there is some problem in updating data');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\tfunction enableEditDelete() {\r\n");
      out.write("\t\t\tdocument.getElementById('editbutton').disabled = false;\r\n");
      out.write("\t\t\tdocument.getElementById('deletebutton').disabled = false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction checkAll(ele) {\r\n");
      out.write("\t\t     var checkboxes = document.getElementsByTagName('input');\r\n");
      out.write("\t\t     if (ele.checked) {\r\n");
      out.write("\t\t         for (var i = 0; i < checkboxes.length; i++) {\r\n");
      out.write("\t\t             if (checkboxes[i].type == 'checkbox') {\r\n");
      out.write("\t\t                 checkboxes[i].checked = true;\r\n");
      out.write("\t\t             }\r\n");
      out.write("\t\t         }\r\n");
      out.write("\t\t     } else {\r\n");
      out.write("\t\t         for (var i = 0; i < checkboxes.length; i++) {\r\n");
      out.write("\t\t             console.log(i)\r\n");
      out.write("\t\t             if (checkboxes[i].type == 'checkbox') {\r\n");
      out.write("\t\t                 checkboxes[i].checked = false;\r\n");
      out.write("\t\t             }\r\n");
      out.write("\t\t         }\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t\t }\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.listUser_0{\r\n");
      out.write("\t\tbackground-color:#CCFFFF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.listUser_1{\r\n");
      out.write("\t\tbackground-color:#FFFFFF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
