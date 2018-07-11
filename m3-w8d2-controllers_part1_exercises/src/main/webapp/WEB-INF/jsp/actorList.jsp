<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>

<c:url var= "searchPage" value= "/searchActor"/>

<form action= "${searchPage}" method= "Get">
	<input type= "text" name= "lastName"/>
	<input type= "submit"/>
</form>

		<!-- Form goes here -->
<table class="table">
<tr>
<th>Name</th>
</tr>

<c:forEach items="${actors}" var="actor">
	<tr>
		<td>
	    <!-- What do we print here for each actor? -->
	    ${actor.firstName} ${actor.lastName}
	    </td>
	</tr>
</c:forEach>

</table>

<%@include file="common/footer.jspf"%>