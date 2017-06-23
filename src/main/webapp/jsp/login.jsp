<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

 <%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>"Ropa's - Tu tienda online"</title>
	<link rel="shortcut icon" href="images/favicon.png">
        	<link href="css/bootstrap.min.css" rel="stylesheet">
        	<link href="css/materialize.css" rel="stylesheet">
            <link href="css/font-awesome.min.css" rel="stylesheet">
            <link href="css/price-range.css" rel="stylesheet">
            <link href="css/main.css" rel="stylesheet">
            <link href="css/responsive.css" rel="stylesheet">
            <script src="js/jquery-1.10.2.js"></script>
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <link rel="stylesheet" href="font-awesome-4.6.3/css/font-awesome.min.css"/>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div class = "container">

<div class="panel-body">
        <p class="text-center">Debes iniciar Sesion para poder añadir productos al carrito</p>
    </div>

<form  class="col s12" action="VerificarLogin" method="POST" id="Registro">
  <div class="row">
       <div class="row">
         <div class="input-field col s12">
           <input placeholder="Usuario" name ="nombre" id="first_name" type="text" class="validate">
           <label for="first_name">Nombre Usuario</label>
          </div>
         <div class="input-field col s12">
           <input id="password" type="password" name ="password"class="validate">
           <label for="password">Password</label>
         </div>
          <button class="btn waves-effect waves-light" type="submit" name="action">Submit
             <i class="material-icons right">send</i>
           </button>
       </div>
    </form>
    <div class="panel-body">
        <p class="text-center">Si no tienes usuarios puedes registrarte haciendo click <a href="Registro">aqui</a></p>
    </div>
  </div>
 </div>
<jsp:include page="footer.jsp"/>

<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/materialize.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/main.js"></script>
	<script src="js/html5shiv.js"></script>

</body>

</html>