<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>Marek Krokosiński - <decorator:title default="Portfolio" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="portfolio">
<meta name="author" content="Marek Krokosiński">

<!--  styles -->
<link href="../css/styles.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>

<link href="../css/bootstrap-responsive.css" rel="stylesheet">
<!-- end of styles -->
<!--  HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<body>

	<!-- menu top -->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="../data/index.jsp">MaKro - portfolio</a>
				
				<!-- menu -->
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Blog <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="../data/blog.jsp">Blog</a></li>
								<li><a href="../data/archiwum.jsp">Archiwum</a></li>
							</ul></li>
						<li><a href="../data/about.jsp">O mnie</a></li>
						<li><a href="../data/projects.jsp">Projekty</a></li>
						<li><a href="../data/contact.jsp">Kontakt</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div> <!-- end of menu top -->
	
	<!-- begin of contant (container div) -->
	<div class="container">
	<decorator:body />
	
		<hr>

		<footer>

		<div class="row-fluid">
			<div class="span6">
				<address class="pull-right">
					<strong>Marek Krokosiński</strong><br> tel. 721 - 265 - 273 <br>
					e-mail: m.krokosinski@gmail.com <br> freelancer
				</address>
			</div>
			<div class="span6">
				<ul class="pull-left">
					<li><a href="../data/index.jsp">Home</a></li>
					<li>Blog
						<ul>
							<li><a href="../data/blog.jsp">Blog</a></li>
							<li><a href="../data/archiwum.jsp">Archiwum</a></li>
						</ul>
					</li>
					<li><a href="../data/about.jsp">o mnie</a></li>
					<li><a href="../data/projects.jsp">Projekty</a></li>
					<li><a href="../data/contact.jsp">Kontakt</a></li>
				</ul>
			</div>
		</div>

		</footer>

	</div>
	<!-- /container -->

	<!-- JS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>
