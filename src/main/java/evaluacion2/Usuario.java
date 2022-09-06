package evaluacion2;

import java.sql.Date;

public class Usuario {
    private int rut;
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private long telefono;
    private Date fechaingreso;
   
    public int getRut() {
        return rut;
    }
    public void setRut(int rut) {
        this.rut = rut;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
  
        this.password = password;
    }
    
 //Persona 

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
  
        this.apellido = apellido;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
  
        this.telefono = telefono;
    }
    
    public Date getFechaingreso() {
        return fechaingreso;
    }
    public void setFechaingreso(Date fechaingreso) {
  
        this.fechaingreso = fechaingreso;
    }
}
