![AD1](https://github.com/user-attachments/assets/de9fe802-5258-41b3-837e-9d7cace14720)

## Enunciado

Una empresa se dedica a montar eventos. Cada evento es de un tipo distinto. Los tipos de evento son: concierto, despedida, cumpleaños, boda…, y nos interesa un código que identifique cada evento junto con su descripción. A un evento se inscriben clientes, de los que debemos guardar el esquema SQL. Recuerda que un cliente puede apuntarse a más de un evento. 

De aquí en adelante, podremos incorporar más tablas para completar la aplicación, pero, de momento, con estas tenemos bastantes.

El modelo de datos es el siguiente: 

![Practica1_des](https://github.com/user-attachments/assets/3fb737db-e415-4658-ae72-f02482781f44)

## Desarrollo

La idea es que construyamos una aplicación con JEE, servlet y JSP, sin acceso a datos, y cuya página principal tenga esta imagen (index.jsp). 

![c-158](https://github.com/user-attachments/assets/f1de4b40-ac1a-4674-857f-8320aaf467b5)

Vamos a implementar el servlet GestionEventos.

    Las páginas JSP necesarias para las tareas definidas a continuación.
    La clase de Bean 'Evento' y 'Tipo', a partir de las tablas que tienes en este enunciado.
    El interface llamado IntEventoDao de la clase 'Evento' con los métodos necesarios.
    Una clase EventoDaoImpl, que contiene una lista de eventos con su tipo y la implementación de los métodos del interface.

Del servlet llamado GestionEventos tratamos las siguientes opciones:

    “?opcion=activos” ->  Sacar el listado de la imagen superior.
    “?opcion=alta: -> Mostrar un formulario con los datos del evento, poner el estado del evento como ‘activo’ y, si quieres destacarlo, poner una ‘s’ en su columna.
    “?opcion=editar&id=x “ -> Mostrar en un JSP los datos del evento.
    “?opcion=eliminar&id=x “ ->  Borrarlo de la clase que contiene los eventos y volver al listado de activos.
    “?opcion=cancelar&id=x “ ->  Poner el estado del evento como cancelado, y volver al listado de activos.

De momento no nos preocupamos de quién entra en la aplicación. Vamos a suponer que entra a la aplicación un administrador que tiene permisos para probar todas las tareas que se proponen.
