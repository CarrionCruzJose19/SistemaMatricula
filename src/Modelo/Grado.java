package Modelo;

import java.text.DecimalFormat;

public class Grado {
    private String codigogrado;
    private String seccion;
    private String nivel;
    private static int contador=0;
    
    public Grado(String codigogrado, String seccion, String nivel){
        if (codigogrado == null || codigogrado.isEmpty()) {
            DecimalFormat df = new DecimalFormat("GR0000");
            this.codigogrado = df.format(contador);
            contador++;
        } else {
            this.codigogrado = codigogrado;
        }
        
        this.seccion=seccion;
        this.nivel=nivel;
    }

    public String getCodigogrado() {return codigogrado;}
    public void setCodigogrado(String codigogrado) {this.codigogrado = codigogrado;}
    public String getSeccion() {return seccion;}
    public void setSeccion(String seccion) {this.seccion = seccion;}
    public String getNivel() {return nivel;}
    public void setNivel(String nivel) {this.nivel = nivel;}
    
    
    
}
