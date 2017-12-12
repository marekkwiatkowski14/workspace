<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
a<input type="text" name="a">
b<input type="text" name="b">
<input type="submit">
</form>
<%
int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));

%>
<ul>
<%if(a!=null){int i = a; while(a<b) {
%><li><%out.println(i);%></li><%a++;}}%>

</ul>
</body>
</html>