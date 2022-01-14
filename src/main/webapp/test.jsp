<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Testing JSP</h1>

<%!

public int add(int a, int b){
	return a + b; 
}
	
%>


<%

int i = 1;
int j =2;
int k = i + j;

out.println("Variable k is " + k);

%>
<br/>
The value of k outside of <\%  %> script tag is : <%=k%>
<br/>
<%
int p = add(100,200);

%>
Method Declaration/Definition tag <\%!  %> for creating method : <%=p %>



<!-- Continuation of script tags -->
<% for(i = 1; i < 5; i++){ %>
<br> i = <%=i%>
<%} %>

</body>
</html>