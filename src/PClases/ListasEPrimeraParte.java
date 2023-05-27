package PClases;

public class ListasEPrimeraParte {
    private NodoPrimeraParte primero;
    private int size;       //Clase ListaEnlazadas se le crean dos variables primero de tipo Nodo y size de tipo int
    public ListasEPrimeraParte(){
        this.primero = null;   //este primero va ser igual a null
        this.size = 0;      //este size tendra un valor de 0
    }
    
    public void listaVacia(){       //Se crea el metodo de tipo void que estara en el Main
        if(primero == null){        //si primero es igual a null saldra el primer mensaje
            System.out.println("La lista esta vacia");
        }else{      //caso contrario mostrar este mensaje
            System.out.println("la lista tiene datos");
        }
    } 
    
    public void agregarNodo(int dato){   //Se crea el metodo de tipo void que estara en el Main que tiene como parametro dato que se pasara desde el Main   
        NodoPrimeraParte nuevo = new NodoPrimeraParte(dato); //se agrega el nodo
        
        //codigo de primera parte
        nuevo.siguiente = primero; //ir al primer nodo
        primero = nuevo; //lo coloca de primero
        size ++; //se hace un incremento en size para contar el numero de datos que le ingresaremos en el Main
    }
    
    public int size(){  //Se crea el metodo de tipo int que estara en el Main y retornara el size
        return size;
    }
    
    public void Listar(){ //Se crea el metodo de tipo void que estara en el Main
        NodoPrimeraParte actual = primero; //nodo actual sera igual a primero
        while(actual != null){ //mientras actual sea diferente de null se va repetor el mensaje para mostrar en pantalla los datos
            System.out.print("["+ actual.dato+ "] ->");
            actual = actual.siguiente; //actual va ser igual a actual.siguiente para que pase al otro valor
        }
    }
}
