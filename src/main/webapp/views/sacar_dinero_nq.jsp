<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>sacar_dinero_nq</title> 
   <link rel="stylesheet" type="text/css" href="assets/css/sacar_dinero_nq.css">

</head>
<body >
  <div class="contenedor ">
<!-- contenidos de el header -->
  <div class="header">
    <h1>Retirar </h1>
         <div class="logotipo">
         <img src="../assets/images/l_nq.png" alt="">
         <h3>Nequi</h3>
         </div>  </div> 
  <div class="centro">
   <div class="grid">
      <!--header de navegacion -->
                    <!-- division de grid con ruta de servlet con la accion de inicio_dp ( redirige a el menu en el servlet )  -->
    <div class="item"><a href="nequi?accion=inicio_nq">MENU</a>   </div>
     <!-- division de grid con ruta de servlet con la accion de consultar_saldo  ( redirige a el la vista consulrar_saldo.jsp en el servlet  )  -->
    <div class="item"> <a href="nequi?accion=consultar_saldo">CONSULTAR SALDO</a> </div>
     <!-- division de grid con ruta de servlet con la accion de recargar   ( redirige a el la vista recargar.jsp en el servlet  )  -->
    <div class="item"> <a href="nequi?accion=recargar"> RECARGAR</a> </div>
    
   </div> 

     
 <div class="centro"> 
  <div class="caja1">
  <div class="formulario"> 
    <!--formulario de envio e informacion -->
   <form action="nequi" method="post">  
                <label for="cantidad_r">  <p> Digita la cantidad de retiro</p> </label> 
                <!--input con nombre "cantidad_r"  cuya informacion que se ingrese sera invoada con el nombre de " cantidar_r"-->
                <input type="text" name="cantidad_r" id="cantidad_r">
                <label for="n_celular"><p> Digita tu  numero de celular </p></label>
                 <!--input con nombre "n_celular" cuya informacion que se ingrese sera invoada con el nombre de"n_celular"-->
                <input type="text" name="n_celular" id="n_celular" id="i2" > 
                <!-- boton de finalizacion y envio de formulario con nombre de accion y valor "enviar_c_r"-->
                <button type="submit"  name="accion" value="enviar_c_r" id=""">confirmar</button>
           </form> 

       </div>
    </div>
  </div>
  </div>
  </div> 
</body>
</html>