<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="UTF-8">css
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/css/estilos.css">
    <title>Index</title>
  </head>
  <body>
    <div class="contenedor"> 
    <!--Contenidos de header    -->
      <div class="header ">
        <h1>Tus bolsillos </h1>
        <div class="nav">
          <ul>
            <li> <a href="usuario?accion=formulario">GESTIONAR USUARIO</a>
            </li>
            <li>
              <a href="usuario?accion=formulariocuenta">GESTIONAR CUENTA</a>
            </li>
            <li>
              <a href="">QUE ES UN BOLSILLO VIRTUAL </a>
            </li>
            <li>
              <a href="">EQUIPO DE TRABAJO </a>
            </li>
          </ul>
        </div>
<!-- contenidos el centro  -->
      </div>
      <div class="centro"> 
        <!-- mensaje de vienvenida -->
        <h1> BIENVENIDO A TUS BOLSILLOS </h1>
        <h3> Elige tu app </h3>
        <div class="opciones ">
          <ul>
            <li> 
              <label for="btn"><img src="assets/images/l_daviplata.png" alt=""> </label> 
              <!-- ruta de el servlet aplicado a un boton para redirigir  -->
              <button type="button" name="btn"><a href="daviplata?accion=daviplata"> Daviplata</a> </button>
            </li>
             <!-- ruta de el servlet aplicado a un boton para redirigir  -->
            <li><img id="l_n" src="assets/images/l_nq.png" alt="">
              <button type="button" name="btn" id="b_t"><a href="nequi?accion=nequi ">Nequi</a> </button>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </body>

  </html>