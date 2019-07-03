<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gurucool Public School</title>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
</style>
</head>
<body>

    
<h2 align="center"> ${classDetails.getClassName()} Details</h2>
<br>
<br>
<p align ="left"> Class Teacher : ${classDetails.getClassTeacher()}</p>
<p align ="right"> Total Number of Students: ${classDetails.getStudents().size()}</p>
<br>
<br>

<p align="left"> Student Names with their role numbers </p>
<table>
<tr>
	<th>Name</th>
    <th>Roll Number</th> 
</tr>
<c:forEach items="${classDetails.getStudents()}" var="student">
<tr>
	<td>${student.getName()}</td>
	<td>${student.getRollNo()}</td>
</tr>
</c:forEach>

</table>
 
</body>
</html>