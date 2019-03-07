<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Event Management System</title>
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


		<h1>Registration process</h1>
		<br>
		
		<%
String errorMessage = (String) request.getAttribute("ERROR_MSG");
		if(errorMessage != null){
			out.println ("Error Message:" + errorMessage);
		}
%>
		<form method="post" action="RegisterServlet">

			<table>
				<tbody>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name" required></td>
					</tr>
					<tr>
						<td>Id</td>
						<td><input type="number" name="id" required></td>
					</tr>
					<tr>
						<td>New Password</td>
						<td><input type="password" name="password" required></td>
					</tr>
					<tr>
						<td>Mobile Number</td>
						<td><input type="number" name="mobilenumber"></td>
					</tr>
				</tbody>
			</table>
			<p>
				<button type="submit">Register</button>
			</p>
			<br>



		</form>
	</div>
</body>
</html>