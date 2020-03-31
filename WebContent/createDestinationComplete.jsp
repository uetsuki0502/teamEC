<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 3秒後に'settlementConfirm.jsp'に自動遷移 -->
<meta http-equiv="refresh" content="3; URL='SettlementConfirmAction'"/>
<link rel="stylesheet" href="./css/style.css">
<title>宛先情報入力完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>宛先情報入力完了画面</h1>
		<div class ="success">
			<p>宛先情報入力が完了しました。</p>
		</div>
	</div>
</body>
</html>