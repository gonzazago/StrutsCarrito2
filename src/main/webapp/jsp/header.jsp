<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
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
        					<li><a href="Home" class="active">INICIO</a></li>
        					<li class="dropdown keep-open"><a href="">PRODUCTOS<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="productosMU">Mujeres</a></li>
                                    <li><a href="productosHO">Hombres</a></li>
                                </ul>
                            </li>
    						<li><a href="Registro">REGISTRO</a></li>
    						<li><a href="Contacto">CONTACTO</a></li>
    						<li><a href="Producto">PRODUCTO</a></li>
    					</ul>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
</header>

    	<script>
        	    $(document).ready(function(){
                    $('.parallax').parallax();
                    });
        </script>
</body>
</html>