/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PClases;

import java.util.Scanner;

public class Cola {
    //Inicializar Cola
    int[] crear(){
       Scanner sc = new Scanner(System.in);
       int tam; 
       
       System.out.print("Tamano del vector? ");
       tam = sc.nextInt();
       int cola[] = new int[tam];
       
       return cola;
    }
    
    //NumElementosCola
    public int contar(int[] cola) {
        int cont = 0;
        for(int i = 0; i < cola.length; i++) {
            if(cola[i] != 0) {
                cont++;
            }
        }
        return cont;
    }
    
    //Encolar
    void introducir(int cola[], int n){
        Cola cont = new Cola();
        
        int tam = cont.contar(cola);
        
        
        if(tam < cola.length){
            cola[tam] = n;
        }else{
            System.out.println("\nCola llena, borre un elemento");
        }
              
    }
    
    //Desencolar
    public int eliminar(int[] cola){
        int rescatado = cola[0];
        for(int i = 0; i < cola.length - 1; i++){
            cola[i] = cola[i+1];
        }
        cola[cola.length - 1] = 0;
        return rescatado;
    }
    
    //Cola Vacia
    boolean corroborarVacia(int cola[]){
        Pila cont = new Pila();
        
        int tam = cont.contar(cola);
        boolean vacia;
        
        if(tam == 0){
            vacia = true;
        }else{
            vacia = false;
        }
        
        return vacia;
    }
    
    //Imprimir Cola
    void imprimir(int cola[]){
        Pila cont = new Pila();
        
        int tam = cont.contar(cola);
        
        for(int i=tam-1;i>=0;i--){
            System.out.println(cola[i]);
        }
    }
    
    //Leer Cola
    public static void leerCola(Menu cola) {
        Menu temp = new Menu();
        while (!cola.colaVacia()) {
            int elem = cola.desencolar();
            System.out.println(elem);
            temp.encolar(elem);
        }
        while (!temp.colaVacia()) {
            cola.encolar(temp.desencolar());
        }
    }
    
    //Eliminar Cola
    public void eliminarCola(int[] cola) {
        for (int i = 0; i < cola.length; i++) {
            cola[i] = 0; // se reemplaza cada elemento por cero
        }
    }
    
    //Quitar Primero
    public int quitar(int[] cola) {
        int primero = cola[0];
        for (int i = 0; i < cola.length - 1; i++) {
            cola[i] = cola[i + 1];
        }
        cola[cola.length - 1] = 0;
        return primero;
    }
}
