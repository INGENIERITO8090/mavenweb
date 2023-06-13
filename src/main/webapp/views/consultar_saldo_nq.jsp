<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>consultar_saldo</title>
  <link rel="stylesheet" type="text/css" href="assets/css/consultar_saldo_nq.css">
</head>
<body>   
  <div class="contenedor">
    <!-- contenidos de el header -->
    <div class="header"> 
    <h1>Consultar saldo </h1>
         <div class="logotipo">
         <img src="../assets/images/l_nq.png" alt="">
         <h3>Nequi</h3>
         </div>
    </div>
       <div class="centro">
    <div class="grid"> 
        <!--header de navegacion -->
        <!-- division de grid con ruta de servlet con la accion de inicio_dp ( redirige a el menu en el servlet )  -->
        <div class="item"> <a class="a1" href="nequi?accion=inicio_nq">MENU</a>   </div>
        <!-- division de grid con ruta de servlet con la accion de retiarar ( redirige a la vista recagar.jsp en el servlet  )  -->
        <div class="item"> <a class="a1" href="nequi?accion=retirar">SACAR DINERO</a> </div>
         <!-- division de grid con ruta de servlet con la accion de consultar_saldo  ( redirige a el la vista consulrar_saldo.jsp en el servlet  )  -->
        <div class="item"> <a  class="a1" href="nequi?accion=recargar"> RECARGAR</a> </div>
      
    </div>
  
      <div class="caja_1"> 
        <!-- Creamos la exprecion de tipo jsp para que imprima todo parametro que se llame"saldo_t" que en este 
        programa es el nombre que ese le da a el retorno de la mayoria de los metodos -->
       
     <span> Tu saldo :<%=request.getAttribute("saldo_t")%></span>
     </div> 
    </div>
  </div>   
</body>
</html>