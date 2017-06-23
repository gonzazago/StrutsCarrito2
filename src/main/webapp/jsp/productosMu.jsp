<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <head>
    <title>Ropa's - Tu tienda online</title>
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
            <h2 class="header">Productos Mujeres</h2>
                <s:iterator value = "productosL">
                    <div class="row">
                        <div class="col s12 m4">
                            <div class="card">
                                <div class="card-image">
                                    <img src = <s:property value = "%{nombreimagen}"/> />
                                    <span class="card-title">
                                        <s:property value = "${nombreProducto}"/>
                                    </span>
                                </div>
                                <div class="card-content">
                                    <p><s:property value = "%{descripcion}"/></p>
                                </div>
                                <div class="card-action">
                                    <s:url action="CarritoAction" var="urlTag" >
                                        <s:param name="idProducto">
                                           <s:property value = "%{idProducto}"/>
                                        </s:param>
                                     </s:url>
                                    <a href="<s:property value="#urlTag" />" >Agregar a Carrito</a>
                                </div>
                            </div>
                        </div>
                    </s:iterator>
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
	<script>
	    $(document).ready(function(){
            $('.parallax').parallax();
            });
    </script>
</body>
</html>