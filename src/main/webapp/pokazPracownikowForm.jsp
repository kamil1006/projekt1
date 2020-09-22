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
				<h2> Projekt 1 - pracownicy</h2>

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
				<th>Nr kadrowy</th>
				<th>Nazwisko</th>
				<th>Imię</th>
				<th>pesel</th>
				<th>mail</th>
				<th>data wpisu</th>
				<th>inf dodatkowe</th>
				<th>medale</th>
				<th>historia</th>
				<th>Aktualizuj</th>

			</tr>

			<c:forEach var="tempPracownik" items="${pracownicy1}">

					<!--  construct  link update -->
					<c:url var="aktualizujLink" value="/pokazPracownikAktualizuj">
					<c:param name="pracownikId" value="${tempPracownik.nrKadrowy}"></c:param>
					</c:url>

					<!--  construct  link dodatkowe -->
					<c:url var="DodatkoweLink" value="/pokazPracownikDodatkowe">
					<c:param name="pracownikId" value="${tempPracownik.nrKadrowy}"></c:param>
					</c:url>


				<tr>
					<td>${tempPracownik.nrKadrowy}</td>
					<td>${tempPracownik.nazwisko}</td>
					<td>${tempPracownik.imie}</td>
					<td>${tempPracownik.pesel}</td>
					<td>${tempPracownik.mail}</td>
					<td>${tempPracownik.dataWpisu}</td>
					
					<td>
						<input type="button" value="inf dodat"
							onClick="window.location.href='${DodatkoweLink}'; return false;"
							class="mod-button"
							/>
					</td>
					<td>
						<input type="button" value="medale"
							onClick="window.location.href='${aktualizujLink}'; return false;"
							class="mod-button"
							/>
					</td>
					<td>
						<input type="button" value="historia"
							onClick="window.location.href='${aktualizujLink}'; return false;"
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