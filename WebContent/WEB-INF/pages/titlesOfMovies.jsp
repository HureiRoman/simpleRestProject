<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.main-div-style{
		width:60%;
		background:#CCC;
		margin-left:auto;
		margin-right:auto;
		color:#468847;
		background:#dff0d8;
		height:100%;
		border:1px solid #d6e9c6;
		box-shadow: 0 0 10px rgba(0,0,0,0.5);
		text-align:center;
}
table {
	margin:auto;
	border-collapse: collapse;
}
h1{ margin:auto; display:inline-block;}
td{
	border:1px solid #4CAF50;
	padding:10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Titles of movies</title>
</head>
<body>
<div class="main-div-style">
<h1>Titles of movies</h1>
<table>
<tr><th>Titles</th></tr>
	<c:forEach items="${titles}" var="item">
	<tr>
	<td>
	${item}
	</td>
	</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>