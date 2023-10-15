package Modelo;

import java.text.DecimalFormat;

public class Cursos {
    private String cursocod;
    Grado codigogrado;
    private String nombre;
    private int canthoras;
    private static int contador=0;
    
    public Cursos(String cursocod, Grado codigogrado, String nombre, int canthoras){
        if (cursocod == null || cursocod.isEmpty()) {
            DecimalFormat df = new DecimalFormat("CR0000");
            this.cursocod = df.format(contador);
            contador++;
        } else {
            this.cursocod = cursocod;
        }
        this.codigogrado=codigogrado;
        this.nombre=this.nombre;
        this.canthoras=canthoras;
    }

    public String getCursocod() {return cursocod;}
    public void setCursocod(String cursocod) {this.cursocod = cursocod;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getCanthoras() {return canthoras;}
    public void setCanthoras(int canthoras) {this.canthoras = canthoras;}
    
    
    
    
    
}
