package Modelo;

public class Apoderado {
    private String nombre;
    private String apellidos;
    private String celular;
    private String dni;
    
    public Apoderado(String nombre, String apellidos, String celular, String dni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.celular=celular;
        this.dni=dni;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    
    
}
