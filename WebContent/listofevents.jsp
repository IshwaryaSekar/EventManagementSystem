<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
		<h1>List of events</h1>
		<table>
			<thead>
				<tr>

					<th>Name</th>
					<th>Amount</th>
					<th>Organize date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="event" items="${EVENTS}">
					<tr>
						<td>${event.name}</td>
						<td>${event.amount}</td>
						<td>${event.organize_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<p>
			<a href="registerevents.jsp">Click here to register events</a>
		</p>
		
	</div>

</body>
</html>