<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/table.css">
		<link rel="stylesheet" href="./css/milkyway.css">
		<title>カート</title>
		<script type="text/javascript">
			function checkValue(){
				var checkList = document.getElementsByClassName("check");
				var checkFlag = 0;
				for (var i = 0;  i<checkList.length;  i++) {
					if(checkList[i].checked) {
						checkFlag = 1;
						break;
					}
				}
				if (checkFlag == 1) {
			    	document.getElementById('deleteButton').disabled="";
				} else {
					document.getElementById('deleteButton').disabled="true";
				}
			}
		</script>
	</head>
	<body>
		<script src="./js/milkyway.js"></script>
		<jsp:include page="header.jsp" />
		<div id="contents">
			<h1>カート画面</h1>
			<s:if test="cartInfoDTOList != null && cartInfoDTOList.size()>0">
				<s:form action="DeleteCartAction">
					<table class="horizontal-list-table">
						<thead>
							<tr>
								<th><label>#</label></th>
								<th><label>商品名</label></th>
								<th><label>商品名ふりがな</label></th>
								<th><label>商品画像</label></th>
								<th><label>値段</label></th>
								<th><label>発売会社名</label></th>
								<th><label>発売年月日</label></th>
								<th><label>購入個数</label></th>
								<th><label>合計金額</label></th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="cartInfoDTOList">
								<tr>
									<td><input type="checkbox" name="productIdList"  class="check" value='<s:property value="productId" />' onchange="checkValue()" ></td>
									<td><s:property value="productName"/></td>
									<td><s:property value="productNameKana"/></td>
									<td><img src ='<s:property value="imageFile"/>' width="50px" height="50px"></td>
									<td><s:property value="price"/><span>円</span></td>
									<td><s:property value="releaseCompany"/></td>
									<td><s:property value="releaseDate"/></td>
									<td><s:property value="productCount"/></td>
									<td><s:property value="totalPrice"/><span>円</span></td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<h3><s:label value="カート合計金額 : "/><s:property value="cartTotalPrice"/>円</h3><br>
					<div class="submit_btn_box">
						<s:submit value="削除" id="deleteButton" class="submit_btn" disabled="true"/>
					</div>
				</s:form>
				<s:form id="form">
					<div class="submit_btn_box">
						<s:if test="#session.logined==1">
							<s:submit value="決済" class="submit_btn" onclick="setAction('SettlementConfirmAction')"/>
						</s:if>
						<s:else>
							<s:hidden name="cartFlg"  value="1"/>
					        <s:submit value="決済" class="submit_btn" onclick="setAction('GoLoginAction')"/>
						</s:else>
					</div>
				</s:form>
			</s:if>
			<s:else>
				<div class="info">
				カート情報がありません。
				</div>
			</s:else>
		</div>
	</body>
</html>
