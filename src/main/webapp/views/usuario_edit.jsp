<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="flex-fill flex-grow-1 ms-3">

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


            <table class="table table-hover table-bordered">
                <tr>
                    <th>Id</th>
                    <th>N_documento</th>
                    <th>NombreUsuario</th>
                    <th>ContraseñaUsuario</th>
                    <th>NumeroCelularUsuario</th>

                    <th>
                        <center>Estado</center>
                    </th>
                    <th colspan="2">
                        <center>Acciones</center>
                    </th>
                </tr>
              <c:forEach var="usu" items="${usus}">   
                   <form action="usuario" method="post">
                     <tr>
                        <td><input type="number"class="form-control"name="IdUsuario" value="${usu.getIdUsuario()}" hidden/>${usu.getIdUsuario()}</td>
                        <td><input type="text"class="form-control"name="N_documento" value="${usu.getN_documento()}"/></td>
                        <td><input type="text"class="form-control"name="NombreUsuario"placeholder="Ingrese el nombre " value="${usu.getNombreUsuario()}"/></td>
                        <td><input type="text"class="form-control"name="ContrasenaUsuario"placeholder="Ingrese la contrasena" value="${usu.getConstrasenaUsuario()}"/></td>
                        <td><input type="number"class="form-control"name="NumeroCelularUsuario"placeholder="Ingrese el numero de usuario" value="${usu.getNumeroCelularUsuario()}"/></td>
                        <td><input class="form-check-input"type="checkbox"name="chkEstado" id="chkEstado"value="${usu.getEstadoUsuario()}"/></td>
                        <td><button type="submit" name="accion"value="confirmar">Confirmar</button></td> 
                     </form>
               
               
                  </c:forEach>


            </table>









        </div>