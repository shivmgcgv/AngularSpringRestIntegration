<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<a href="/spring-bank-mvc/new"><input
			type="button" value="New Account" class="btn btn-danger"></a>

	<c:if test="${not empty accounts}">
		<table
			class="table table-responsive table-bordered table-hover table-striped">
			<thead>
				<tr>
					<th>ACCNO</th>
					<th>NAME</th>
					<th>BALANCE</th>
					<th>DOC</th>
					<th>MOBILE</th>
					<th>EMAIL</th>
					<th>PAN</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${accounts}">
					<tr>
						<td>${a.accno}</td>
						<td>${a.name}</td>
						<td>${a.balance}</td>
						<td>${a.doc}</td>
						<td>${a.mobile}</td>
						<td>${a.email}</td>
						<td>${a.pan}</td>
						<td><a href="/spring-bank-mvc/edit?accno=${a.accno}"><input type="button" value="EDIT"
								class="btn btn-info"></a></td>
						<td><a href="/spring-bank-mvc/delete?accno=${a.accno}"><input type="button" value="DELETE"
								class="btn btn-danger"></a></td>
					</tr>
				</c:forEach>

			</tbody>


		</table>



	</c:if>



</body>
</html>