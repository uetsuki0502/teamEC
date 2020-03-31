<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/milkyway.css">
<link rel="stylesheet" href="./css/style.css">
<title>PesetPasswordConfirm</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="top">
		<h1>パスワード再設定確認画面</h1>
		<table class="vertical-list-table">
			<tr>
				<th scope="row"><s:label value="ユーザーID" /></th>
				<td><s:property value="userId" /></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="新しいパスワード" /></th>
				<td><s:property value="concealedPassword" /></td>
			</tr>
		</table>
		<s:form action="ResetPasswordCompleteAction">
			<div class="submit_btn_box">
				<input type="submit" class="submit_btn" value="パスワード再設定" />
			</div>
		</s:form>
		<s:form action="ResetPasswordAction">
			<div class="submit_btn_box">
				<input type="submit" class="submit_btn" value="戻る" />
			</div>
			<s:hidden id="backFlag" name="backFlag" value="1" />
		</s:form>
	</div>
</body>
</html>