<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@page import="java.util.List" %>
<%@page import="dto.MockDto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px" bordercolor="red">
<tr>
<th>Email Id</th>
<th>Name</th>
<th>Phone Number</th>
</tr>
<%List<MockDto>pist=(List<MockDto>)request.getAttribute("data"); %>
<%for(MockDto mind:pist){ %>
<tr>
<td><%=mind.getEmail() %></td>
<td><%=mind.getName()%></td>
<td><%=mind.getPhnum()%></td>
</tr>
<% }%>
</table>
</body>
</html>