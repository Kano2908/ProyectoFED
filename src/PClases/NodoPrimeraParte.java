package PClases;

public class NodoPrimeraParte {
    int dato;
    NodoPrimeraParte siguiente;   //Clase Nodo se le crean dos variables dato de tipo int y siguiente de tipo Nodo
    
    public NodoPrimeraParte(int dato){   //constructor con parametro 
        this.dato = dato;   //Este dato dentro va ser igual al dato del parametro
        this.siguiente = null;  //este siguiente va ser igual a null 
    }
}
