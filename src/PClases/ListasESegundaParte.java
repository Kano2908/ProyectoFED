package PClases;

public class ListasESegundaParte {
    private NodoSegundaParte primero;
    private int size;       //Clase ListaEnlazadas se le crean dos variables primero de tipo Nodo y size de tipo int
    public ListasESegundaParte(){
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
        NodoSegundaParte nuevo = new NodoSegundaParte(dato); //se agrega el nodo
        
        //codigo de segunta parte
        NodoSegundaParte valor1, valor2;
        if(primero == null){ //si primero es igual a null
            primero = nuevo; //primero va serigual a nuevo
            nuevo.siguiente = null; // nuevo.siguiente sera igual a null
        }else{ //caso contrario
            valor1 = primero; //valo1 va ser igual primero
            while(valor1 != null){ //mientras valor1 es diferente de null o tenga datos se repetira
                //condicion que verfica si el numero entrante debe ir al primero
                valor2 = valor1.siguiente;
                if(nuevo.dato <= valor1.dato){ //se abre un f para comparara si uevo.dato es menor o igual a valor1.dato se va hacer esa condicion
                  nuevo.siguiente = primero; //nuevo. siguiente va ser igual a primero
                  primero = nuevo; //primero sera igual a nuevo
                  break; //y se hace un brake para romper
                } else{
                    //condicion que verifica el numero entranre debe ir al ultimo
                    if(nuevo.dato > valor1.dato && valor2 == null){
                        valor1.siguiente = nuevo; //valor1.siguiente sera igual a nuevo
                        nuevo.siguiente = null; //nuevo.siguiente sera igual a null
                        break; //y se hace un brake para romper
                    }else{ //caso contrario
                        //Condicion que verifica el numero entrante debe ir enmedio de otro 
                        if(valor1.dato < nuevo.dato && valor2.dato >= nuevo.dato){
                               valor1.siguiente = nuevo; //valor1.siguinete va ser igual a nuevo
                               nuevo.siguiente = valor2; //nuevo.siguinete va ser igual a valo2
                               break; //un brake para romper
                        }
                        else{ //caso contario
                            valor1 = valor1.siguiente; //valor 1 va ser igual a valor1.siguiente
                        }
                    }
                    
                }
            }
        }
        size ++;
}
    
    public int size(){  //Se crea el metodo de tipo int que estara en el Main y retornara el size
        return size;
    }
    
    public void Listar(){ //Se crea el metodo de tipo void que estara en el Main
        NodoSegundaParte actual = primero; //nodo actual sera igual a primero
        while(actual != null){ //mientras actual sea diferente de null se va repetor el mensaje para mostrar en pantalla los datos
            System.out.print("["+ actual.dato+ "] ->");
            actual = actual.siguiente; //actual va ser igual a actual.siguiente para que pase al otro valor
        }
    }
}
