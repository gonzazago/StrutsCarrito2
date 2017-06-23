<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<jsp:include page="header.jsp"/>
	 <div id="contact-page" class="container">
    	<div class="bg">
	    	<div class="row">    		
	    		<div class="col-sm-12 padding-right">      			   			
					<h1 class="title text-center">Registro</h1>    			    				    				
				</div>			 		
			</div>    	
    		<div class="row">  	
	    		<div class="col-sm-12">
	    			<div class="formulario">
						<s:form  action="VerificarUsuario"  method="POST" id="Registro">
							<div class="form-group col-md-12">
							    <s:label for="nombreProducto" cssClass="active" value="Nombre Usuario"/>
								<s:textfield name="nombreYapellido" cssClass="validate" placeholder="Nombre y Apellido"/>

							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="DNI"/>
								<s:textfield  name="dni"  cssClass="validate" placeholder="DNI"/>

							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="Fecha de Nacimiento"/>
								<s:textfield  name="fechaNacimiento" cssClass="validate" placeholder="Fecha de nacimiento"/>

							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="Domicilio"/>
								<s:textfield name="domicilio"  cssClass="validate" placeholder="Domicilio"/>
							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="Telefono"/>
								<s:textfield  name="telefono" cssClass="validate" placeholder="Telefono"/>
							</div>
							<div class="form-group col-md-12">
							    <s:label for="nombreProducto" cssClass="active" value="Mail"/>
								<s:textfield  name="Mail" cssClass="validate" placeholder="mail@mail.com"/>
							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="Clave"/>
								<s:password name="clave" id="clave" cssClass="validate" placeholder="Contrase?a"/>
							</div>
							<div class="form-group col-md-6">
							    <s:label for="nombreProducto" cssClass="active" value="Reingrese la Clave"/>
								<s:password name="clave2" id="clave2" cssClass="validate" placeholder="Confirmar Contrase?a"/>
							</div>
							<div class="form-group col-md-6">
					            <s:submit cssClass="btn waves-effect waves-light" value="Guardar"/>
								</div>
							</div>							
						</s:form>
	    			</div>
	    		</div>  			
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