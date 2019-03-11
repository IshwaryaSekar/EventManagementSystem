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
						<td><input type="number" name="id" pattern="[0-9]{3}" title="Id must contain only 3-digit numbers(100-999)" required></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email"  required"></td>
					</tr>
					<tr>
					<td>
					Year</td>
					<td>
					<select>
				    <option value="first_year">First Year</option>
					<option value="second_year">Second Year</option>
				    <option value="third_year">Third Year</option>			
				   <option value="final_year">Final Year</option>
				   </select>
				   </td>
				   </tr>
				   <tr><td>
		          EventName</td>
		          <td>
		          <select>
				    <option value="paper_presentation">Paper Presentation</option>
					<option value="extempore">Extempore</option>
				    <option value="coding_contest">Coding Contest </option>	
				    			
				    		
				   </select>
				   </td></tr>
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