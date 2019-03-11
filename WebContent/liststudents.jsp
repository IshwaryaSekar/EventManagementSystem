<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: url("image.jpg");
}

.content {
	max-width: 500px;
	max-length: 300px;
	margin: auto;
	background: white;
	padding-top: 100px;
	padding-right: 30px;
	padding-bottom: 50px;
	padding-left: 80px;
	text-align: center;
}
.topright {
  position: absolute;
  top: 8px;
  right: 16px;
  font-size: 18px;
}

</style>
</head>
<body>
<div class="topright">
		<a href="home.html">LogOut</a>
	</div>
	<br>
	
	<div class="content">
		<h1>Successfully Registered....</h1>

	<!--  	
	 <table>
			<thead>
				<tr>


					<th>Id</th>
					<th>Email</th>
					<th>Year</th>

					<th>Event Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${STUDENTS}">
					<tr>

						<td>${student.id}</td>
						<td>${student.email}</td>
						<td>${student.year}</td>

						<td>${student.event.name}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>  
		-->
	</div>
</body>
</html>