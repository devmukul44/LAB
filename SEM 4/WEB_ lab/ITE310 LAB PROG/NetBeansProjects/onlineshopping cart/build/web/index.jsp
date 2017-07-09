<%-- 
    Document   : index
    Created on : Apr 23, 2015, 12:02:48 AM
    Author     : ANAND UJJWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css" href="style.css"/>

</head>
<body>
Welcome to Wish cart ..
We sell the block buster movie DVDS.
<form action="newjsp.jsp" method=post">

		<div class="m" style="position:relative;top:60px;">
		
		<table>
			<th colspan="3">Movies</th>
			<tr>
				<td><img src="m1.jpg"/><input type="checkbox" name="m1" value="50">price$50</td>
				<td><img src="m2.jpg"/><input type="checkbox" name="m2" value="60">price$60</td>
				<td><img src="m3.jpg"/><input type="checkbox" name="m3" value="70">price$70</td>
			</tr>
			<tr>
				<td><img src="m4.jpg"/><input type="checkbox" name="m4" value="50">price$50</td>
				<td><img src="m5.jpg"/><input type="checkbox" name="m5" value="80">price$80</td>
				<td><img src="m6.jpg"/><input type="checkbox" name="m6" value="90">price$90</td>
			</tr>
			<tr>
				<td><img src="m7.jpg"/><input type="checkbox" name="m7" value="100">price$100</td>
				<td><img src="m8.jpg"/><input type="checkbox" name="m8" value="90">price$90</td>
				<td><img src="m9.jpg"/><input type="checkbox" name="m9" value="50">price$50</td>
			</tr>
		</table>

<p></p>
		</div>
    <br><br><br><br><br>
    <input type="submit" name="submit" value="submit">
		</form>
		

</body>


</html>
