<%@page import="java.util.Date"%>
<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%Date d = new Date(); %>
 <%=d %>
 <br/>
 <%!Date d2 = new Date(); %>
 <%=d2 %>
 <br/>
 <% LocalTime localtime = LocalTime.now(); %>
 <%=localtime %>

</body>
</html>