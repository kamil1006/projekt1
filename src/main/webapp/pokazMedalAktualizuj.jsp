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
				<h2> Projekt 1 -aktualizuj medal</h2>
			
			</div>
		</div>

</head>
<body>
<!--				 -->


<hr><hr>
		<h2> Aktualizuj medal</h2>
<hr><hr>
	
        

<div id="container">
	<div id="content">

		<form:form action="zapiszMedal" modelAttribute="medal1" method="POST">
		
			<!--   -->
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>Id medalu:</label></td>
						<td><label>${medal1.id}</label></td>
						
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