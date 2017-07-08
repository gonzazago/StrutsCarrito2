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
    <link href="css/materialize.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <script src="js/jquery-1.10.2.js"></script>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome-4.6.3/css/font-awesome.min.css"/>
</head>
<body>
<s:if test="hashActionErros()">
    <div class ="errors">
        <s:actionerror/>
    </div>
</s:if>
<s:set name="logeado" value="#session.loggin"/>
<s:set name="tipo" value="#session.tipo"/>

<s:if test="#session.loggin == 'true'">
    <jsp:include page="headerUser.jsp"/>
</s:if>
<s:if test="#session.loggin != 'true'">
    <jsp:include page="header.jsp"/>
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
			                    <s:label for="nombreProducto" cssClass="active" value="Nombre Contacto"/>
                                <s:textfield cssClass="active" name="contacto" label="Nombre"/>
                            </div>
		                    <div class="form-group col-md-6">
		                        <s:label for="nombreProducto" cssClass="active" value="Asunto"/>
                                <s:textfield cssClass="active" name="asunto" label="Asunto"/>
                            </div>
    	    	            <div class="form-group col-md-6">
    	    	                <s:label for="nombreProducto" cssClass="active" value="Mensaje"/>
                                <s:textarea cssClass="materialize-textarea" name="cuerpoMail" label="Comentarios"/>
                            </div>
                            <div class="form-group col-md-6">
                                <s:submit cssClass="btn waves-effect waves-light" value="Enviar"/>
                            </div>
                    </s:form>
            </div>
        </div>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>