package evaluacion2;

import java.sql.Date;

public class Persona {
    private int rut;
    private String nombre;
    private String apellido;
    private int telefono;
    private Date fechaingreso;
   
    public int getRut() {
        return rut;
    }
    public void setRut(int rut) {
        this.rut = rut;
    }
    public String getUsername() {
        return nombre;
    }
    public void setUsername(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
  
        this.apellido = apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
  
        this.telefono = telefono;
    }
    
    public Date getFechaingreso() {
        return fechaingreso;
    }
    public void setFechaingreso(Date fechaingreso) {
  
        this.fechaingreso = fechaingreso;
    }
}



