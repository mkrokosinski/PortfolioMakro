<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="menu" >	
	<c:forEach var="menuList" items="${menu}" >
		<span class="menuItem"><a href="${menuList.linkToMenu }">${menuList.menuName }</a> | </span>
	</c:forEach>
</div>	
