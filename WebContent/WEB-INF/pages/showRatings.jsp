<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Ratings</title>
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
</head>
<body>
<div class="main-div-style">
<h1>Ratings</h1>
<table>
<tr><th>RatingId</th><th>UserId</th><th>MovieId</th><th>Rating</th><th>Rating date</th></tr>
	<c:forEach items="${ratings}" var="item">
    <tr>
    <td>
    	${item.ratingId}
        </td>
        <td>
    	${item.user.userId}
        </td>
        <td>
    	${item.movie.movieId}
        </td>
        <td>
    	${item.rating}
        </td>
        <td>
    	${item.ratingDate}
        </td>
    	</tr>
	</c:forEach>
    </table>
    </div>
</body>
</html>