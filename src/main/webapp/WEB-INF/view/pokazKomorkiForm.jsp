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
				<h2> Projekt 1 - komorki</h2>

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
				<th>zatrudnienie</th>
				<th>Aktualizuj</th>
			
				
			</tr>

			<c:forEach var="tempKomorka" items="${komorki11}">

					<!--  construct  link  -->
					<c:url var="zatrudnienieLink" value="/pokazKomorkaZatrudnienie">
					<c:param name="komorkaId" value="${tempKomorka.id}"></c:param>
					</c:url>

					<c:url var="aktualizujLink" value="/pokazKomorkaAktualizuj">
					<c:param name="komorkaId" value="${tempKomorka.id}"></c:param>
					</c:url>

				<tr>
					<td>${tempKomorka.id}</td>
					<td>${tempKomorka.grupowanie}</td>
					<td>${tempKomorka.nazwa}</td>
					<td>${tempKomorka.symbol}</td>
					<td>${tempKomorka.podlegloscSymbol}</td>

					<td>
						<input type="button" value="Zatrudnienie"
							onClick="window.location.href='${zatrudnienieLink}'; return false;"
							class="mod-button"
							/>
					</td>


					<td>
						<input type="button" value="Aktualizuj"
							onClick="window.location.href='${aktualizujLink}'; return false;"
							class="mod-button"
							/>
					</td>


				</tr>




			</c:forEach>
		</table>

	</div>

</div>
<hr>
<td>
	<input type="button" value="powrót"
		onClick="window.location.href='${pageContext.request.contextPath}/'"
		class="mod-button"
		/>
	</td>

<hr>


</body>
</html>