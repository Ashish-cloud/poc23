<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>Update Page</h1>
<form action="UpdateServlet" method="post">

<label>CustomerId</label>
<input type="text" name="Id"></br>


<label>CustomerName</label>
<input type="text" name="cname"></br>


<label>Gender</label>
        <input type="radio" name="Gender" value="male">Male
        <input type="radio" name="Gender" value="female">Female</br>
<label>City</label>
<select name="city">
<option value="">Select</option>
     <option value="Hyd">Hyderabad</option>
     <option value="Chen">Chennai</option>
     <option value="Bang">Bangalore</option>
</select></br>
Accounts:<select name="Account_Type">
<option value="">Select</option>
     <option value="Saving">Savings Account</option>
     <option value="Current">Current Account</option>
     <option value="Demark">Demark Account</option>
</select></br>
CustomerMailId:<input type="text" name="MailID"></br>
CustomerMobileNumber:<input type="text" name="Phone_Number"></br>
<input type="submit" value="Submit"/>
<a href="home">Redirect to HomePage</a>
</form>
</body>
</html>