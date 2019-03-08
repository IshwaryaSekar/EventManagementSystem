<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>

</head>
<body>
<div class="content">
<form method="post" action="ForgotPasswordServlet">
<h2>Forgot Password</h2>
<table>
				<tbody>

					<tr>
						<td>Id</td>
						<td><input type="number" name="id" required></td>
					</tr>

					<tr>
						<td> Create new Password</td>
					<td><input type="password" name="password" required></td>
					</tr>
					
				</tbody>
				</table>
                   <p>
					<button type="submit">Ok</button>
					</p>	
					<h3>${ERROR}</h3>
</div>
</body>
</html>