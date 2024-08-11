<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD CITY</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<body>

	<f:form action="add_city.html" method="Post" modelAttribute="CityVO">
	
COUNTRY_NAME<f:select path="CountryVO.id">
			<c:forEach items="${countryList}" var="i">
				<option value="${i.id}">${i.countryName}</option>
			</c:forEach>

		</f:select>
<br>
STATE_NAME<f:select path="StateVO.id">
			<c:forEach items="${stateList}" var="i">
				<option value="${i.id}">${i.stateName}</option>
			</c:forEach>

		</f:select>
		<br> 
CITY_NAME:<f:input path="cityName" />
		<br />
		<br />
		<input type="submit" value="Submit">
	</f:form>

</body>
</html>