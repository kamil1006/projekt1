<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link type="text/css"
		  rel="stylesheet"
		  href="css/style.css" />

<link type="text/css"
		  rel="stylesheet"
		  href="css/formularz1-style.css" />

		  <div id="wrapper">
			<div id="header">
				<h2> Projekt 1 -aktualizuj grupę</h2>
			
			</div>
		</div>

</head>
<body>
<!--				 -->


<hr><hr>
		<h2> Aktualizuj grupę</h2>
<hr><hr>
	
        

<div id="container">
	<div id="content">

		<form:form action="zapiszGrupe" modelAttribute="grupa1" method="POST">
		
			<!--  need to associate this data with customer id -->
			<form:hidden path="idGrupy"/>
			<table>
				<tbody>
					<tr>
						<td><label>Id grupy:</label></td>
						<td><label>${grupa1.idGrupy}</label></td>
						
					</tr>
					<tr>
						<td><label>nazwa:</label></td>
						<td><form:input path="nazwa" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Zapisz" class="save"/></td>
					</tr>


				</tbody>
			</table>
		
		</form:form>
		
	</div>
</div>
        
<hr>


</body>
</html>