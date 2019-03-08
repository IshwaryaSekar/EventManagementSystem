<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

		<form method="post" action="RegisterEventsServlet">
			<h1>Event Registration</h1>
			<br>
			<table>
				<tbody>
					<tr>
						<td>Id</td>
						<td><input type="number" name="id" required></td>
					</tr>
					<tr>
						<td>Year</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="year" value="first_year"></td>
						<td>First Year</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="year" value="second_year"></td>
						<td>SecondYear</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="year" value="third_year"></td>
						<td>Third Year</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="year" value="final_year"></td>
						<td>FinalYear</td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email" required></td>
					</tr>
					<tr>
						<td>EventName</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="eventname"
							value="paper_presentation"></td>
						<td>Paper Presentation</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="eventname" value="extempore"></td>
						<td>Extempore</td>
					</tr>
					<tr>
						<td><input type="checkbox" name="eventname"
							value="coding_contest"></td>
						<td>Coding contest</td>
					</tr>
				</tbody>
			</table>

			<p>
				<button type="submit">Ok</button>
			</p>
			<br>
			<h3>${ERROR1}</h3>
			<h3>${ERROR2}</h3>
		</form>
	</div>

</body>
</html>