<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
    <!DOCTYPE html>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="assets/css/recarga_nq.css">
        <title>Recarga_NQ</title>
    </head>

    <body>
        <div class="header"> 
                 <h1>Recargar </h1>
                <div class="logotipo">
                <img src="../assets/images/l_nequi.png" alt="">
                <h3>Nequi</h3>
                </div>  </div>
                
            <div class="contenedor">
                <!-- contenidos de header -->
            
            <div class="centro ">
                <div class="grid">
                    <!--header de navegacion -->
                    <!-- division de grid con ruta de servlet con la accion de inicio_dp ( redirige a el menu en el servlet )  -->
                    <div class="item"> <a class="a1" href="nequi?accion=inicio_nq">MENU</a> </div>
                     <!-- division de grid con ruta de servlet con la accion de retiarar ( redirige a la vista recagar.jsp en el servlet  )  -->
                    <div class="item"> <a class="a1" href="nequi?accion=retirar">SACAR DINERO</a> </div>
                     <!-- division de grid con ruta de servlet con la accion de consultar_saldo  ( redirige a el la vista consulrar_saldo.jsp en el servlet  )  -->
                    <div class="item"> <a class="a1" href="nequi?accion=consultar_saldo"> CONSULTAR SALDO</a> </div>
                </div>
            </div> 


            <div class="caja_1"> 
              
              <div class="formulario"> 
                <!-- formulario de envio  -->
                 <div class="mensaje"><p> Digita la cantidad que deseas recargar </p></div>
                <form action="nequi" method="post"> 
                    <!--input con nombre valor recarga  -->
                    <input type="text" name="valor_recarga" id="valor_recarga"> 
                    <!-- boton de finalizacion y envio de el formulario  con nombre "ACCION  y su valor es
                        "enviar " -->
                    <button type="submit" name="accion" value="enviar" id="b1">confirmar</button>
                </form>
             </div>
            </div>
         </div>
</div>
    </body>

    </html>