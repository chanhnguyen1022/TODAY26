<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="fjs.cs.action.form.EditForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EDIT PAGES</title>
<!-- Include jTable script file. -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="CCFFFF">
	<%
		EditForm form = (EditForm) request.getAttribute("editForm");
		String action = (String) request.getAttribute("action");
	%>
	<form action="<%=action%>" method="post" id="editForm" name="Form">
		<div
			style="width: 60%; margin-right: 20%; margin-left: 20%; text-align: center;">
			<h1 align="left" style="color: red;">Training</h1>
			<hr>
			<div id="center">
				<h4 align="left"">Login > Search Customer>Edit Customer Info</h4>
				<div id="1">
					<table align="left">
						<tr>
							<td align="left" width="95%;"><h4>
									Wellcome
									<%=request.getSession().getAttribute("username")%></h4></td>
							<td><a href="login.jsp">Log Out</a></td>
						</tr>
					</table>
				</div>
				<br> <br>
				<div style="background-color: blue;">
					<h4>
						<p style="color: white;" align="left">Edit</p>
					</h4>
				</div>

				<div id="center" width="70%" height="25%" cellpadding="5"
					align="center" style="padding: 10%; font-weight: bold;">

					<table cellpadding="10%;">
						<tr>
							<th colspan="2"><h5 id="error" style="color: red;"></h5></th>
						</tr>
						<tr>
							<td>Customer Id:</td>
							<td><label >
								<%if (form.getUserid() != 0) {%> <%=form.getUserid()%><%}%></label></td>
						</tr>
						<tr>
							<td>Customer Name:</td>
							<td><input type="text" size="42%" name="customerName"
								<%if (form.getCustomerName() != null) {%>
								value="<%=form.getCustomerName()%>" <%}%>></td>
						</tr>
						<tr>
							<td>Sex:</td>
							<td align="left"><select name="sex">
									<option value="M"
										<%=form.getSex().equals("M") ? "selected" : ""%>>M</option>
									<option value="F"
										<%=form.getSex().equals("F") ? "selected" : ""%>>F</option>
							</select></td>
						</tr>
						<tr>
							<td>Birthday:</td>
							<td><input type="text" size="42%" name="birthDay"
								<%if (form.getBirthDay() != null) {%>
								value="<%=form.getBirthDay()%>" <%}%>></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input type="text" size="42%" name="email"
								<%if (form.getEmail() != null) {%> value="<%=form.getEmail()%>"
								<%}%>></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><input type="text" style="padding: 7%;" size="35%;"
								name="address" <%if (form.getAddress() != null) {%>
								value="<%=form.getAddress()%>" <%}%>></td>
						</tr>
						<tr>
							<td></td>
							<td colspan="2" align="center"><input type="submit"
								value="Save"> <%
 	if (action.equals("processAdd.do")) {
 %> <input
								type="button" id="add" value="Clear"> <%
 	} else {
 %> <input
								type="button" id="edit" value="Clear"> <%
 	}
 %></td>
					</table>

				</div>
				<div id="footer" style="width: 100%; text-align: left;">
					<hr>
					<label>Copy right@ 2000-2008 FUJINET, All Rights Reserved.</label>
				</div>

			</div>
	</form>
	<script>
		function validate() {
			if (document.Form.customerName.value === ""
					|| document.Form.customerName.value === null) {
				alert(document.Form.customerName.value );
				document.getElementById("error").innerHTML = "ユーザーIDを入力してください。1";

				return false;
			}

			if (document.Form.birthDay.value === ""
					|| document.Form.birthDay.value === null) {
				document.getElementById("error").innerHTML = "パスワードを入力してください。2";

				return false;

			}
			if (document.Form.email.value === ""
					|| document.Form.email.value === null) {
				document.getElementById("error").innerHTML = "パスワードを入力してください。3";

				return false;

			}
			if (document.Form.address.value === ""
					|| document.Form.address.value === null) {
				document.getElementById("error").innerHTML = "パスワードを入力してください。4";

				return false;
			}
			var rxDatePattern = /^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$/;

			if (rxDatePattern.test(document.Form.birthDay.value) == false) {
				document.getElementById("error").innerHTML = "誕生日が不正です。";
				return false;
		}
			var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

			if (reg.test(document.Form.email.value) == false) {
				document.getElementById("error").innerHTML = "メールアドレスが不正です。";
				return false;
		}
			return (true);
		}

		$("#add").click(function(event) {
			document.Form.customerName.value = "";
			document.Form.birthDay.value = "";
			document.Form.email.value = "";
			document.Form.address.value = "";
			document.getElementById("error").innerHTML = "";

		});
		$("#edit").click(function(event) {
			window.location.reload();

		});
		$("#editForm").submit(function(event) {
			return validate();
		});
	</script>
</body>
</html>
