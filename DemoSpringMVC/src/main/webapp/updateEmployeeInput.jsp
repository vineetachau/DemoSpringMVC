<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<form action="updateEmployee">
	<input type="hidden" name="empId" value="${empObj.id}">
	Employee Name: <input value="${empObj.name}" name="name"><br/><br/>
	Employee Department: <input value="${empObj.department}" name="department"><br/><br/>
	Employee Designation: <input value="${empObj.designation}" name="designation"><br/><br/>
	Employee Salary: <input value="${empObj.salary}" name="salary"><br/><br/>
	<input type="submit">
</form>

</body>
</html>