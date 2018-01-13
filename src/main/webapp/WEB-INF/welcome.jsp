<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<title>Log in</title>
	<link rel="stylesheet" type="text/css" th:href="@{css/index.css}">
</head>
<body>
	<ul id="account" class="dropdown-content">
	  <li><a href="#!">Sign in</a></li>
	  <li><a href="#!">Sign up</a></li>
	</ul>	
	<nav style="background-color: #4A4A4A">
	    <div class="nav-wrapper">
	    	<div class="logo">
	    		<a href="#" class="brand-logo">BL0GER</a>
	    	</div>
	    	<ul id="nav-mobile" class="right hide-on-med-and-down"> 
		        <li><a href="#">Log in</a></li>
		        <li><a href="#">Contacts</a></li>
		        <li><a class="dropdown-button" href="#" data-activates="account">Account</a></li>
	      	</ul>
		</div>
	</nav>

	<h1>Hello ${user}</h1>

	<div class="autorize-form">
		<div class="row">
		    <form class="col s12">
		    	<div class="row">
			      	<div class="input-field col s12">
			      		<input id="login" type="text" class="validate">
			          <label for="login">Login</label>	
			      	</div>
			    </div>
			    <div class="row">
			        <div class="input-field col s12">
			          <input id="password" type="password" class="validate">
			          <label for="password">Password</label>
			        </div>
			      </div>
			      <div class="row">
			      	<div class="input-field col s12">
			      		<div class="control-btn">
				      		<button class="btn waves-effect waves-light" type="button" name="action">Sign in</button>
			      		</div>
			      	</div>
			    </div>
			</form>
	  	</div>
	</div>


	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<script type="text/javascript" src=js/jquery-3.2.1.min.js></script>
	<link rel="stylesheet" href="css/materialize.min.css">
  	<script src="js/materialize.min.js"></script>
</body>
</html>