package PClases;

import java.util.Scanner;

public class Pila {
    // Crear Pila
    int[] crear(){
       Scanner sc = new Scanner(System.in);
       int tam; 
       
       System.out.print("Tamano del vector? ");
       tam = sc.nextInt();
       int pila[] = new int[tam];
       
       return pila;
    }
    
    //Apilar Pila
    void introducir(int pila[], int n) {
        Pila cont = new Pila();

        int tam = cont.contar(pila);

        if (tam < pila.length) {
            pila[tam] = n;
        } else {
            System.out.println("\nPila llena, borre un elemento");
        }
    }
    
    //Desapilar
    int eliminar(int pila[]){
        Pila cont = new Pila();
        
        int tam = cont.contar(pila);
        
        
        int elem = pila[tam-1];
        pila[tam-1] = -1;
         
         return elem;
    }
    
    //Pila Vacia
    boolean corroborarVacia(int pila[]){
        Pila cont = new Pila();
        
        int tam = cont.contar(pila);
        boolean vacia;
        
        if(tam == 0){
            vacia = true;
        }else{
            vacia = false;
        }
        
        return vacia;
    }
    
    //Imprimir Pila
    void imprimir(int pila[]){
        Pila cont = new Pila();
        
        int tam = cont.contar(pila);
        
        for(int i=tam-1;i>=0;i--){
            System.out.println(pila[i]);
        }
    }
    
    //Numero Elementos
    int contar(int pila[]){
        int tam = 0;
        
        for(int i=0;i<pila.length;i++){
            if(pila[i] > 0){
                tam++;
            }
        }
        
        return tam;
    }
    
    //Cima
    int devolverCima(int pila[]){
        Pila cont = new Pila();
        int tam = cont.contar(pila);        
        int cima = pila[tam-1];
        
        return cima;
    }
    
    //Decapitar
    void eliminarCima(int pila[]){
        Pila cont = new Pila();
        int tam = cont.contar(pila);
        
        pila[tam-1] = -1;
    }
    
    //Eliminar Pila
    void elimiarPila(int pila[]){
        Pila cont = new Pila();
        int tam = cont.contar(pila);
        
        for(int i=0;i<tam;i++){
            pila[i] = -1;
        }
    }
    
    //Escribir Pila
    void escribir(int pila[], int tam){
        Pila vacia = new Pila();
        Pila leerYquitarCima = new Pila();
        Pila cont = new Pila();
        
        int elem;
        
        if(!vacia.corroborarVacia(pila)){
            elem = leerYquitarCima.eliminar(pila);
            System.out.println(elem);
            tam = cont.contar(pila);
            escribir(pila, tam);
        }
    }
    
    //Copiar Pila
    int[] copiarPila(int pila[]){
        Pila cont = new Pila();
        Pila leerYquitarCima = new Pila();
        
        int tam = cont.contar(pila);
        int copia[] = new int[tam];
        int elem = 0;
        for(int i=tam-1;i>=0;i--){
            elem = leerYquitarCima.eliminar(pila);
            copia[i] = elem;
        }
        
        for(int i=0;i<tam;i++){            
            pila[i] = copia[i];
        }
        
        return copia;
    }
    
    //Sumergir Pila
    int[] sumergir(int pila[], int n){
        Pila cont = new Pila();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam+2];
        
        aux[0] = n;
        
        for(int i=1;i<(tam+1);i++){
            aux[i] = pila[i-1];
        }                     
        
        return aux;
    }
    
    //Invertir Pila
    int[] invertir(int pila[]){
        Pila cont = new Pila();
        Pila desapilar = new Pila();
        Pila sumergir = new Pila();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam];
        int elem = 0;
        
        for(int i=0;i<tam;i++){
            elem = desapilar.eliminar(pila);
            aux[i] = elem;
            sumergir.sumergir(aux, elem);
        }
        
        return aux;
    }
    
    //Estar Pila
    void estar(int pila[], int n){
        Pila cont = new Pila();
        
        int tam = cont.contar(pila);
        boolean encontrado = false;
        
        for(int i=0;i<tam;i++){
            if(pila[i] == n){
                encontrado = true;
            }
        }
        
        if(encontrado){
            System.out.println("Elemento encontrado");
        }else{
            System.out.println("");
            System.out.println("Elemento no encontrado");
        }
    }
    
    //Desfondar
    int desfondar(int pila[]){
        Pila cont = new Pila();
        Pila desapilar = new Pila();
        
        int tam = cont.contar(pila);
        int aux[] = new int[tam];
        int fondo = 0;
        
        for(int i=tam-1;i>=0;i--){
          aux[i] = pila[i];
          fondo =   desapilar.eliminar(pila);
        }
        
        for(int i=tam-1;i>=0;i--){
          pila[i] = aux[i];
          
        }
        
        return fondo;
    }
}
