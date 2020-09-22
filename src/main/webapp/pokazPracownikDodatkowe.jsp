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
				<h2> Projekt 1 - pracownicy dane dodatkowe</h2>

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
						</tr>
						<tr>
							<td>${pracownik1.nrKadrowy}</td>
							<td>${pracownik1.nazwisko}</td>
							<td>${pracownik1.imie}</td>
							<td>${pracownik1.pesel}</td>
							<td>${pracownik1.mail}</td>
							<td>${pracownik1.dataWpisu}</td>


						</tr>

					</table>



		<table>
			<tr>
				
				<th>adres</th>
				<th>mail pryw</th>
				<th>tel pryw</th>
				<th>data wpisu</th>
				<th>Aktualizuj</th>

			</tr>

			
					<!--  construct  link update -->
					<c:url var="aktualizujLink" value="/pokazPracownikAktualizuj">
					<c:param name="pracownikId" value="${tempPracownik.nrKadrowy}"></c:param>
					</c:url>

			

				<tr>
					
					<td>${pracownikDodatkowe1.adres}</td>
					<td>${pracownikDodatkowe1.mailPrywatny}</td>
					<td>${pracownikDodatkowe1.telefonPrywatny}</td>
					
					<td>${pracownikDodatkowe1.dataWpisu}</td>
					
				
					<td>
						<input type="button" value="Aktualizuj"
							onClick="window.location.href='${aktualizujLink}'; return false;"
							class="mod-button"
							/>
					</td>

				</tr>




		
		</table>

	</div>

</div>
<hr>
<td>
	<input type="button" value="powrót"
		onClick="window.location.href='${pageContext.request.contextPath}/pokazPracownikow'"
		class="mod-button"
		/>
	</td>

<hr>


</body>
</html>