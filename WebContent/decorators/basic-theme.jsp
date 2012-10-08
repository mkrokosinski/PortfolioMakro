<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
        <title>Marek Krokosiński -  <decorator:title default="Portfolio" /> </title>
</head>
<body>
	<div class="page">                 
		<jsp:include page="/template/banner.jsp" />    
		<c:import url="/MenuServ" />
 
		<div class="middle">
				<div class="content">
					<decorator:body />
				</div>
			<div class="rightBox" ></div>
		</div>
 
		<jsp:include page="/template/footer.jsp" />
	</div>                            
</body>
</html>