package model;

public class nequiVo  {
private int IdCuenta; 
private int IdUsuario;
private int Saldo;  
private int valor_recarga;
private int valor_retiro;
private Boolean EstadoActivo;
public Object setIdCuenta;










public nequiVo() {
}





public nequiVo(int idCuenta, int idUsuario, int saldo, int valor_recarga, int valor_retiro, Boolean estadoActivo,
        Object setIdCuenta) {
    IdCuenta = idCuenta;
    IdUsuario = idUsuario;
    Saldo = saldo;
    this.valor_recarga = valor_recarga;
    this.valor_retiro = valor_retiro;
    EstadoActivo = estadoActivo;
    this.setIdCuenta = setIdCuenta;
}





//getters and setters 
public int getIdCuenta() {
    return IdCuenta;
}
public void setIdCuenta(int idCuenta) {
    IdCuenta = idCuenta;
}
public int getIdUsuario() {
    return IdUsuario;
}
public void setIdUsuario(int idUsuario) {
    IdUsuario = idUsuario;
}
public int getSaldo() {
    return Saldo;
}
public void setSaldo(int saldo) {
    Saldo = saldo;
}
public int getValor_recarga() {
    return valor_recarga;
}
public void setValor_recarga(int valor_recarga) {
    this.valor_recarga = valor_recarga;
}
public int getValor_retiro() {
    return valor_retiro;
}
public void setValor_retiro(int valor_retiro) {
    this.valor_retiro = valor_retiro;
}
public Boolean getEstadoActivo() {
    return EstadoActivo;
}
public void setEstadoActivo(Boolean estadoActivo) {
    EstadoActivo = estadoActivo;
}
public Object getSetIdCuenta() {
    return setIdCuenta;
}
public void setSetIdCuenta(Object setIdCuenta) {
    this.setIdCuenta = setIdCuenta;
} 
// gettters and setters 

}
