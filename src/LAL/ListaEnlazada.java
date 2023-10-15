package LAL;

import Modelo.Alumno;

public class ListaEnlazada {
    public Nodo cabeza;
    public int size;
    
    public ListaEnlazada(){
        cabeza=null;
        size=0;
    }
    
    public boolean estaVacia() {
    return cabeza == null;
    
    
}
    
    public void vaciarLista() {
    cabeza = null; // Establece la cabeza de la lista como nula para eliminar todos los nodos
    size = 0;      // Restablece el tamaño de la lista a cero
}
    
    public void añadirAlumno(Alumno alumno) {
    Nodo nuevoNodo = new Nodo(alumno);
    
    if (cabeza == null) {
        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
        cabeza = nuevoNodo;
    } else {
        // Si no está vacía, avanzamos hasta el último nodo y enlazamos el nuevo nodo allí
        Nodo puntero = cabeza;
        while (puntero.obtenerSiguiente() != null) {
            puntero = puntero.obtenerSiguiente();
        }
        puntero.enlazarSiguiente(nuevoNodo);
    }
    
    size++;
}

    public Alumno Buscar(String dni) { // Cambiar el tipo de parámetro a String
        Nodo puntero = cabeza;

        while (puntero != null) {
            Alumno alumno = puntero.obtenerValor();
            if (alumno.getDni().equals(dni)) { // Cambiar la comparación
                return alumno;
            }
            puntero = puntero.obtenerSiguiente();
        }
        return null;
    }

    public boolean borrarAlumno(String dni) {
        if (cabeza == null) {
            return false; // Lista vacía, no se puede eliminar
        }

        if (cabeza.obtenerValor().getDni().equals(dni)) {
            cabeza = cabeza.obtenerSiguiente();
            size--;
            return true; // Se eliminó el primer elemento
        }

        Nodo punteroAnterior = cabeza;
        Nodo punteroActual = cabeza.obtenerSiguiente();

        while (punteroActual != null) {
            Alumno alumno = punteroActual.obtenerValor();
            if (alumno.getDni().equals(dni)) {
                punteroAnterior.enlazarSiguiente(punteroActual.obtenerSiguiente());
                size--;
                return true; // Se eliminó un elemento
            }

            punteroAnterior = punteroActual;
            punteroActual = punteroActual.obtenerSiguiente();
        }

        return false; // No se encontró el elemento con el código dado
    }


    
    
    
    
}
