package PClases;

public class NodoCuartaParte {
    int dato;
    NodoCuartaParte siguiente;   //Clase Nodo se le crean dos variables dato de tipo int y siguiente de tipo Nodo
    
    public NodoCuartaParte(int dato){   //constructor con parametro 
        this.dato = dato;   //Este dato dentro va ser igual al dato del parametro
        this.siguiente = null;  //este siguiente va ser igual a null 
    }
}
