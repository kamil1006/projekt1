<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link type="text/css"
		  rel="stylesheet"
		  href="css/style.css" />



		  <div id="wrapper">
			<div id="header">
				<h2> Projekt 1</h2>
			
			</div>
		</div>

</head>
<body>
<!--				 -->
	
<!-- construct  link  -->
<c:url 
	var="pracownicyLink" value="/pokazPracownikow">
</c:url>

<c:url
	var="grupyLink" value="/pokazGrupy">
</c:url>

<c:url
	var="medaleLink" value="/pokazMedale">
</c:url>

<c:url
	var="stanowiskaLink" value="/pokazStanowiska">
</c:url>

<c:url
	var="komorkiLink" value="/pokazKomorki">
</c:url>

<hr><hr>
		<h2> Wybierz jedną z opcji</h2>

		<hr><hr>
	
        

		<div id="container">
			<div id="content">
				
		<table>
		<tr>
			<th>Opcje</th>
			
		</tr>
		
		<tr><td>

			<input type="button" value="grupy"
			onClick="window.location.href='${grupyLink}'; return false;"
			class="mod-button"/>
			</td></tr>
		
		
		<tr>			<td>
			<input type="button" value="Pracownicy"
			onClick="window.location.href='${pracownicyLink}'; return false;"
			class="mod-button"/>
		</td>
		</tr>
		


		<tr><td>
        <input type="button" value="Medale"
        onClick="window.location.href='${medaleLink}'; return false;"
		class="mod-button"/>
		</td>

	</tr>
	<tr><td>	
        <input type="button" value="Stanowiska"
        onClick="window.location.href='${stanowiskaLink}'; return false;"
		class="mod-button"/>
	</td>
	</tr>
	<tr><td>	
        <input type="button" value="Komórki"
        onClick="window.location.href='${komorkiLink}'; return false;"
		class="mod-button"/>
	</td></tr>

		</table>

	</div>
	
</div>
        
<hr>


</body>
</html>