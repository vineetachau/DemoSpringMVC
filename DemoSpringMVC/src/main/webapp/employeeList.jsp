<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Department</th>
				<th>Employee Designation</th>
				<th>Employee Salary</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${list}" varStatus="sts">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.department}</td>
					<td>${emp.designation}</td>
					<td><a href="updateEmployeeInput?empId=${emp.id}">update</a></td>
					<td><a href="deleteEmployeeInput?empId=${emp.id}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>