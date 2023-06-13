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
    
 <form action="usuario"method="post"> 
   <label for="IdUsuario">IDUSUARIO</label>
   <input type="number"name="IdUsuario">
   <label for="Saldo">SALDO</label>
   <input type="number" name = "Saldo" value="0"  hidden>0  
   <label for="chkesatado">ESTADO ACTIVO CUENTA</label>
   <input type="checkbox" name="chkestado" id="chkestado" checked class="form-check-input">
   <button type="submit" name="accion" value="registrar_c">REGISTRAR CUENTA</button> 
   <span><a href="daviplata?accion=listar"> listar</a>     </span>
 </form>
</div>
</body>
</html>
