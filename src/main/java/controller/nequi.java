package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.daviplataDao;
import model.daviplataVo;
import model.nequiDao;
import model.nequiVo;

public class nequi extends HttpServlet{
nequiVo  nq=new nequiVo();
 nequiDao rdnq =new  nequiDao();

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    String accion=req.getParameter("accion");
    System.out.println(accion);
    switch(accion ){
    case"listar":
    cuentas(req, resp);
    break ; 
    case"nequi":
    req.getRequestDispatcher("views/nequi_login.jsp").forward(req, resp);
    break ; 
    case "recargar":
        req.getRequestDispatcher("views/recarga_nq.jsp").forward(req, resp);
        break;  
        case "consultar_saldo":
        req.getRequestDispatcher("views/consultar_saldo_nq.jsp").forward(req, resp);
        break; 
        case "retirar":
        req.getRequestDispatcher("views/sacar_dinero_nq.jsp").forward(req, resp);
        break;  
        case"inicio_nq":
        req.getRequestDispatcher("views/inicio_nequi.jsp").forward(req, resp);
         break;
        case"index":
        req.getRequestDispatcher("index.jsp").forward(req, resp);
         break;
        case"modificar": 
        System.out.println("modificar");
        actualizar(req, resp); 
        break;
         }
    }
    


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
    System.out.println(accion);
   switch( accion){
   case"enviar": 
     System.out.println("controlador recarga");
     nq.setValor_recarga (Integer.parseInt(req.getParameter("valor_recarga"))); 
     System.out.println("valor_recarga do postt"+nq.getValor_recarga());
            recarga(req, resp);
          break;
    case"enviar_c_r": 
    System.out.println("controlador retiro");
    nq.setValor_retiro (Integer.parseInt(req.getParameter("cantidad_r"))); 
     System.out.println("valor_retiro do postt"+nq.getValor_retiro());
    retirar(req, resp);
          break;

     
          case "confirmar":
            System.out.println("actualizar post ");
            confirmar(req, resp);
            break;


   }
    } 



    private void cuentas(HttpServletRequest req, HttpServletResponse resp) {
      try {
          List cuentas= rdnq.listarC();
          req.setAttribute("cuentas",cuentas);
          req.getRequestDispatcher("views/nequi_list.jsp").forward(req, resp); 
          System.out.println(cuentas);
          System.out.println("Datos listados correctamente");
      } 
       catch (Exception e) {
          System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
      }    
    }

  private void recarga(HttpServletRequest req, HttpServletResponse resp) {
    try {
        nq.setSaldo(rdnq.consultar_saldo_p());
         int  saldo_p; 
         req.getSession().setAttribute(getServletName(), resp);
         saldo_p =nq.getSaldo()+nq.getValor_recarga(); 
         nq.setSaldo(saldo_p);
         rdnq.modificarsaldo(nq);
         req.getRequestDispatcher("views/consultar_saldo_nq.jsp").forward(req, resp);
         System.out.println(" operaccion recarga"+saldo_p);
         System.out.println("saldo recarga "+nq.getSaldo());
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());}
    }


       private void retirar(HttpServletRequest req, HttpServletResponse resp) {
    try {
        nq.setSaldo(rdnq.consultar_saldo_p());
         int  saldo_p; 
         saldo_p= nq.getSaldo()-nq.getValor_retiro(); 
         nq.setSaldo(saldo_p);
         rdnq.modificarsaldo(nq);
         System.out.println(" operaccion retiro"+saldo_p);
         System.out.println("saldo despues de terito  "+nq.getSaldo());
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    }
       }

 private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
      try {
          List cuentas =rdnq.listarC();
          req.setAttribute("cuentas",cuentas);
          req.getRequestDispatcher("views/nequi_edit.jsp").forward(req, resp); 
          System.out.println("Datos listados correctamente");
      } catch (Exception e) {
          System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
      }}


  private void confirmar(HttpServletRequest req, HttpServletResponse resp) { 
      System.out.println("confirmar bolsillo");
      if(req.getParameter("IdCuenta")!=null){ 
          nq.setIdCuenta(Integer.parseInt(req.getParameter("IdCuenta")));
      }
      if(req.getParameter("IdUsuario")!=null){ 
          nq.setIdUsuario( Integer.parseInt(req.getParameter("IdUsuario")));
      }
      if(req.getParameter("Saldo")!=null){
          nq.setSaldo( Integer.parseInt(req.getParameter("Saldo")));
      }
      if(req.getParameter("chkestado")!=null){
          nq.setEstadoActivo(true);
      }
      else{
          nq.setEstadoActivo(false);
      }
      try { 
          System.out.println("id controlador "+nq.getIdUsuario());
          rdnq.actualizar(nq);
          System.out.println("actualizacion  insertado correctamente");   
          req.getRequestDispatcher("views/nequi_lis.jsp").forward(req, resp); 
      } catch (Exception e) {
          System.out.println("Error en la inserción del registro "+e.getMessage().toString());
      }
  
    } 

}
    

