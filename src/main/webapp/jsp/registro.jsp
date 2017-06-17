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
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<script src="js/jquery-1.10.2.js"></script>	

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
								<s:textfield name="nombreYapellido" class="form-control" placeholder="Nombre y Apellido"/>

							</div>
							<div class="form-group col-md-6">
								<s:textfield  name="dni"  class="form-control" placeholder="DNI"/>

							</div>
							<div class="form-group col-md-6">
								<s:textfield  name="fechaNacimiento" class="form-control" placeholder="Fecha de nacimiento"/>

							</div>
							<div class="form-group col-md-6">		
								<s:textfield name="domicilio"  class="form-control" placeholder="Domicilio"/>

							</div>
							<div class="form-group col-md-6">
								<s:textfield  name="telefono" class="form-control" placeholder="Telefono"/>

							</div>
							<div class="form-group col-md-12">
								<s:textfield  name="eMail" class="form-control" placeholder="E-mail"/>

							</div>
							<div class="form-group col-md-6">
								<s:password name="clave" id="clave" class="form-control" placeholder="Contrase?a"/>

							</div>
							<div class="form-group col-md-6">
								<s:password name="clave2" id="clave2" class="form-control" placeholder="Confirmar Contrase?a"/>

							</div>
							<div class="form-group col-md-12">
								<div class="form-group col-md-6">
									<s:textfield type="reset" class="btn btn-primary pull-left"/>
								</div>
								<div class="form-group col-md-6">
									<s:submit id= "boton" name="submit" class="btn btn-primary pull-right" value="Registrar"/>
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
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/main.js"></script>
	<script src="js/html5shiv.js"></script>
	
</body>
</html>