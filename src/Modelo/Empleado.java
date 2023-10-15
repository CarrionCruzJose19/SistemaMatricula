package Modelo;
import java.text.DecimalFormat;
import java.util.Date;

public class Empleado {
    private String codigoepa;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Date FechaIngreso;
    private String cargo;
    private double sueldo;
    private static int contador=0;
    
    public Empleado(String codigoepa, String nombres, String apellidos, String telefono
                    , Date fechaingreso, String cargo, double sueldo){
        if (this.codigoepa == null || codigoepa.isEmpty()) {
                DecimalFormat df = new DecimalFormat("ES0000");
                this.codigoepa = df.format(contador);
                contador++;
        } else {
                this.codigoepa = codigoepa;
        }
        
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.FechaIngreso=fechaingreso;
        this.cargo=cargo;
        this.sueldo=sueldo;
    }

    public String getCodigoepa() {return codigoepa;}
    public void setCodigoepa(String codigoepa) {this.codigoepa = codigoepa;}
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public Date getFechaIngreso() {return FechaIngreso;}
    public void setFechaIngreso(Date FechaIngreso) {this.FechaIngreso = FechaIngreso;}
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public double getSueldo() {return sueldo;}
    public void setSueldo(double sueldo) {this.sueldo = sueldo;}
    
    
    
    
    
    
}
