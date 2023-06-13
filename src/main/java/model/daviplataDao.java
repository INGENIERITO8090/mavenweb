package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class daviplataDao { 
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

/*   public int recargar (daviplataVo dVo) throws SQLException{
 
        sql="INSERT INTO rol(descripcionRol,estadoRol) values(?,?)";
        /*try{
         /*  con=conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, d.getDescripcionRol());
            ps.setBoolean(2, rol.getEstadoRol());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el rol correctamente");

        }
        catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            
            con.close();//cerrando conexión
        }
        return r;
*/
      





public int registrar(daviplataVo dp) throws SQLException{
    sql="INSERT INTO daviplata(IdUsuario,Saldo,EstadoActivo) values(?,?,?)";
    try{
        con=conexion.conectar(); //abrir conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setInt(1, dp.getIdUsuario());
        ps.setInt(2, dp.getSaldo());
        ps.setBoolean(3,dp.getEstadoActivo());
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



    

    public List<daviplataVo> listarC() throws SQLException{ 
        List<daviplataVo> cuentas = new ArrayList<>();
        sql="select * from daviplata "; 
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
            daviplataVo  dp=new daviplataVo();
                //Escribir  en el setter cada valor encontrado
                dp.setIdCuenta(rs.getInt("IdCuenta"));
                dp.setIdUsuario(rs.getInt("IdUsuario"));
                dp.setSaldo(rs.getInt("saldo"));
                dp.setEstadoActivo(rs.getBoolean("EstadoActivo"));
                cuentas.add(dp);
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
    public int actualizar(daviplataVo dp) throws SQLException{
        //  sql="update usuario  set N_documento='"+usuario.getN_documento()+"', NombreUsuario='"+usuario.getNombreUsuario()+"',ConstrasenaUsuario='"+usuario.getConstrasenaUsuario()+"', NumeroCelularUsuario='"+usuario.getNumeroCelularUsuario()+"' where  IdUsuario='"+usuario.getIdUsuario()+"';";
       sql="update daviplata  set  IdUsuario="+dp.getIdUsuario()+",Saldo="+dp.getSaldo()+", EstadoActivo="+dp.getEstadoActivo()+" where  IdUCuenta="+dp.getIdCuenta()+";";
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

     public List<daviplataVo> consultar_saldo() throws SQLException{ 
        List<daviplataVo> saldos = new ArrayList<>();
        sql="select  saldo "; 
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
            daviplataVo  dp=new daviplataVo();
               //Escribir  en el setter cada valor encontrado
            dp.setSaldo(rs.getInt("Saldo")); 
            saldos.add(dp);
            System.out.println("saldo dao "+dp.getSaldo());
            }
            ps.close();
            System.out.println("consulta exitosa");
         
        } catch (Exception e) {
            System.out.println(" la consulta del saldo  no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return saldos;
    } 


    public int  consultar_saldo_p() throws SQLException{ 
        daviplataVo  dp = new daviplataVo();                 
        sql="select  saldo  from daviplata  where idCuenta=1";  
        
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
         //Escribir  en el setter cada valor encontrado
            dp.setSaldo(rs.getInt("Saldo")); 
            System.out.println("saldo dao "+dp.getSaldo());
            }
            ps.close();
            System.out.println("consulta exitosa");
         
        } catch (Exception e) {
            System.out.println(" la consulta del saldo  no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        int variable=dp.getSaldo();
        return  variable;
    } 




     public int modificarsaldo(daviplataVo dp ) throws SQLException{   
        sql="update daviplata set saldo=(?) where idCuenta=1;"; 
        try {  
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dp.getSaldo());
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia 
        } catch (Exception e) {
            System.out.println("saldo cuenta1 "+dp.getSaldo());
            System.out.println("La modificacion del saldo  no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return r;
     }



    
}
