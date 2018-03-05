<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>List customers</title>
</head>
<body>
	<div class="content">
		<div style="width: 50%; margin: 0 auto; margin-top: 10%;">
			<h1>List Customers</h1>
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col">First Name</th>
						<th scope="col">Last Name</th>
						<th scope="col">Email</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${customers}" var="item">
						<tr>

							<td>${item.getFirst_name()}</td>
							<td>${item.getLast_name()}</td>
							<td>${item.getEmail()}</td>
							<td><a href="/update/${item.getId()}">Update</a> | <a
								href="/delete/${item.getId()}">Delete</a></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>