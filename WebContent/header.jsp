<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/header.css">
<title>HEADER</title>
</head>
<body>
	<div id="header">
		<div id="header-title">milkyway</div>
		<div id="header-menu">
		<table>
			<tr>
				<s:form action="SearchItemAction">
					<!--     カテゴリー表示 -->
					<s:if
						test='#session.mCategoryDTOList!=null && #session.mCategoryDTOList.size()>0'>
						<td><s:select name="categoryId"
								list="#session.mCategoryDTOList" listKey="categoryId"
								listValue="categoryName" id="categoryId" /></td>
					</s:if>
					<!-- 検索ワード -->
					<td><input type="text" class="txt-keywords"
                            name="productName" size="30" placeholder="検索ワード" value="<s:property value="productName"/>" /></td>
					<!--                検索ボタン押下 -->
					<td><input type="submit" value="商品検索" class="submit_btn1" /></td>
				</s:form>
				<!-- 			ログイン状態ならログアウトボタン表示 -->
				<s:if test="#session.logined==1">
					<s:form action="LogoutAction">
						<td><input type="submit" value="ログアウト" class="submit_btn1" /></td>
					</s:form>
				</s:if>
				<s:else>
					<!-- 			未ログインならログインボタン表示 -->
					<s:if test="#session.logined== 0">
						<s:form action="GoLoginAction">
							<td><input type="submit" value="ログイン" class="submit_btn1" /></td>
						</s:form>
					</s:if>
				</s:else>
				<!-- 			カートボタン表示 -->
				<s:form action="CartAction">
					<td><input type="submit" value="カート" class="submit_btn1" /></td>
				</s:form>
				<!-- 			ログイン状態ならマイページボタン表示 -->
				<s:if test="#session.logined==1">
					<s:form action="MyPageAction">
						<td><input type="submit" value="マイページ" class="submit_btn1" /></td>
					</s:form>
				</s:if>
			</tr>
		</table>
	</div>
	</div>
</body>
</html>
