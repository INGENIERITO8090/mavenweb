<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title> 

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
    <table class="table table-hover table-bordered"> 
        <tr>
            <th>IdCuenta</th>
            <th>IdUsuario</th>
            <th>Saldo</th>
            <th>EstadoActivo</th>
            <th colspan="2"><center>Acciones</center></th>
        </tr>       
<c:forEach var="cuenta" items="${cuentas}">         
        <tr>
        <td>${cuenta.getIdCuenta()}</td>
        <td>${cuenta.getIdUsuario()}</td>
        <td>${cuenta.getSaldo()}</td>
        <td>${cuenta.getEstadoActivo()}</td> 
        <td> <a href="nequi?accion=modificar">Modificar Cuenta Nequi</a></td>
    
      
        
     	<!--<c:if test="${usuario.getEstadoUsuario() == true}">
           <td><span class="badge bg-success active">usuario Activo</span></td> 
        </c:if>
        <c:if test="${usuario.getEstadoUsuario() == false}">
            <td><span class="badge bg-danger active">usuario Inactivo</span></td> 
        </c:if>
        
        <td>
        <c:if test="${usuario.getEstadoUsuario() == true}">
           <a usuario="button" 
           class="btn btn-danger btn-sm" 
           onclick=""> 
        Inactivar
        </a>
        </c:if>
        <c:if test="${usuario.getEstadoUsuario() == false}">
            <a usuario="button" 
            class="btn btn-success btn-sm" 
          >
        Activar
        </a>
        </c:if> 
        </td>
        
        
        <td>
        <a usurio="button" 
        class="btn btn-warning" 
        href="">
        <i class="bi bi-pencil"></i> 
        </a>

	    <a usurio="button" 
	    class="btn btn-danger" 
	    onclick="">
	    <i class="bi bi-trash"></i> 
	    </a>
	    
	    </td>
        <tr>
        -->
</c:forEach>    


</table>

</body>
</html>