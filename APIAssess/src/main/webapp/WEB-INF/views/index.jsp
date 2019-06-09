<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	
</head>
<body>
<div class="container">
	<h3><a href="go-joke">Let's start with a joke?</a></h3>
	
	<h1>Breweries</h1>
	<table  class="table" border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>More Info</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${nametype}" var="l">
				<tr>
					<td>${l.name}</td>
					<td>${l.brewery_type}</td>
					<td><a class="btn btn-primary" href="details?id=${l.id}">Details</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>