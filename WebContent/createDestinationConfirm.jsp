<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/table.css">
<title>宛先情報入力確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>宛先情報入力確認画面</h1>
		<table class="vertical-list-table">
			<!-- 姓入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="姓" /></th>
				<td><s:property value="familyName" /></td>
			</tr>
			<!-- 名入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="名" /></th>
				<td><s:property value="firstName" /></td>
			</tr>
			<!-- 姓ふりがな入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="姓ふりがな" /></th>
				<td><s:property value="familyNameKana" /></td>
			</tr>
			<!-- 名ふりがな入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="名ふりがな" /></th>
				<td><s:property value="firstNameKana" /></td>
			</tr>
			<!-- 住所入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="住所" /></th>
				<td><s:property value="userAddress" /></td>
			</tr>
			<!-- 電話番号入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="電話番号" /></th>
				<td><s:property value="telNumber" /></td>
			</tr>
			<!-- メールアドレス入力確認表示 -->
			<tr>
				<th scope="row"><s:label value="メールアドレス" /></th>
				<td><s:property value="eMail" /></td>
			</tr>
		</table>
		<!-- 登録ボタン表示 -->
		<s:form action="CreateDestinationCompleteAction">
			<div class="submit_btn_box">
				<s:submit value="登録" class="submit_btn" />
			</div>
		</s:form>
		<!-- 戻るボタン表示  CreateDestinationActionへ戻る-->
		<s:form action="CreateDestinationAction">
			<div class="submit_btn_box">
				<s:submit value="戻る" class="submit_btn" />
			</div>
			<s:hidden id="backFlag" name="backFlag" value="1" />
		</s:form>
	</div>
</body>
</html>