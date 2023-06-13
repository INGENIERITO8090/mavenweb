package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class nequiDao { 
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; 



public int registrar(nequiVo nq) throws SQLException{
    sql="INSERT INTO nequi(IdUsuario,Saldo,EstadoActivo) values(?,?,?)";
    try{
        con=conexion.conectar(); //abrir conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setInt(1, nq.getIdUsuario());
        ps.setInt(2, nq.getSaldo());
        ps.setBoolean(3,nq.getEstadoActivo());
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Se registró el rol correctamente");
    }catch(Exception e){
        System.out.println("Error en el regisro "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r ;
}

 public List<nequiVo> listarC() throws SQLException{ 
        List<nequiVo> cuentas = new ArrayList<>();
        sql="select * from nequi "; 
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
            nequiVo  nq=new nequiVo();
                //Escribir  en el setter cada valor encontrado
                nq.setIdCuenta(rs.getInt("IdCuenta"));
                nq.setIdUsuario(rs.getInt("IdUsuario"));
                nq.setSaldo(rs.getInt("saldo"));
                nq.setEstadoActivo(rs.getBoolean("EstadoActivo"));
                cuentas.add(nq);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return cuentas;
    } 

    public int actualizar(nequiVo nq) throws SQLException{
        //  sql="update usuario  set N_documento='"+usuario.getN_documento()+"', NombreUsuario='"+usuario.getNombreUsuario()+"',ConstrasenaUsuario='"+usuario.getConstrasenaUsuario()+"', NumeroCelularUsuario='"+usuario.getNumeroCelularUsuario()+"' where  IdUsuario='"+usuario.getIdUsuario()+"';";
       sql="update nequi   set  IdUsuario="+nq.getIdUsuario()+",Saldo="+nq.getSaldo()+", EstadoActivo="+nq.getEstadoActivo()+" where  IdUCuenta="+nq.getIdCuenta()+";";
         try{
           con=conexion.conectar(); //abrir conexión
             ps=con.prepareStatement(sql); //preparar sentencia
             System.out.println(ps);
             ps.executeUpdate(); //Ejecutar sentencia
             ps.close(); //cerrar sentencia 
         }catch(Exception e){ 
 
         }
         finally{
             con.close();//cerrando conexión
         }
         return r;
     }


      public int  consultar_saldo_p() throws SQLException{ 
        nequiVo  nq = new nequiVo();                 
        sql="select  saldo  from nequi  where idCuenta=1";  
        
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
         //Escribir  en el setter cada valor encontrado
            nq.setSaldo(rs.getInt("Saldo")); 
            System.out.println("saldo dao "+nq.getSaldo());
            }
            ps.close();
            System.out.println("consulta exitosa");
         
        } catch (Exception e) {
            System.out.println(" la consulta del saldo  no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        int variable=nq.getSaldo();
        return  variable;
    } 
    public int modificarsaldo(nequiVo nq ) throws SQLException{   
        sql="update nequi set saldo=(?) where idCuenta=1;"; 
        try {  
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, nq.getSaldo());
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia 
        } catch (Exception e) {
            System.out.println("saldo cuenta1 "+nq.getSaldo());
            System.out.println("La modificacion del saldo  no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return r;
     }
























}