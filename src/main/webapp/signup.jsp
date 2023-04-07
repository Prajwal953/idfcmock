<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="signObj">
<table border="2px">
<tbody>
<tr>
<td>
<form:input type="email" path="email" placeholder="Enter Enmail"/>
</td>
</tr>
<tr>
<td>
<form:input type="text" path="name" placeholder="Enter Name"/>
</td>
</tr>
<tr>
<td>
<form:input type="text" path="phnum" placeholder="Enter Phone Number"/>
</td>
</tr>
<tr>
<td>
<form:button>Submit</form:button>
</td>
</tr>
</tbody>

 </table>
</form:form>
</body>
</html>