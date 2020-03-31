
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;URL='LoginAction'"/>	<%--３秒後に遷移--%>
<link rel="stylesheet" href="./css/style.css">
<title>登録完了</title>
</head>
<body>
	<jsp:include page="header.jsp" />
		<div id="contents">
			<h1>ユーザー情報入力完了画面</h1>
			<div class="success">
				<p>ユーザー情報入力が完了しました。</p>
			</div>
		</div>
</body>
</html>