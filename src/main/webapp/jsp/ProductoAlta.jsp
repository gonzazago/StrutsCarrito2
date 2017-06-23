<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
 <div class="row class s10">
	<s:form  action="VerificarProducto"  cssClass="col s10" method="POST" id="Producto" enctype="multipart/form-data">
	    <div class="input-field col s10">
	        <s:label for="nombreProducto" cssClass="active" value="Nombre Producto"/>
	        <s:textfield name="nombreProducto" cssClass="validate" placeholder="Nombre Producto"/>
	    </div>
	    <div class="input-field col s10">
	    <s:label for="nombreProducto" cssClass="active" value="Descripcion de Producto"/>
		    <s:textarea label="Comments" name="descripcion" cssClass="materialize-textarea" cols="30" rows="8"/>
		</div>
		<div class="input-field col s10">
		    <s:label for="nombreProducto" cssClass="active" value="Categoria Producto"/>
		    <s:select name="categoria" cssClass="input-field" list ="categoria" listKey="idCategoria" listValue="Detalle" label= "Categorias"/>
        </div>
		<div class="input-field col s10">
		    <s:label for="nombreProducto" cssClass="active" value="Colores disponibles"/>
		    <s:select name="color" list ="color" cssClass="input-field" listKey="idColor" listValue="detalle"/>
        </div>
		<div class="input-field col s10">
		    <s:label for="nombreProducto" cssClass="active" value="Talles disponibles"/>
		    <s:select name="talle" cssClass="input-field" list ="talle" listKey="idTalle" listValue="detalle"/>
        </div>
		<div class="input-field col s10">
		    <s:label for="nombreProducto" cssClass="active" value="Genero MAS/FEM"/>
            <s:textfield name="genero" cssClass="validate" placeholder="Genero MAS/FEM"/>
        </div>
        <div class="input-field col s10">
        <s:label for="nombreProducto" cssClass="active" value="Precio"/>
            <s:textfield name="precio" cssClass="validate" placeholder="Precio"/>
        </div>
        <div class="input-field col s10">
            <s:label for="nombreProducto" cssClass="active" value="Imagen Producto"/>
	        <s:file name="userImage" cssClass="file-path validate" label="User Image" />
        </div>
	    <div class="input-field col s10">
	        <s:label for="nombreProducto" cssClass="active" value="Novedad S/N"/>
	        <s:textfield name="novedad" cssClass="validate" placeholder="Novedad"/>
        </div>
	    <div class="input-field col s10">
	        <s:label for="nombreProducto" cssClass="active" value="Stock disponible"/>
		    <s:textfield name="stock" cssClass="validate" placeholder="Stock"/>
        </div>
		<div class="input-field col s10">
		    <s:submit cssClass="btn waves-effect waves-light" value="Guardar"/>
        </div>
	 </s:form>
 </div>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/materialize.min.js"></script>
<script src="js/jquery.scrollUp.min.js"></script>
<script src="js/price-range.js"></script>
<script src="js/main.js"></script>
<script src="js/html5shiv.js"></script>
<script>
  $(document).ready(function() {
    $('select').material_select();
  });
         </script>
</body>
</html>