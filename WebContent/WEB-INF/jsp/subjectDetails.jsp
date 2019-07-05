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

    
<h1 align="center"> ${subjectDetails.getSubjectName()} Details</h1>
<h2 align="center">HOD :  ${subjectDetails.getHOD().getName()} </h2>
<br>
<br>


<br>
<br>

<c:forEach items="${subjectDetails.getTeachers()}" var="teacher">
<tr>
	<td>${teacher.getName()}</td>
	
</tr>
</c:forEach>



</body>
</html>