<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="Demo">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/style.css"/>"/> 
<script src="https://code.angularjs.org/1.3.0/angular.js"></script>
<script src="https://code.angularjs.org/1.4.8/angular-route.js"></script>
<script type="text/javascript" src="<c:url value="/resources/angularJs/script.js" />"> </script>
</head>
<body>
	<table>
		<tr>
			<td colspan="2" class="header">
				<h1>Website Header</h1>
			</td>

		</tr>
		<tr>
			<td class="leftMenu">
				<a href="#/home">Home</a> 
				<a href="#/courses">Courses</a> 
				<a href="#/studentList">Employee List</a>
				<a href="#/add">Add Employee</a>
			</td>
			<td class="mainContent">
				<ng-view></ng-view>
			</td>
		</tr>
		<tr>
			<td class="footer" colspan="2"><b>Footer</b></td>
		</tr>
	</table>
</body>
</html>