<%-- 
    Document   : Index
    Created on : Oct 2, 2020, 1:49:11 AM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <div>
            <h3>Estudiantes</h3>
            <form action = "Controlador" method ="" "POST">
                <input type="submit" name="accion" value="Listar">
            </form>
        </div>
        <div>
            <table border=""1>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getId()}</td>
                            <td>${dato.getNombre()}</td>
                            <td>${datos.getApeliidos()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </center>
    </body>
</html>
