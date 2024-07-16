<%@page import="java.util.List"%>
<%@page import="modelo.javabeans.Evento"%>
<%@page import="modelo.javabeans.Tipos"%>
<%@page import="modelo.dao.EventoDaoImpl"%>
<%@page import="modelo.dao.IntEventoDao"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Aplicacion gestion de eventos</title>
</head>
<body>

	<% EventoDaoImpl ievento =new EventoDaoImpl();
	    List<Evento> lista = ievento.buscarTodosIdEvento();
	    String mensaje=null;   
	 %>
	 
	 
		
	
	<h1>Aplicación Gestión de Eventos</h1>
	
	<table border=2>
  		<tr>
    		<th><a href="#">Tipos</a></th>
    		<th><a href="#">Eventos</a></th>
    		<th><a href="#">Usuarios</a></th>
    		<th><a href="#">Eventos/Tipo</a></th>
    		<th><a href="#">Login</a></th>
    		<th><a href="#">Registro</a></th>
    		<th><a href="#">Salir</a></th>
  		</tr>
 	</table>

    <br>

    <h2>Listado de Eventos activos</h2>

    <br>

<table border=2>

<tr>
<th><a href="altaEvento.jsp">Nuevo evento</a></th>
</tr>
</table>
   
    <br>

<table border=2>

<tr>

<th>Id</th>
<th>Nombre</th>
<th>Precio</th>

<th colspan=3>Opciones</th>

</tr>

<% for (Evento ele : lista) {%>

<tr>

<td><%=ele.getIdEvento()%></td>
<td><%=ele.getNombreEvento()%> </td>
<td><%=ele.getPrecioEvento()%> </td>

<!-- con el ancla hacemos que al pinchar en la opción nos vayamos de la acción elegida al controlador a través del switch -->
<td><a href="editarEvento.jsp">Editar Evento</a></td>

<td><a href="eventos?opcion=eliminar&id=<%=ele.getIdEvento()%>">Eliminar Evento</a></td>

<td><a href="eventos?opcion=cancelar&id=<%=ele.getIdEvento()%>">Cancelar Evento</a></td>

</tr>

<%} %>

</table>

</body>
</html>