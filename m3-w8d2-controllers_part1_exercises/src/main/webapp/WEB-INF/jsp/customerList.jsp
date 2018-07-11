<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url= var= "searchPage" value= "/searchCustomer"/>

<form action= "${searchPage}" method= "Get">
	<input type= "text" name= "lastName"/>
	<input type= "text" name= "email"/>
	<select>
	  <option value="last_name">Last Name</option>
	  <option value="email">Email</option>
	  <option value="active">Active</option>
	</select>
	<input type= "submit"/>
</form>

<table class="table">
<tr>
<th>Name</th>
<th>Email</th>
<th>Active</th>
</tr>

<c:forEach items="${actors}" var="customer">
	<tr>
		<td>
	    ${customer.firstName} ${customer.lastName}
	    </td>
	    <td>
	    ${customer.email}
	    </td>
	    <td>
	    ${customer.active}
	    </td>
	</tr>
</c:forEach>

</table>

<%@include file="common/footer.jspf"%>