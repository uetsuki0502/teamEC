<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/milkyway.css">
<title>settlementConfirm</title>
</head>
<body>
<jsp:include page="header.jsp" />
 <script src="./js/milkyway.js"></script>
  <div id="header">
  </div>
  <div id="contents">
    <h1>決済確認画面</h1>
    <s:if test="destinationInfoDTOList!=null && destinationInfoDTOList.size()>0">
    <div class="info">
      宛先情報を選択してください
    </div>
    <s:form id="form">
      <table class="horizontal-list-table">
        <thead>
          <tr>
            <th><label>#</label></th>
            <th><label>姓</label></th>
            <th><label>名</label></th>
            <th><label>ふりがな</label></th>
            <th><label>住所</label></th>
            <th><label>電話番号</label></th>
            <th><label>メールアドレス</label></th>
          </tr>
        </thead>
        <tbody>
        <s:iterator value="destinationInfoDTOList" status="st">
          <tr>
            <td>
		      <s:if test="#st.index == 0">
		        <input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
		      </s:if>
		      <s:else>
		        <input type="radio" name="id" value="<s:property value='id'/>"/>
		      </s:else>
	        </td>
            <td><s:property value="familyName"/><br></td>
            <td><s:property value="firstName"/><br></td>
            <td><s:property value="familyNameKana"/><span>  </span><s:property value="firstNameKana"/><br></td>  <!-- 姓と名の間に全角スペース -->
            <td><s:property value="userAddress"/><br></td>
            <td><s:property value="telNumber"/><br></td>
            <td><s:property value="email"/><br></td>
          </tr>
        </s:iterator>
       </table>
       <div class="submit_btn_box">
         <s:submit value="決済" class="submit_btn" onClick="setAction('SettlementCompleteAction')" />
       </div>
       <div class="submit_btn_box">
         <s:submit value="削除" class="submit_btn" onClick="setAction('DeleteDestinationAction')" />
       </div>
     </s:form>
   </s:if>
   <s:else>
     <div class="info">
         宛先情報がありません。
     </div>
   </s:else>
   <div class="submit_btn_box">
     <s:form action="CreateDestinationAction">
       <s:submit value="新規宛先登録" class="submit_btn"/>
     </s:form>
   </div>
 </div>
</body>
</html>