<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/lib/jQuery/jquery-1.10.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/lib/jQuery/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/lib/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/lib/bootstrap/js/bootstrap.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/lib/bootstrap/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/lib/bootstrap/css/bootstrap.min.css" />
		
<%-- 		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/login.js"></script> --%>
<%-- 		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/main.js"></script> --%>
<%-- 		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/utils.js"></script> --%>
<title>Ingreso al sistema</title>
</head>
<body>
	<br><br><br><br><br><br>
	<div class="container">
    <div class="row">
		<div class="span4 offset4 well">
			<legend>Autenticaci&oacute;n </legend>
<!--           	<div class="alert alert-error"> -->
<!--                 <a class="close" data-dismiss="alert" href="#">×</a>El usuario y/o password son incorrectos, favor de validar. -->
<!--             </div> -->
<!-- 			<form method="POST" action="" accept-charset="UTF-8"> -->
			<input type="text" id="username" class="span4" name="username" placeholder="Username">
			<input type="password" id="password" class="span4" name="password" placeholder="Password">
            <label class="checkbox">
            	<input type="checkbox" name="remember" value="1"> Recordarme
            </label>
			<button type="button" id="loginBtn" class="btn btn-info btn-block" onclick="">Ingresar</button>
<!-- 			</form>     -->
		</div>
	</div>
</div>
</body>
</html>