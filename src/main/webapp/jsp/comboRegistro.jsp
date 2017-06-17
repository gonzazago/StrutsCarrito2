<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="header-middle">
			<div class="container">
				<div class="row">
					<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
						<div class="logo pull-left agranda">
							<a href="/ropa"><img src="images/home/logo.png" alt=""/></a>
						</div>
					</div>
                
	                <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
						<div class="row col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="shop-menu">
									<ul class="nav navbar-nav">
										<li><a href="#myModal" data-toggle="modal" data-target="#myModal"><i class="fa fa-user" >
<%if (session.getAttribute("user") != null) {
	String name = (String) session.getAttribute("user");
	out.print(name);
	}else { 
String estado = (String)"Ingresar";
out.print(estado);}%>	
										</i></a></li>
<% if (session.getAttribute("user") != null){%>
										<li><a href="/ropa/logout"><i class="fa fa-sign-out" >
<%String estado = (String)("Salir");
out.print(estado);%>
										</i></a></li><% } %>										
									</ul>
								</div>
						</div>
					</div>
				</div>
			</div>
		</div>

<!--LOGIN-->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
      <div class="modal-content modal-agregar">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		  <h4 class="modal-title text-center" id="exampleModalLabel">Login</h4>
        </div>
        <div class="modal-body">
			<form:form action="/ropa/login" modelAttribute="usuario" role="form" method="POST" name="login" >
			  <div class="form-group">
				<input type="email" name="emaillog" class="form-control" placeholder="E-mail" required="required" 
				pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}" title="Ej: nombre@mail.com"/>
			  </div>
			  <div class="form-group">
				<input type="password" name="clavelog" class="form-control" placeholder="Contrase�a" required="required"
				pattern="[A-Za-z0-9]{4,8}" title="Debe contener entre 4 y 8 caracteres alfanum�ricos"/>
			  </div>
				<div class="modal-footer">	
					<a href="/ropa/registro">�No ten�s cuenta? Registrate </a>
					<button type="submit"  class="btn btn-primary pull-right" id="boton">Ingresar</button>
				</div>
			</form:form>
		</div>
      </div>
    </div>
</div>

</body>
</html>