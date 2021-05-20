<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jst1 : jsp에서 제공하는 문법으로 if, for 등과 같은 제어문 문법을 사용할 수 있도록 함. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>select.jsp</h2>
	
	<c:forEach var="test" items="${dbList1}">
	${test} <br>
	</c:forEach>
	<!-- 기본주소요청 -->
	<a href="./">홈으로</a>
</body>
</html>