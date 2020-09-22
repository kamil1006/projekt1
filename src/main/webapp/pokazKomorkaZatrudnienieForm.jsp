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
				<h2> Projekt 1 - komorki-zatrudnienie</h2>

			</div>
		</div>

</head>
<body>
<!--				 -->


<hr><hr>
		<h2> Wybierz jedną z opcji</h2>

		<hr><hr>



		<div id="container">
			<div id="content">

		<table>
			<tr>
				<th>Id</th>
				<th>grupowanie</th>
				<th>nazwa</th>
				<th>symbol komorki</th>
				<th>podleglosc pod</th>
				
			
				
			</tr>


			<tr>
					<td>${komorka2.id}</td>
					<td>${komorka2.grupowanie}</td>
					<td>${komorka2.nazwa}</td>
					<td>${komorka2.symbol}</td>
					<td>${komorka2.podlegloscSymbol}</td>

				</tr>

		</table>

			<table>
				<tr>
					<th>Id</th>
					<th>dataOd</th>
					<th>dataDo</th>
					<th>wymiarEtatu</th>
				
					
				
					
				</tr>
	

			<c:forEach var="tempZatrudnienie" items="${komorka2Zatrudnienie}">

					


				<tr>
					<td>${tempZatrudnienie.id}</td>
					<td>${tempZatrudnienie.dataOd}</td>
					<td>${tempZatrudnienie.dataDo}</td>
					<td>${tempZatrudnienie.wymiarEtatu}</td>
					


					


				</tr>




			</c:forEach>
		</table>

	</div>

</div>
<hr>
<td>
	<input type="button" value="powrót"
		onClick="window.location.href='${pageContext.request.contextPath}/pokazKomorki'"
		class="mod-button"
		/>
	</td>

<hr>


</body>
</html>