<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 
			 <c:set var="x" value="0" />
			 <c:set var="y" value="1" />
			 <c:set var="z" value="0" />
			 <li><c:out value="${x}"></c:out></li>
			 <c:forEach begin="1" end="13" step="1">
			 	<li><c:out value="${y}"></c:out></li>
			 	<c:set var="z" value="${x + y}" />
				<c:set var="x" value="${z}" />
				<c:set var="y" value="${x + y}" />
				<li><c:out value="${z}"></c:out></li>
			 </c:forEach>
		</ul>
	</body>
</html>