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
		<form method="post" action="LoginServlet">
			<h1>Event Management System</h1>
			<br>
			<h2>Login</h2>
			<table>
				<tbody>


					<tr>
						<td>UserName</td>
						<td><input type="text" name="name" required></td>
					</tr>

					<tr>
						<td>Password</td>
						<td><input type="password" name="password" required></td>
					</tr>
				</tbody>
			</table>
			<p>
				<button type="submit">Sign in</button>
			</p>
			<br>
			<p>
				<a href="forgotpassword.jsp">Forgot Password?</a>
			</p>
			<br>


			<p>
				<a href="register.jsp">Sign Up</a>
			</p>
			<br>



		</form>
		<h3>${ERROR}</h3>
	</div>
</body>
</html>