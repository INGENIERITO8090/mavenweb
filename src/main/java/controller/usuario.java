package controller;

import java.io.IOException;
import java.lang.reflect.Array;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;


import model.usuarioDao;
import model.usuarioVo;
import model.daviplataDao;
import model.daviplataVo;
import model.nequiDao;
import model.nequiVo;
import controller.daviplata;

 public class usuario  extends HttpServlet{

    nequiDao nqdao = new nequiDao();
    nequiVo nq = new nequiVo();
    daviplata cdp = new daviplata();
    daviplataDao dpdao = new daviplataDao();
    daviplataVo dp = new daviplataVo();
    usuarioVo r=new usuarioVo();
    usuarioDao rd=new usuarioDao();
    int A ; 


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 

        System.out.println("Entró al Doget");
        String a=req.getParameter("accion");
         switch (a){
        case"listar":
        listar(req, resp);
        break;
         
        case"formulario":
        System.out.println("formulario");
        req.getRequestDispatcher("views/usuarioadd.jsp").forward(req, resp) ;
        break; 


        case"modificar": 
        System.out.println(req.getParameter("idusu"));
        System.out.println("modificar");
        actualizar(req, resp); 

        case"formulariocuenta": 
        req.getRequestDispatcher("views/formulariocuenta.jsp").forward(req, resp);
        break;
        case"c_nequi": 
         req.getRequestDispatcher("views/nequi_add.jsp").forward(req, resp);
        break;
        
          case"c_daviplata": 
         req.getRequestDispatcher("views/daviplata_add.jsp").forward(req, resp);

        break;
         }
      
         }

    

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        System.out.println("Entró al DoPost");
        String a=req.getParameter("accion");

        switch ( a) {
           case"registrar": 
          System.out.println("registrar");
            add(req, resp);
            listar(req, resp);
        break;
      case"inicio":
       System.out.println("Inicio  post "); 
       iniciosesion(req, resp);
       break;
       case"inicio_nq":
       System.out.println("Inicio  post "); 
       iniciosesion_nq(req, resp);
       break;


       
       
       case"registrar_c":
       System.out.println("registrar  post"); 
       add_cuenta(req, resp);
       break;
       case"registrar_c_nq":
       System.out.println("registrar  nequi"); 
       add_cuenta_nq(req, resp);
       break;


       case "confirmar":
       System.out.println("actualizar post ");
       confirmar(req, resp);
       
       break;
       case"modificar":
       System.out.println(req.getParameter("idusu"));
       break;

    


    }
}  
   private void add_cuenta(HttpServletRequest req, HttpServletResponse resp) { 
   

      System.out.println("registrando");
    
      if(req.getParameter("IdUsuario")!=null){
          dp.setIdUsuario( Integer.parseInt(req.getParameter("IdUsuario")));
      }
      if(req.getParameter("Saldo")!=null){
          dp.setSaldo(Integer.parseInt( req.getParameter("Saldo")));
      }
      if(req.getParameter("chkestado")!=null){
        dp.setEstadoActivo(true);
    }
    else{
        dp.setEstadoActivo(false);
    }
      try {
         dpdao.registrar(dp);
          System.out.println("Registro insertado correctamente");
          
      } catch (Exception e) {
          System.out.println("Error en la inserción del registro "+e.getMessage().toString());
      }
    } 

 private void add_cuenta_nq(HttpServletRequest req, HttpServletResponse resp) { 
   

      System.out.println("registrando");
    
      if(req.getParameter("IdUsuario")!=null){
          nq.setIdUsuario( Integer.parseInt(req.getParameter("IdUsuario")));
      }
      if(req.getParameter("Saldo")!=null){
          nq.setSaldo(Integer.parseInt( req.getParameter("Saldo")));
      }
      if(req.getParameter("chkestado")!=null){
        nq.setEstadoActivo(true);
    }
    else{
        nq.setEstadoActivo(false);
    }
      try {
         nqdao.registrar(nq);
          System.out.println("Registro insertado  nequi  correctamente");
          
      } catch (Exception e) {
          System.out.println("Error en la inserción del registro "+e.getMessage().toString());
      }
    } 













 private void iniciosesion(HttpServletRequest req, HttpServletResponse resp) { 
        if(req.getParameter("NombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("NombreUsuario"));
        }
        if(req.getParameter("N_documento")!=null){
            r.setN_documento( Integer.parseInt(req.getParameter("N_documento")));
        }
        if(req.getParameter("ConstrasenaUsuario")!=null){
            r.setConstrasenaUsuario(req.getParameter("ConstrasenaUsuario"));
        }
        try { 
            System.out.println(r.getNombreUsuario());
            System.out.println("consulta  insertada correctamente");
            A=rd.inicarsesion(r);
            System.out.println("retorno a"+A);
            if(A==1){
               req.getRequestDispatcher("views/inicio_dp.jsp").forward(req, resp);;
            }
            else{ 
                req.getRequestDispatcher("views/login.jsp").forward(req, resp);;
             }

           // validar(req, resp); 
        } catch (Exception e) {
            System.out.println("Error en la consulta de inicio de secion  del registro "+e.getMessage().toString());
        }
      
    }
     private void iniciosesion_nq(HttpServletRequest req, HttpServletResponse resp) { 
        if(req.getParameter("NombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("NombreUsuario"));
        }
        if(req.getParameter("N_documento")!=null){
            r.setN_documento( Integer.parseInt(req.getParameter("N_documento")));
        }
        if(req.getParameter("ConstrasenaUsuario")!=null){
            r.setConstrasenaUsuario(req.getParameter("ConstrasenaUsuario"));
        }
        try { 
            System.out.println(r.getNombreUsuario());
            System.out.println("consulta  insertada correctamente");
            A=rd.inicarsesion(r);
            System.out.println("retorno a"+A);
            if(A==1){
               req.getRequestDispatcher("views/inicio_nequi.jsp").forward(req, resp);;
            }
            else{ 
                req.getRequestDispatcher("views/nequi_login.jsp").forward(req, resp);;
             }

           // validar(req, resp); 
        } catch (Exception e) {
            System.out.println("Error en la consulta de inicio de secion  del registro "+e.getMessage().toString());
        }
      
    }


    


private void add(HttpServletRequest req, HttpServletResponse resp) { 
        
        System.out.println("registrando");
        if(req.getParameter("N_documento")!=null){
            r.setN_documento( Integer.parseInt(req.getParameter("N_documento")));
        }
        if(req.getParameter("NombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("NombreUsuario"));
        }
        if(req.getParameter("ContrasenaUsuario")!=null){
            r.setConstrasenaUsuario(req.getParameter("ContrasenaUsuario"));
        }
        if(req.getParameter("NumeroCelularUsuario")!=null){
              r.setNumeroCelularUsuario( Integer.parseInt(req.getParameter("NumeroCelularUsuario")));
        } 
        if(req.getParameter("chkestado")!=null){
            r.setEstadoUsuario(true);
        }
        else{
            r.setEstadoUsuario(false);
        }
        try {
            rd.registrar(r);
            System.out.println("Registro insertado correctamente"); 
             listar(req, resp);
         
            
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    
      }

 
      private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        try { 
            int idusu=Integer.parseInt(req.getParameter("idusu"));
            r.setIdUsuario(idusu);
            List usuarioedit = rd.consltarusu(r); 
            req.setAttribute("usus",usuarioedit);
            req.getRequestDispatcher("views/usuario_edit.jsp").forward(req, resp); 
            System.out.println(usuarioedit);
            System.out.println("Datos listados correctamente");
            /*      
             usuarioVo usu = (usuarioVo)rd.consultausu(r);
             System.out.println("usu"+usu.getIdUsuario());
             HttpSession miseSession= req.getSession();
             miseSession.setAttribute("usueditar",usu);
             req.setAttribute("usueditar",usu);
             System.out.println("misesion"+miseSession); 
             System.out.println(usu);
             System.out.println("el id del usuario a editar"+idusu);
            System.out.println("Datos listados correctamente"); */

        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    
    private void confirmar(HttpServletRequest req, HttpServletResponse resp) { 
        System.out.println("confirmar bolsillo");
        if(req.getParameter("IdUsuario")!=null){ 
            r.setIdUsuario(Integer.parseInt(req.getParameter("IdUsuario")));
        }
        if(req.getParameter("N_documento")!=null){ 
            r.setN_documento( Integer.parseInt(req.getParameter("N_documento")));
        }
        if(req.getParameter("NombreUsuario")!=null){
            r.setNombreUsuario(req.getParameter("NombreUsuario"));
        }
        if(req.getParameter("ContrasenaUsuario")!=null){
            r.setConstrasenaUsuario(req.getParameter("ContrasenaUsuario"));
        }
        if(req.getParameter("NumeroCelularUsuario")!=null){
            r.setNumeroCelularUsuario( Integer.parseInt(req.getParameter("NumeroCelularUsuario")));
        } 

        if(req.getParameter("chkEstado")!=null){
            r.setEstadoUsuario(true);
           }
        else{
            r.setEstadoUsuario(false);
           }
        try { 
            System.out.println("id controlador "+r.getIdUsuario());
            rd.actualizar(r);
            System.out.println("actualizacion  insertado correctamente");
           listar(req, resp);
            
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    
      }

   


    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List usuario = rd.listar(); 
            req.setAttribute("usuarios",usuario);
            req.getRequestDispatcher("views/usuario.jsp").forward(req, resp); 
            System.out.println(usuario);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }
 }

  
    
 
 