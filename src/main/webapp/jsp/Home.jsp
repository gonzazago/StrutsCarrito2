<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib uri="/struts-tags" prefix="s"%>
    <head>
    <title>Ropa's - Tu tienda online</title>
    	<link rel="shortcut icon" href="images/favicon.png">
    	        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
    	<link href="css/main.css" rel="stylesheet">
    	<link href="css/responsive.css" rel="stylesheet">
    	<script src="js/jquery-1.10.2.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<jsp:include page="header.jsp"/>

        <h1><s:property value="Mensaje" /></h1>

<jsp:include page="footer.jsp"/>
    </body>
</html>