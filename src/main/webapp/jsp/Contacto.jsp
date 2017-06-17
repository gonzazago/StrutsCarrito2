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
    <title>Ropa's - Tu tienda online</title>
	<link rel="shortcut icon" href="images/favicon.png">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
</head>
<body>

<header id="header">
				<div class="header-bottom responsive">
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="/ropa">INICIO</a></li>
								<li class="dropdown"><a href="">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/ropa/productosMu">Mujeres</a></li>
										<li><a href="/ropa/productosHo">Hombres</a></li>
										<li><a href="/ropa/productosNi">Niños</a></li>
                                    </ul>
                                </li>
								<li><a href="/ropa/registro">REGISTRO</a></li>
								<li><a href="/ropa/contacto" class="active">CONTACTO</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

	</header>
<s:if test="hashActionErros()">
    <div class ="errors">
        <s:actionerror/>
    </div>
</s:if>

<div id="contact-page" class="container">
    	<div class="bg">
	    	<div class="row">
	    		<div class="col-sm-12 padding-right">
					<h1 class="title text-center">Contacto </h1>
				</div>
			</div>
    		<div class="row">
	    		<div class="col-sm-8">
	    			<div class="contact-form">
                        <s:form id="Contacto" method="Post" action="VerificarMail">
			                <div class="form-group col-md-6">
                                <s:textfield class="form-control" name="contacto" label="Nombre"/>
                            </div>
		                    <div class="form-group col-md-6">
                                <s:textfield class="form-control" name="asunto" label="Asunto"/>
                            </div>
    	    	            <div class="form-group col-md-6">
                                <s:textarea class="form-control" name="cuerpoMail" label="Comentarios"/>
                            </div>
                            <div class="form-group col-md-6">
                                <s:submit id="submit" value="Enviar"/>
                            </div>
                    </s:form>
            </div>
        </div>
   		<div class="col-sm-4">
     	    			<div class="contact-info">
              	    				<h2 class="title text-center">Información de Contacto</h2>
                   	    				<address>
                	    					<p>ROPA'S</p>
                							<p>Florencio Varela 1903, B1754JEC San Justo, Buenos Aires</p>
                							<p>Argentina</p>
                							<p>Teléfono 4444 3333</p>
                							<p>Email: info@ropas.com</p>
                	    				</address>
                	    				<div class="social-networks">
                	    					<h2 class="title text-center">Redes Sociales</h2>
                							<ul>
                								<li><a href="https://www.facebook.com" target="_blank"><i class="fa     fa-facebook"></i></a></li>
                								<li><a href="https://twitter.com" target="_blank"><i class="fa fa-twitter"></i></a></li>
                								<li><a href="https://linkedin.com" target="_blank"><i class="fa fa-linkedin"></i></a></li>
                								<li><a href="https://plus.google.com" target="_blank"><i class="fa fa-google-plus"></i></a></li>
                							</ul>
                	    				</div>
                	    			</div>
                    			</div>
                	    	</div>
                    	</div>
                    </div>

</body>
</html>