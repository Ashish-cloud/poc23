<%@page import="com.racksapace.dto.RegDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerServlet" method="get">

<h1>Customer Details</h1>
<table border=1px>
<tr>
<th>CustomerId</th>
<th>Customer Name</th>
<th>Gender</th>
<th>City</th>
<th>Account Type</th>
<th>Email Id</th>
<th>Phone Number</th>
</tr>
<% if (request.getAttribute("sucess")!=null) {%>
<%
ArrayList<RegDto> ml = (ArrayList<RegDto>)request.getAttribute("sucess");

for(RegDto rdt:ml){
%>


<tr style="text-align: center;">
<td> <%= rdt.getId() %> </td>
<td> <%= rdt.getCname() %> </td>
<td> <%= rdt.getGender() %> </td>
<td> <%= rdt.getCity() %> </td>
<td> <%= rdt.getAccount_Type() %> </td>
<td> <%= rdt.getMailID() %> </td>
<td> <%= rdt.getPhone_Number() %></td>




</tr>

<% }%>
</table>
<%} %>
</form>
</body>
</html>