<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
  <nav>
    <div class="nav-wrapper nav-wrapper grey lighten-1">
        <a href="Home" class="brand-logo"><i class="material-icons left">home</i></a>
        <ul id="dropdown1" class="dropdown-content">
            <li><a href="productosHO">Hombres</a></li>
            <li><a href="productosMU">Mujeres</a></li>
        </ul>
        <ul class="right hide-on-med-and-down">
            <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Categorias<i class="material-icons right">arrow_drop_down</i></a></li>
            <li><a href="Administrar"><i class="material-icons left">list</i>Administrar Productos</a></li>
            <li><a href="Logout">Cerrar Sesion</a></li>
        </ul>
    </div>
</nav>
</header>

    	<script>
        	    $(document).ready(function(){
                    $('.parallax').parallax();
                    });
        </script>
</body>
</html>

