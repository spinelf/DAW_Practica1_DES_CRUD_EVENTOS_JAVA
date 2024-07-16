<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- En esta página podemos introducir los datos para dar de alta un evento -->


<title>Formulario alta evento</title>
</head>
<body>
<form id="alta" action=# method="post">
	<div>
    <label for="id"><b>Id Evento:</b> </label><br/>
    <input id="id" class="input" name="id" type="text" value="" size="3" placeholder="Id del evento"/><br />
  	</div>
  	<br/>
	<div>
    <label for="nombre"><b>Nombre:</b> </label><br/>
    <input id="nombre" class="input" name="nombre" type="text" value="" size="30" placeholder="Nombre del evento"/><br />
  	</div>
  	<br/>
  	<div>
    <label for="descripcion"><b>Descripción:</b> </label><br/>
    <input id="descripcion" class="input" name="descripcion" type="text" value="" size="30" placeholder="Descripción del evento"/><br />
  	</div>
  	<br/>
  	<div>
    <label for="duracion"><b>Duración del evento:</b> </label><br/>
    <input id="duracion" class="input" name="duracion" type="number" value="" size="5" min="60"  placeholder="Cuántas minutos dura el evento"/><br />
  	</div>
  	<br/>
  	<div>
    <label for="estado"><b>Estado:</b> </label><br/>
    <input id="estado" class="input" name="estado" type="radio" value="Activo"/> Activo 
    <input id="estado" class="input" name="estado" type="radio" value="Cancelado"/> Cancelado <br/>
  	</div>
  	<br/>
  	<div>
    <label for="maximo"><b>Aforo máximo del evento:</b> </label><br/>
    <input id="maximo" class="input" name="maximo" type="number" value="" min="0" placeholder="Aforo máximo del evento"/><br />
  	</div>
  	<br/>
  	<div>
  	<label for="minimo"><b>Aforo mínimo del evento:</b> </label><br/>
    <input id="minimo" class="input" name="minimo" type="number" value="" min="0" placeholder="Aforo mínimo del evento"/><br />
  	</div>
  	<br/>
  	<div>
  	<label for="precio"><b>Precio del evento:</b> </label><br/>
    <input id="precio" class="input" name="precio" type="text" value="" placeholder="Precio del evento"/><br />
  	</div>
  	<br/>
  	<input id="submit" type="submit" value="Dar de alta evento"/>
  	<br/>
  	<table border=2>
	<tr>
	<th><a href="index.jsp">Regresar al inicio</a></th>
	</tr>
	</table>
  	
  	
</form>
</body>
</html>