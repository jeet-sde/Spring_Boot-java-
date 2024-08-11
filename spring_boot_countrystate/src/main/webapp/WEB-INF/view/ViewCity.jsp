<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View City</title>
</head>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="f" %>


<body>
<table border="1px solid black">
<tr>
	<th>Id</th>
	<th>CountryName</th>
	<th>StateName</th>
	<th>CityName</th>
</tr>
<f:forEach items="${SearchList}" var="p">
<tr>
	<td>${p.id}</td>
	<td>${p.countryVO.countryName}</td>
	<td>${p.stateVO.stateName}</td>
	<td>${p.cityName}</td>
		
</tr>
</f:forEach>
</table>
</body>
</html>