package Modelo;
import java.util.Date;
import Modelo.Alumno;
import java.text.DecimalFormat;


public class Matricula {
    private String matcodigo;
    Alumno codigo;
    Grado codigoGrado;
    
    private Date FechaInicio;
    private Alumno AlumnoMatriculado;
    private int DuracionCiclo;
    private double CostoMatricula;
    private static int contador=0;
    
    public Matricula(String cod, Date fechaInicio, Alumno alumno,int duracionCiclo, double costoMatricula) {
        if (matcodigo == null || matcodigo.isEmpty()) {
            DecimalFormat df = new DecimalFormat("MT0000");
            this.matcodigo = df.format(contador);
            contador++;
        } else {
            this.matcodigo = matcodigo;
        }
        this.FechaInicio = fechaInicio;
        this.AlumnoMatriculado = alumno;
        this.DuracionCiclo = duracionCiclo;
        this.CostoMatricula = costoMatricula;
    }
    
    
    public String getCodigo() {return matcodigo;}
    public void setCodigo(String codigo) {this.matcodigo = codigo;}
    public Date getFechaInicio() {return FechaInicio;}
    public void setFechaInicio(Date FechaInicio) {this.FechaInicio = FechaInicio;}
    public Alumno getAlumnoMatriculado() {return AlumnoMatriculado;}
    public void setAlumnoMatriculado(Alumno AlumnoMatriculado) {this.AlumnoMatriculado = AlumnoMatriculado;}
    public int getDuracionCiclo() {return DuracionCiclo;}
    public void setDuracionCiclo(int DuracionCiclo) {this.DuracionCiclo = DuracionCiclo;}
    public double getCostoMatricula() {return CostoMatricula;}
    public void setCostoMatricula(double CostoMatricula) {this.CostoMatricula = CostoMatricula;}


    
    
    
    
}
