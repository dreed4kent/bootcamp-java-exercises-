<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url var= "searchFilms" value= "/requestFilms"/>

<form action= "${searchFilms}" method= "Get">
	<input type= "text" name= "minLength"/>
	<input type= "text" name= "MaxLength"/>
	<select name= "dropDown" id= "dropDownBox">
	  <option value="Action">Action</option>
	  <option value="Animation">Animation</option>
	  <option value="Children">Children</option>
	  <option value="Classics">Classics</option>
	  <option value="Comedy">Comedy</option>
	  <option value="Documentary">Documentary</option>
	  <option value="Drama">Drama</option>
	  <option value="Family">Family</option>
	  <option value="Foreign">Foreign</option>
	  <option value="Games">Games</option>
	  <option value="Horror">Horror</option>
	  <option value="Music">Music</option>
	  <option value="New">New</option>
	  <option value="Sci-Fi">Sci-Fi</option>
	  <option value="Sports">Sports</option>
	  <option value="Travel">Travel</option>
	</select>
	<input type= "submit"/>
</form>

<table class="table">
	<tr>
		<th>Title</th>
		<th>Description</th>
		<th>Release Year</th>
		<th>Length</th>
		<th>Rating</th>
	</tr>
</table>

<c:forEach items="${film}" var="film">
	<tr>
		<td>
	    ${film.firstName} ${film.lastName}
	    </td>
	    <td>
	    ${film.description}
	    </td>
	    <td>
	    ${film.release_year}
	    </td>
	    <td>
	    ${film.length}
	    </td>
	    <td>
	    ${film.rating}
	    </td>
	</tr>
</c:forEach>

<%@include file="common/footer.jspf"%>
<%@include file="common/footer.jspf"%>