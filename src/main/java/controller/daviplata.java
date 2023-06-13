package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.daviplataDao;
import model.daviplataVo;

public class daviplata  extends HttpServlet { 
 daviplataVo  dp=new daviplataVo();
  daviplataDao rd=new daviplataDao();

 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
    String accion=req.getParameter("accion");
    System.out.println(accion);

    
    switch(accion){
        case "index":
        req.getRequestDispatcher("views/index.jsp").forward(req, resp);
        break;
        /* Ruta del servlet de la vista del index que redirige el login de el aplicativo  */
        case "daviplata":
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
        break; 
    /* ruta del servlet con la accion recargar redirige ala vista "recarga.jsp"*/
        case "recargar":
        req.getRequestDispatcher("views/recarga.jsp").forward(req, resp);
        break;  
   /* ruta del servlet con la accion retirar redirige ala vista "sacar_dinero.jsp"*/
        case "retirar":
        req.getRequestDispatcher("views/sacar_dinero.jsp").forward(req, resp);
        break;  
/* ruta del servlet con la accion consultar_saldo  redirige ala vista "consultar_salsdo.jsp"*/
         case "consultar_saldo":
         /* generamos una respuesta para la exprecion en la vista de consultar saldo 
          * la cual va a hacer el retorno de el metodo gett de Saldo_t el cual el retorno de 
          este metodo es el Valor de Saldo t a este resultado ( retorno ) lo vamor a llarmar como "saldo_t"
          */
       /*  req.setAttribute("saldo_t");*/
        /*se redirige ala vista consultar _saldo.jsp */
        req.getRequestDispatcher("views/consultar_saldo.jsp").forward(req, resp);
        break; 
/* ruta del servlet con la accion inicio_dp que redirige ala vista "inicio_dp.jsp "(menu) */
        case "inicio_dp":
        req.getRequestDispatcher("views/inicio_dp.jsp").forward(req, resp);
        break;  

         case "formulario":
         System.out.println("formulariodp");
         req.getRequestDispatcher("views/daviplata_add.jsp").forward(req, resp);
         break;

        case"listar":
             cuentas(req, resp);
        break;
        case"modificar": 
        System.out.println("modificar");
        actualizar(req, resp); 
         }
         } 

     


    


    

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 


        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch(accion){  

      
              /*  caso de finalizacion y envio de informacon de el boton de el login  */
            case "inicio":  
            /*  creamos la variable "v_nombre" cuyo valor sera igual a 
            la informacion recojida en el input "nombre"
            esto se hace mediante el metodo getParametrer 
            lo que hace es traeer el parametro cuyo nombre esta entre comillas   */ 
           // String v_nombre=req.getParameter("nombre");
            /* creamos la variable de "v_n_doc" la cual para agregarle un valor es necesario un parseo 
             esto es necesario ya que el input donde se recojio la informacion es de tipo de texto
             hacemos el mismo proceso que la anterior variable le asignamos el valor con la informacion 
             recojida en el input "documento"
             */
          //  int v_n_doc=Integer.parseInt( req.getParameter("documento"));
            /* hacemos el mismo proceso con la variable "v_contrasena" cuyo valor sera el almacenado en
             * el input"contrasena"
             */
           // String v_contrasena=req.getParameter("contrasena");
            /* habiendo instaciado la clase  que utlizaremsos en este caso de accion 
             * y teneniendo las respectivas reglas de creacion de una clase ( atributos,
             * variables , getters ,setters, metodos constructores y metodos  
             * el siguiente paso sera "settear"(modificar el valor de un atributo u variables de una clase 
             * mediante un metodo accesor de tipo Set  )
             *con el valor de la valor de la variable previamente creada v_nombre
             este sera el nuevo valor de la variable "v_nombre" de la clase dp)
              */
            //dp.setV_nombre(v_nombre); 
            /* hacemos el mismo proceso para modificar el valor de la variable de la clase dp 
             *  llamado "v_n_doc" mediante un setter cuyo argumeto de el metodo set  sera la variable previamente creada
             * "v_n_doc"
             */
           // dp.setV_n_doc(v_n_doc);
        /* hacemos el mismo proceso para la variable de la clase dp "v_vontraseña"   modificamos la variable 
         * mediante un setter cuyo argumento de el metodo set  dsera la variable "v_contraseña" 
         */
          //  dp.setV_contrasena(v_contrasena); 
            /* para mejor entendimiento de este proceso  se reccomienda dirigirse ala clase daviplata  
             * y enfocarse donde los comentario empiecen pacon la letra (I)
             */ 
            /*continuando.. */
            /* creamos un condicional  donde invocaremos el metodo de inicio ( mencionado en el flujo 
            de las recomendaciones anteriores ) si se hizo  caso omiso a la recomendaciones entraremos en contexto de el 
            metodo dp.inicio()   este metodo consiste en comparar la informacion ingresada en las vistas 
            con la informacion de los atributos privados de la clase  este metodo tiene un retorno de tipo 
            boolean   donde con un condicional que compara los valores de las variables con los atrubutos  mediante el condiconal 
            si la condicion se cumple donde todos coinciden el metodo retornara un true
            si las condicones no se cumplen retornara un false 
            */
            /*continuando con el flujo creamos un condicional   donde la condicion sera que si el el metodo inicio ( anterior mente descrito)
             * es igual a true con el metodo de reqDispacher se rediriga a la vista "inicio dp " donde estara el menu 
             * lo cual seria el flujo normal de el sistema 
             */
            req.getRequestDispatcher("views/inicio_dp.jsp").forward(req, resp);
          break;
/* 
            if(dp.inicio()==true){req.getRequestDispatcher("inicio_dp.jsp").forward(req, resp);}  
            /* si no el metodo rq,RequestDispatcher redirigira a  la misma vista*/
           //else{req.getRequestDispatcher("login.jsp").forward(req, resp);} 
            /* finalizacion de el caso break  */
           // break;*/
          case"registrar": 
          req.getRequestDispatcher("views/formulario_add.jsp").forward(req, resp);
         System.out.println("registrar");
           break;   

            case"enviar_c_r": 
            System.out.println("controlador retiro");
            dp.setValor_retiro (Integer.parseInt(req.getParameter("cantidad_r"))); 
            System.out.println("valor_retiro do postt"+dp.getValor_retiro());
             retirar(req, resp);
          break;


            case"enviar": 
            System.out.println("controlador recarga");
            dp.setValor_recarga (Integer.parseInt(req.getParameter("valor_recarga"))); 
            System.out.println("valor_recarga do postt"+dp.getValor_recarga());
             recarga(req, resp);
          break;
          
          
          
          case "confirmar":
            System.out.println("actualizar post ");
            confirmar(req, resp);
            break;
    }
} 
 



    private void cuentas(HttpServletRequest req, HttpServletResponse resp) {
      try {
          List cuentas= rd.listarC();
          req.setAttribute("cuentas",cuentas);
          req.getRequestDispatcher("views/daviplata_lis.jsp").forward(req, resp); 
          System.out.println(cuentas);
          System.out.println("Datos listados correctamente");
      } 
       catch (Exception e) {
          System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
      }    
    }


    private void confirmar(HttpServletRequest req, HttpServletResponse resp) { 
      System.out.println("confirmar bolsillo");
      if(req.getParameter("IdCuenta")!=null){ 
          dp.setIdCuenta(Integer.parseInt(req.getParameter("IdCuenta")));
      }
      if(req.getParameter("IdUsuario")!=null){ 
          dp.setIdUsuario( Integer.parseInt(req.getParameter("IdUsuario")));
      }
      if(req.getParameter("Saldo")!=null){
          dp.setSaldo( Integer.parseInt(req.getParameter("Saldo")));
      }
      if(req.getParameter("chkestado")!=null){
          dp.setEstadoActivo(true);
      }
      else{
          dp.setEstadoActivo(false);
      }
      try { 
          System.out.println("id controlador "+dp.getIdUsuario());
          rd.actualizar(dp);
          System.out.println("actualizacion  insertado correctamente");   
          req.getRequestDispatcher("views/daviplata_lis.jsp").forward(req, resp); 
      } catch (Exception e) {
          System.out.println("Error en la inserción del registro "+e.getMessage().toString());
      }
  
    } 

 
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
      try {
          List cuentas =rd.listarC();
          req.setAttribute("cuentas",cuentas);
          req.getRequestDispatcher("views/daviplata_edit.jsp").forward(req, resp); 
          System.out.println("Datos listados correctamente");
      } catch (Exception e) {
          System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
      }

  }


