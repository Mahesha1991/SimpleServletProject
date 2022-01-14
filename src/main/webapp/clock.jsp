<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Different directive tag -->

<%@ include file="/includehello.jsp" %>
The time is: <b> <%= new Date() %> </b>

</body>
</html>