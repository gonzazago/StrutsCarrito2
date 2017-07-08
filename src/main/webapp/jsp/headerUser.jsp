<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="/struts-tags" prefix="s"%>
</head>
<body>
<nav>
    <div class="nav-wrapper amber accent-3">
        <a href="Home" class="brand-logo"><i class="material-icons left">home</i></a>
        <ul id="dropdown1" class="dropdown-content">
            <li><a href="productosHO">Hombres</a></li>
            <li><a href="productosMU">Mujeres</a></li>
        </ul>
        <ul class="right hide-on-med-and-down">
            <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Categorias<i class="material-icons right">arrow_drop_down</i></a></li>
            <s:if test="#session.tipo == 'Usuario'">
                <li><a href="#">Usuario: <s:property value="#session.user"/></a></li>
                <li>
                    <s:url action="miCarritoAction" var="urlTag" >
                        <s:param name="idUsuario">
                            <s:property value = "#session.idUsuario"/>
                        </s:param>
                    </s:url>
                    <a href="<s:property value="#urlTag" />" ><i class="material-icons left">shopping_cart</i>Mi Carrito</a>
                </li>
            </s:if>
            <s:elseif test="#session.tipo == 'admin'">
                <li><a href="Administrar"><i class="material-icons left">list</i>Administrar Productos</a></li>
            </s:elseif>
            <li><a href="Logout">Cerrar Sesion</a></li>
        </ul>
    </div>
</nav>

    	<script>
        	    $(document).ready(function(){
                    $('.parallax').parallax();
                    });
        </script>
</body>
</html>