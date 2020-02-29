<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>LOL</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
username: <input type ="text" name="username"/></br>
password: <input type ="password" name="password"/></br>
<input type ="submit" value="submit"></button>
  
   

</form>
<%
if(request.getAttribute("error")!=null) {
	


%>


<span style= "color:red"><%=request.getAttribute("error") %> </span> 
<%


}

%>




</body>
</html>