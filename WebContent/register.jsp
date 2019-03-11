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
						<td><input type="text" name="name" pattern="[A-Za-z]+" title="Username should only contain uppercase and lowercase letters"  required></td>
					</tr>
					<tr>
						<td>Id</td>
						<td><input type="number" name="id"  maxlength="3' pattern="\d{3}" title="Id must contain only 3-digit numbers(100-999)" required></td>
					</tr>
					<tr>
						<td>New Password</td>
						<td><input type="password" name="password"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required></td>
					</tr>
					<tr>
						<td>Mobile Number</td>
						<td><input type="tel" name="mobilenumber"    patttern="(0/91)?[7-9][0-9]{9}" title="Mobile Number must 10 digit numbers" required></td>
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