package LAL;

import Modelo.Alumno;

public class Nodo {
    private Alumno valor;
    private Nodo siguiente;
    
    public Nodo(Alumno valor){
        this.valor=valor;
        this.siguiente=null;
    }

    public Alumno obtenerValor() {
        return valor;
    }
    
    
    public void enlazarSiguiente(Nodo n){
        siguiente=n;
    }
    
    public Nodo obtenerSiguiente() {
        return siguiente;
    }
    
    
    
}