/* private void consultar_saldo (HttpServletRequest req, HttpServletResponse resp){
try{   

     System.out.println("consultar saldo controlador"+ dp.getSaldo());


} catch(Exception e){
 System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    
}  
} */

  private void recarga(HttpServletRequest req, HttpServletResponse resp) {
    try {
        dp.setSaldo(rd.consultar_saldo_p());
         int  saldo_p; 
         req.getSession().setAttribute(getServletName(), resp);
         saldo_p =dp.getSaldo()+dp.getValor_recarga(); 
         dp.setSaldo(saldo_p);
         rd.modificarsaldo(dp);
         System.out.println(" operaccion recarga"+saldo_p);
         System.out.println("saldo recarga "+dp.getSaldo());
         req.getRequestDispatcher("views/consultar_saldo.jsp").forward(req, resp);
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());}
    }


    private void retirar(HttpServletRequest req, HttpServletResponse resp) {
    try {
        dp.setSaldo(rd.consultar_saldo_p());
         int  saldo_p; 
         saldo_p= dp.getSaldo()-dp.getValor_retiro(); 
         dp.setSaldo(saldo_p);
         rd.modificarsaldo(dp);
         System.out.println(" operaccion retiro"+saldo_p);
         System.out.println("saldo despues de terito  "+dp.getSaldo());
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    }




}

 
}





