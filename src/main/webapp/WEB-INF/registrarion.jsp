<!DOCTYPE html>
<html>
<head>
	<title></title>
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

	<div class="registration-form">
		<div class="row">
		    <form class="col s12">
		    	<div class="row">
			      	<div class="input-field col s6">
			      		<input id="login" type="text" class="validate">
			          <label for="login">Login</label>	
			      	</div>
			        <div class="input-field col s6">
			          <input id="password" type="password" class="validate">
			          <label for="password">Password</label>
			        </div>
			      </div>
		      	<div class="row">
			        <div class="input-field col s6">
			          <input id="first_name" type="text" class="validate">
			          <label for="first_name">First Name</label>
			        </div>
		        <div class="input-field col s6">
		          <input id="last_name" type="text" class="validate">
		          <label for="last_name">Last Name</label>
		        </div>
		      </div> 
		      <div class="row">
		        <div class="input-field col s12">
		          <input id="email" type="email" class="validate">
		          <label for="email">Email</label>
		        </div>
		      </div>
		      <div class="row">
		      	<div class="input-field col s12">
		      		<div class="control-btn">
			      		<button class="btn waves-effect waves-light" type="button" name="action">Sign up
							<i class="material-icons right">done</i>
						</button>
		      		</div>
		      	</div>
		      </div>
		    </form>
	  	</div>
	</div>

	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<script type="text/javascript" src="D:\Kotlin\materialize\js\jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" href="D:\Kotlin\materialize\css\materialize.min.css">
  	<script src="D:\Kotlin\materialize\css\materialize.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/index.css">
</body>
</html>