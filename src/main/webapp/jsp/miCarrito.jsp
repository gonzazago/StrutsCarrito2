<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib uri="/struts-tags" prefix="s"%>
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
<s:if test="#session.loggin == 'true'">
    <jsp:include page="headerUser.jsp"/>
</s:if>
<s:if test="#session.loggin != 'true'">
    <jsp:include page="header.jsp"/>
</s:if>

    <table class="striped highlight">
        <thead>
          <tr>
              <th>Nombre</th>
              <th>Descripcion</th>
              <th>Cantidad</th>
              <th>Stock</th>
              <th>Precio</th>
          </tr>
        </thead>
<s:iterator value ="productoList">
        <tbody>
          <tr>
            <td><s:property value ="%{nombreProducto}"/></td>
            <td><s:property value ="%{descripcion}"/></td>
            <td><s:property value = "%{cant}"/></td>
            <td><s:property value ="%{stock}"/></td>
            <td><s:property value ="%{precio}"/></td>
          </tr>
 </s:iterator>
        </tbody>
      </table>
  <h1> Precio total : <s:property value= "%{total}"/></h1>

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