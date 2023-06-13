<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="flex-fill flex-grow-1 ms-3">
            <style>
                body {
                  font-family: Arial, sans-serif;
                  background-color: #f2f2f2;
                  padding: 20px;
                }
              
                form {
                  max-width: 400px;
                  background-color: #ffffff;
                  padding: 20px;
                  margin: 0 auto;
                  border-radius: 5px;
                  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
                }
              
                label {
                  display: block;
                  margin-bottom: 8px;
                  font-weight: bold;
                }
              
                input[type="text"],
                input[type="email"],
                textarea {
                  width: 100%;
                  padding: 8px;
                  border-radius: 3px;
                  border: 1px solid #ddd;
                  box-sizing: border-box;
                  margin-bottom: 16px;
                }
              
                input[type="submit"] {
                  background-color: #4CAF50;
                  color: #ffffff;
                  padding: 10px 16px;
                  border: none;
                  border-radius: 3px;
                  cursor: pointer;
                }
              
                input[type="submit"]:hover {
                  background-color: #45a049;
                }
              </style>

            <!-- <h1>Actualizar Usuario</h1>
  <form method="post" action="usuarioController?accion=update">
  	<input type="text" class="form-control" name="id" value="${usuario.idRol}"/>
  	    <div class="form-group">
  		<label for="N_documento">N_documento</label>
  		<input type="text" class="form-control" name="N_documento"  value="${usuario.N_documento}"/>
          <label for="">Nombre</label>
  		<input type="text" class="form-control" name="NombreUsuario" placeholder="Ingrese el nombre " value="${usuario.NombreUsuario}"/>
          <label for="contrasena">Contrasena </label>
  		<input type="text" class="form-control" name="ContrasenaUsuario" placeholder="Ingrese la contrasena" value="${usuario.ContrasenaUsuario}"/>
          <label for="NumeroCelular">Numero Celular </label>
  		<input type="number" class="form-control" name="NumeroCelularUsuario" placeholder="Ingrese el numero de usuario" value="${usuario.NumeroCelularUsuario}"/>
    </div>
  	<div class="form-check">
  	
  <input class="form-check-input" type="checkbox" name="chkEstado" id="chkEstado" 
  <c:out value="${rol.estadoRol==false ? 'unchecked':'checked'}" default=""/>>
</div>

<div>
<button type="submit" class="btn btn-primary">Guardar</button>
</div>
  
  </form>
  </div> -->

<body>
    
            <table class="table table-hover table-bordered">
                <H1>Cuentas Nequi</H1>
                <tr>
                    <th>IdCuenta</th>
                    <th>IdUsuario</th>
                    <th>Saldo</th>
                    <th>Estado Activo </th>
                    <th>
                        <center>Estado</center>
                    </th>
                    <th colspan="2">
                        <center>Acciones</center>
                    </th>
                </tr>
                <c:forEach var="cuenta" items="${cuentas}">      
                  <form action="nequi" method="post">
                    <tr>
                        <td><input type="number"class="form-control"name="IdCuenta" value="${cuenta.getIdCuenta()}" hidden/>${cuenta.getIdCuenta()}</td>
                        <td><input type="number "class="form-control"name="IdUsuario" value="${cuenta.getIdUsuario()}"hidden/>${cuenta.getIdUsuario()}</td>
                        <td><input type="number"class="form-control"name="Saldo"placeholder="Ingrese el nombre " value="${cuenta.getSaldo()}" hidden/> ${cuenta.getSaldo()}</td>                        
                        <td><input class="form-check-input"type="checkbox"name="chkEstado"id="chkEstado"value="${usuario.getEstadoUsuario()}"/></td>
                        <td><button type="submit" name="accion"value="confirmar">Guardar</button></td> 
                  </form>
               
               
                    </c:forEach>


            </table>

    
</body>



        </div>