<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/productDetails.css">
<title>商品詳細</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="main">
		<div id="top">
			<h1>商品詳細画面</h1>
		</div>
		<s:if test="productInfoDTO!=null">
			<s:form action="AddCartAction">
				<div class="box">
					<div class="2column-container">
						<div class="left">
							<img src='<s:property value="productInfoDTO.imageFile"/>'
								class="item-image-box-320" /><br>
						</div>
						<div class="right">
							<table class="vertical-list-table-mini">
								<!-- 選択された商品の商品名を表示 -->
								<tr>
									<th scope="row"><s:label value="商品名" /></th>
									<td><s:property value="productInfoDTO.productName"/></td>
								</tr>
								<!-- 選択された商品の商品名かなを表示 -->
								<tr>
									<th scope="row"><s:label value="商品名ふりがな" /></th>
									<td><s:property value="productInfoDTO.productNameKana"/></td>
								</tr>
								<!-- 選択された商品の値段を表示 -->
								<tr>
									<th scope="row"><s:label value="値段" /></th>
									<td><s:property value="productInfoDTO.price"/>円</td>
								</tr>
								<!-- 購入個数セレクト式で表示 １〜最大５個の商品を選択可能 -->
								<tr>
									<th scope="row"><s:label value="購入個数" /></th>
									<td><select name="stock">
											<option value="1" selected="selected">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
									</select>個</td>
								</tr>
								<!-- 選択された商品の発売会社を表示 -->
								<tr>
									<th scope="row"><s:label value="発売会社名" /></th>
									<td><s:property value="productInfoDTO.releaseCompany" /></td>
								</tr>
								<!-- 選択された商品の発売年月日を表示 -->
								<tr>
									<th scope="row"><s:label value="発売年月日" /></th>
									<td><s:property value="productInfoDTO.releaseDate" /></td>
								</tr>
								<!-- 選択された商品の商品詳細情報を表示 -->
								<tr>
									<th scope="row"><s:label value="商品詳細情報" /></th>
									<td><s:property value="productInfoDTO.productDescription" /></td>
								</tr>
							</table>
						</div>
					</div>
					<!-- カートに追加ボタン表示 -->
					<input type="hidden" name="productId"value="<s:property value="productId" />">
				</div>
				<div class="submit_btn_box">
					<s:submit value="カートに追加" class="submit_btn" />
				</div>
			</s:form>

			<!-- 同じカテゴリーの別商品を３件まで表示 商品名と商品画像を表示 -->
			<s:if test="relatedProductList!=null && relatedProductList.size()>0">
				<div class="box">
					<div class="product-details-recomｍend-box">
						<h2>【関連商品】</h2>
						<s:iterator value="relatedProductList">
							<div class="recommend-box">
								<a
									href='<s:url action="ProductDetailsAction">
							<s:param name="productId" value="%{productId}"/>
							</s:url>'><img
									src='<s:property value="imageFile"/>'
									class="item-image-box-100" /> <s:property value="productName" /><br>
								</a>
							</div>
						</s:iterator>
					</div>
				</div>
			</s:if>
		</s:if>
		<!-- 商品詳細情報がない場合 -->
		<s:else>
			<div class="info">商品の詳細情報がありません。</div>
		</s:else>
	</div>
</body>
</html>