<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="footer">	<!-- rozpoczęcie footer -->
		<p class="footerText">
		<span class="ftText">Marek Krokosiński - portfolio @ 2012 | e-mail MaKroPortfolio@gmail.com</span>
		<br />
		<c:forEach var="menu" items="${sessionScope.listMenu}" >
    		<span class="ftText"><a href="${menu.linkToMenu }">${menu.menuName }</a> </span>
   			
  		</c:forEach>
  		</p>
  		</div>			<!-- zakończenie footer -->