<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/milkyway.css">
<link rel="stylesheet" href="./css/style.css">
<title>ResetPassword</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="top">
		<h1>パスワード再設定画面</h1>
	</div>
	<!-- 	入力に誤りがある場合はそれぞれに合ったエラーを送る -->
	<s:if
		test="userIdErrorMessageList!=null && userIdErrorMessageList.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="userIdErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if
		test="passwordErrorMessageList!=null && passwordErrorMessageList.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="passwordErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if
		test="newPasswordErrorMessageList!=null && newPasswordErrorMessageList.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="newPasswordErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if
		test="reConfirmationNewPasswordErrorMessageList!=null && reConfirmationNewPasswordErrorMessageList.size()>0">
		<div class="error">
			<div class="error-message">
				<s:iterator value="reConfirmationNewPasswordErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>
	<s:if
		test="passwordIncorrectErrorMessage!=null && !passwordIncorrectErrorMessage.isEmpty()">
		<div class="error">
			<div class="error-message">
				<s:property value="passwordIncorrectErrorMessage" />
				<br>
			</div>
		</div>
	</s:if>
	<s:if
		test="newPasswordIncorrectErrorMessage!=null && !newPasswordIncorrectErrorMessage.isEmpty()">
		<div class="error">
			<div class="error-message">
				<s:property value="newPasswordIncorrectErrorMessage" />
				<br>
			</div>
		</div>
	</s:if>
	<!-- 確認ボタン押下後。パスワード再設定確認画面へ移動 -->
	<s:form action="ResetPasswordConfirmAction">
		<table class="vertical-list-table">
			<tr>
				<th scope="row"><s:label value="ユーザーID" /></th>
				<td><s:textfield name="userId"
						value="%{#session.userIdForResetPassword}" placeholder="ユーザーID"
						class="txt" /></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="現在のパスワード" /></th>
				<td><s:password name="password" value="" placeholder="現在のパスワード"
						class="txt" /></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="新しいパスワード" /></th>
				<td><s:password name="newPassword" value=""
						placeholder="新しいパスワード" class="txt" /></td>
			<tr>
				<th scope="row"><s:label value="新しいパスワード（再確認）" /></th>
				<td><s:password name="reConfirmationPassword" value=""
						placeholder="新しいパスワード（再確認）" class="txt" /></td>
			</tr>
		</table>
		<div class="submit_btn_box">
			<input type="submit" class="submit_btn" value="確認" />
		</div>
	</s:form>
</body>
</html>
