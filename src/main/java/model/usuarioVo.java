package model;

public class usuarioVo{

    private int  IdUsuario    ; 
    
    private  int  N_documento    ;
    
    private   String NombreUsuario; 
    
    private  String ConstrasenaUsuario; 
 
    private  int  NumeroCelularUsuario ;

  private boolean EstadoUsuario;


     // metodos constructores 

  // vacio 
    public usuarioVo() {
    }  
     // con parametros 
    public usuarioVo(int idUsuario, int n_documento, String nombreUsuario, String constrasenaUsuario,
            int numeroCelularUsuario) {
        IdUsuario = idUsuario;
        N_documento = n_documento;
        NombreUsuario = nombreUsuario;
        ConstrasenaUsuario = constrasenaUsuario;
        NumeroCelularUsuario = numeroCelularUsuario;




    } 
// getters and setters 
    public usuarioVo(int idUsuario, int n_documento, String nombreUsuario, String constrasenaUsuario,
            int numeroCelularUsuario, boolean estadoUsuario) {
        IdUsuario = idUsuario;
        N_documento = n_documento;
        NombreUsuario = nombreUsuario;
        ConstrasenaUsuario = constrasenaUsuario;
        NumeroCelularUsuario = numeroCelularUsuario;
        EstadoUsuario = estadoUsuario;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }
    public int getN_documento() {
        return N_documento;
    }
    public void setN_documento(int n_documento) {
        N_documento = n_documento;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
    public String getConstrasenaUsuario() {
        return ConstrasenaUsuario;
    }
    public void setConstrasenaUsuario(String constrasenaUsuario) {
        ConstrasenaUsuario = constrasenaUsuario;
    }
    public int getNumeroCelularUsuario() {
        return NumeroCelularUsuario;
    }
    public void setNumeroCelularUsuario(int numeroCelularUsuario) {
        NumeroCelularUsuario = numeroCelularUsuario;
    }
    public boolean getEstadoUsuario() {
        return EstadoUsuario;
    }
    public void setEstadoUsuario(boolean estadoUsuario) {
        EstadoUsuario = estadoUsuario;
    }



}
