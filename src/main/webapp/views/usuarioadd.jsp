<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>

<body>
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

       
        input[type="checkbox"]{
          display: block;
  margin-top: 4px;




        }
        
         span,
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
      
        button[type="submit"] {
          background-color: #4CAF50;
          color: #ffffff;
          padding: 10px 16px;
          border: none;
          border-radius: 3px;
          margin-left: 10px;
          cursor: pointer;
     
        }
      
        button[type="submit"]:hover {
          background-color: #45a049;
        }
      </style>

<div class="contenedor ">
    
 <form action="usuario" method="post"> 
    <label for="N_documento">Numero de documento</label>
    <input type="number"  name="N_documento">
    <label for="NombreUsuario">Nombre de usuario </label>
    <input type="text" name="NombreUsuario">
    <label for="ContrasenaUsuario"> Contraseña usuario  </label>
    <input type="text" name="ContrasenaUsuario">
    <label for="NumeroCelularUsuario">Celular Usuario</label>
    <input type="number" name="NumeroCelularUsuario"> 
    <label for="EstadoUsuario">Estado usuario </label>
     <input type="checkbox" name="chkestado" id="chkestado" checked class="form-check-input">
    <button type="submit" name="accion" value="registrar">Registrar</button> 
    <span><a href="usuario?accion=listar"> listar</a> </span>
    </form>

</div>
</body>
</html>
