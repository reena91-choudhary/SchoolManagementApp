<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2 align ="center"> Student Details</h2>
<br>
<br>
<br>
<table>
<tr>
	<th>Student Name</th>
    <th>Roll Number</th> 
    <th> Student Unique Id</th>
</tr>

<tr>
	<td bgcolor="#cccccc">${studentDetails.getName()}</td>
	<td bgcolor="#cccccc">${studentDetails.getRollNo()}</td>
	<td bgcolor="#cccccc">${studentDetails.getId()}</td>
</tr>


</table>
</body>
</html>