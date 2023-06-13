<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title> 

    
List<usuarios> usuarios=(List<usuarios>)request.getAttribute("usuarios.getIdUsuario()"); %> </p>
</head>
<body>
    <style>
        table {
          border-collapse: collapse;
          width: 100%;
          font-family: Arial, sans-serif;
        }
      
        th, td {
          padding: 8px;
          text-align: left;
          border-bottom: 1px solid #ddd;
        }
      
        th {
          background-color: #f2f2f2;
        }
      
        tr:hover {
          background-color: #f5f5f5;
        }
      </style>
  <!-- <p><%=request.getAttribute("usuarios")%></p>--> 
    <table class="table table-hover table-bordered"> 
        <tr>
            <th>Id</th>
            <th>N_documento</th>
            <th>NombreUsuario</th>
            <th>ContraseñaUsuario</th>
            <th>NumeroCelularUsuario</th>
            <th><center>Estado</center></th>  
            <th>accion</th>         
        </tr>       
<c:forEach var="usuario" items="${usuarios}">         
        <tr>
        <td>${usuario.getIdUsuario()}</td>
        <td>${usuario.getN_documento()}</td>
        <td>${usuario.getNombreUsuario()}</td>
        <td>${usuario.getConstrasenaUsuario()}</td>
        <td>${usuario.getNumeroCelularUsuario()}</td>
        <td>${usuario.getEstadoUsuario()}</td> 
        <td><form action="usuario" method="get">
            <input type="number" name="idusu" value="${usuario.getIdUsuario()}"hidden>
            <button type="submit" name="accion" value="modificar">Modificar</button>
        </form> 
      </td>
         </tr>
       
</c:forEach>    


</table>

</body>
</html>