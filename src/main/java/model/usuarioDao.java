package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

import controller.usuario;

public class usuarioDao {
    
    /* Atributos para realizar operaciones sobre la BD */

    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String  sql=null;
    int r; 
    //cantidad de filas que devuelve una sentencia 
/* El eliminar es cambiar el esatdo de activo Crear un proceso para que solo aprezcan el consultas los estados activos */

  public int  inicarsesion(usuarioVo r) throws SQLException{
        sql="select * from usuario where NombreUsuario='"+r.getNombreUsuario()+"'and N_documento="+r.getN_documento()+" and ConstrasenaUsuario='"+r.getConstrasenaUsuario()+"';";   
        System.out.println("antes de el metodo"+r.getNombreUsuario());
        System.out.println("antes de el metodo"+r.getN_documento());
        System.out.println("antes de el metodo"+r.getConstrasenaUsuario());
         int A=0;
        try { 
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            System.out.println("Sentencia sql"+sql);
            while(rs.next()){ 
                 A=A+1;
                    r.setIdUsuario(rs.getInt("IdUsuario")); 

                    r.setN_documento(rs.getInt("N_documento"));
                
                    r.setNombreUsuario(rs.getString("NombreUsuario"));
                
                    r.setConstrasenaUsuario(rs.getString("ConstrasenaUsuario")); 
                 
                    r.setNumeroCelularUsuario(rs.getInt("NumeroCelularUsuario")); 
           
                    r.setEstadoUsuario(rs.getBoolean("EstadoUsuario")); 
                    
                    System.out.println("USU"+r.getIdUsuario()); 
                    
               if(A==1){
                  
                 return 1;
               } 
               else{
                return 0 ; 
               }
            }             
            ps.close(); 
            System.out.println("consulta exitosa");
          
        }
         catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado"+e.getMessage().toString()); 
           
        }  
        finally{
            con.close();
        }
         return 0 ; 
    } 


    public int registrar(usuarioVo usuario) throws SQLException{
        sql="INSERT INTO usuario(N_documento,Nombreusuario,ConstrasenaUsuario,NumeroCelularUsuario,EstadoUsuario) values(?,?,?,?,?)";
        try{
            con=conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setInt(1, usuario.getN_documento());
            ps.setString(2, usuario.getNombreUsuario());
            ps.setString(3, usuario.getConstrasenaUsuario());
            ps.setInt(4, usuario.getNumeroCelularUsuario());
            ps.setBoolean(5, usuario.getEstadoUsuario());;
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
        return r;
    }

    public List<usuarioVo> listar() throws SQLException{
        sql="SELECT *from usuario";
        List<usuarioVo> usuario=new ArrayList<>();
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                 usuarioVo r =new usuarioVo();  
 
                    r.setIdUsuario(rs.getInt("IdUsuario")); 
                    
                    r.setN_documento(rs.getInt("N_documento"));
                
                    r.setNombreUsuario(rs.getString("NombreUsuario"));
                
                    r.setConstrasenaUsuario(rs.getString("ConstrasenaUsuario")); 
                 
                    r.setNumeroCelularUsuario(rs.getInt("NumeroCelularUsuario")); 
           
                    r.setEstadoUsuario(rs.getBoolean("EstadoUsuario")); 
                    usuario.add(r);
            
            } 

            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return usuario;
    }   

 
public int actualizar(usuarioVo usuario) throws SQLException{
       //  sql="update usuario  set N_documento='"+usuario.getN_documento()+"', NombreUsuario='"+usuario.getNombreUsuario()+"',ConstrasenaUsuario='"+usuario.getConstrasenaUsuario()+"', NumeroCelularUsuario='"+usuario.getNumeroCelularUsuario()+"' where  IdUsuario='"+usuario.getIdUsuario()+"';";
      sql="update usuario  set N_documento="+usuario.getN_documento()+", NombreUsuario='"+usuario.getNombreUsuario()+"',ConstrasenaUsuario='"+usuario.getConstrasenaUsuario()+"', NumeroCelularUsuario="+usuario.getNumeroCelularUsuario()+",EstadoUsuario="+usuario.getEstadoUsuario()+" where  IdUsuario="+usuario.getIdUsuario()+";";
        try{
          con=conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
        
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia 
        }catch(Exception e){ 

        }
        finally{
            con.close();
        }
        return r;
    }
   /*  private int traerusuario( int idusu){

    sql="select * from usuario where idusuario="+idusu+";";
    try { 
        con=conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
    
    } catch (Exception e) {
        // TODO: handle exception
    } */

  

public Object consultausu(usuarioVo  r) throws SQLException{
        sql="SELECT *from usuario where idusuario="+r.getIdUsuario()+";";
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql); 
            while(rs.next()){
                    r.setIdUsuario(rs.getInt("IdUsuario")); 
                    
                    r.setN_documento(rs.getInt("N_documento"));
                
                    r.setNombreUsuario(rs.getString("NombreUsuario"));
                
                    r.setConstrasenaUsuario(rs.getString("ConstrasenaUsuario")); 
                 
                    r.setNumeroCelularUsuario(rs.getInt("NumeroCelularUsuario")); 
           
                    r.setEstadoUsuario(rs.getBoolean("EstadoUsuario")); 
            } 
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return r;
    }   

  public List<usuarioVo> consltarusu(usuarioVo r ) throws SQLException{
        sql="SELECT *from usuario where idUsuario="+r.getIdUsuario()+";";
        System.out.println(sql);
        List<usuarioVo> usuedit =new ArrayList<>();
        try {
            con=conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){

                    r.setIdUsuario(rs.getInt("IdUsuario")); 
                    
                    r.setN_documento(rs.getInt("N_documento"));
                
                    r.setNombreUsuario(rs.getString("NombreUsuario"));
                
                    r.setConstrasenaUsuario(rs.getString("ConstrasenaUsuario")); 
                 
                    r.setNumeroCelularUsuario(rs.getInt("NumeroCelularUsuario")); 
           
                    r.setEstadoUsuario(rs.getBoolean("EstadoUsuario")); 
                    usuedit.add(r);
            
            } 
 
            ps.close();
            System.out.println("consulta exitosa");
            System.out.println("prueba modelo"+r.getNombreUsuario());
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return usuedit;
    }   


    }


