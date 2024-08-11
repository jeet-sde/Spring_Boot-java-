<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD STATE</title>
</head>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>

	<f:form action="add_state.html" method="Post" modelAttribute="StateVO">
COUNTRY_NAME<f:select path="countryVO.id">
			<c:forEach items="${searchList}" var="i">
				<option value="${i.id}">${i.countryName}</option>
			</c:forEach>

		</f:select>
		<br> 
STATE_NAME:<f:input path="stateName" />
		<br />
		<br />
		<input type="submit" value="Submit">
	</f:form>

</body>
</html>