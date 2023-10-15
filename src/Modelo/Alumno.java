package Modelo;
import java.text.DecimalFormat;
import java.util.Date;
import java.time.LocalDate;

public class Alumno {
    private String codigo;
    private String nombre;
    private String Apellidos;
    private String dni;
    private LocalDate Fechanac;
    private String numero;
    private static int contador=0;
    
    public Alumno(String codigo, String nombre, String apellido, String dni, LocalDate Fechanac, String numero){
        if (codigo == null || codigo.isEmpty()) {
            DecimalFormat df = new DecimalFormat("ES0000");
            this.codigo = df.format(contador);
            contador++;
        } else {
            this.codigo = codigo;
        }
        this.nombre=nombre;
        this.Apellidos=apellido;
        this.dni=dni;
        this.Fechanac=Fechanac;
        this.numero=numero;
    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return Apellidos;}
    public void setApellido(String apellido) {this.Apellidos = apellido;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public LocalDate getFechanac() {return Fechanac;}
    public void setFechanac(LocalDate Fechanac) {this.Fechanac = Fechanac;}
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
}
