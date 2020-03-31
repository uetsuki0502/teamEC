<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/milkyway.css">
<link rel="stylesheet" href="./css/style.css">
<title>ユーザー情報確認</title>
</head>
<body>

</head>
<body>
	<jsp:include page="header.jsp" />
		<div id="contents">
			<h1>ユーザー情報入力確認画面</h1>
				<table class="vertical-list-table">
				<tr>
					<%--入力内容を表示 --%>
					<%--見出しセルの方向を横（行）に表示する--%>
					<th scope="row"><s:label value="姓"/></th>
					<td><s:property value="familyName"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="名"/></th>
					<td><s:property value="firstName"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="姓ふりがな"/></th>
					<td><s:property value="familyNameKana"/></td>
				</tr>
				<tr>
				<th scope="row"><s:label value="名ふりがな"/></th>
				<td><s:property value="firstNameKana"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="性別"/></th>
					<td><s:property value="sex"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="メールアドレス"/></th>
					<td><s:property value="email"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="ユーザーID"/>
					<td><s:property value="userId"/>
				</tr>
				<tr>
					<th scope="row"><s:label value="パスワード"/>
					<td><s:property value="password"/>
				</tr>
				</table>
				<s:form action="CreateUserCompleteAction">
					<div class="submit_btn_box">
						<%--登録ボタンを作成 --%>
						<s:submit value="登録" class="submit_btn"/>
					</div>
				</s:form>
				<s:form action="CreateUserAction">
				<%--戻るボタンを作成 --%>
					<div class="submit_btn_box">
						<s:submit value="戻る" class="submit_btn"/>
					</div>
				<%--隠し値を取得--%>
				<s:hidden id="backFlag" name="backFlag" value="1"/>
				</s:form>
		</div>
</body>
</html>