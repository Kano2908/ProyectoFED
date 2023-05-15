package PClases;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosOrdenamiento {
    public void aBurbuja(){
        Scanner entrada = new Scanner(System.in);
        
        int dimencionA, i, j, temp = 0;
        String respuesta;
        
        System.out.println("Ingresa el tamaño del arreglo: ");
        dimencionA = entrada.nextInt();
        int proyecto [] = new int [dimencionA];
        entrada.nextLine(); // consume el carácter de nueva línea
        
        do{
            System.out.println("Introduce los numeros del arreglo: ");
            for(i = 0; i<dimencionA;i++){
                proyecto[i] = entrada.nextInt();
            }
            entrada.nextLine(); // consume el carácter de nueva línea
            
            for(i=1;i<dimencionA;i++){
                for(j=0;j<dimencionA-1;j++){
                    if(proyecto[j] > proyecto[j+1]){
                        temp=proyecto[j];
                        proyecto[j] = proyecto[j+1];
                        proyecto[j+1] = temp;
                    }
                    for(j=0;j<dimencionA;j++){
                        System.out.println(proyecto[j] +"\n");
                    }
                }
            }
            System.out.println("Desea reiniciar el programa? (s/n): ");
            respuesta = entrada.nextLine();
        }while(respuesta.compareTo("s")==0 || respuesta.compareTo("S")==0);
    }
    
    //Algoritmo de insercion
    public void ArrayInsercion(int []array){
        Scanner entrada = new Scanner(System.in);
        for(int i = 1;i <6; i++ ){
            array[i] = entrada.nextInt();
        }
    }
    
    public void MetodoInsercion(int aux, int array[], int j){
        for(int i = 1;i < 6; i++){
            aux = array[i];
            j = i-1;
        } 
        for(int i = 1;i < 6; i++){
            aux = array[i];
            j = i-1;
            
            while((array[j]>aux)&&(j>=0)){
                array[j+1] = array[j];
                j--;
                array[j+1] = aux;
            }
        }
        for(int i = 1;i < 6; i++){
            System.out.println("Resultado: "+array[i]);
        }
    }
    
    //Mezcla Directa - Exposicion 
    public int[] arregloIngre(int [] array, int tamañoA){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los elementos de tu arreglo: ");
        for(int i=0;i<tamañoA;i++){
            array[i] = entrada.nextInt();
        }
        return array;
    }
    
    public int [] MezclaDP(int [] arreglo){
        int i, j, k;
        
        if(arreglo.length > 1){
            int nElementosIzq = arreglo.length/2;
            int nElementosDer = arreglo.length - nElementosIzq;
            
            //"Arrays.copyOfRange" para crear los arreglos izquierdo y derecho.
            
            int arregloIzq[] = Arrays.copyOfRange(arreglo, 0, nElementosIzq);
            int arregloDer[] = Arrays.copyOfRange(arreglo, nElementosIzq, arreglo.length);
            
            //Recursividad
            arregloIzq = MezclaDP(arregloIzq);
            arregloDer = MezclaDP(arregloDer);
            
            i=0;
            j=0;
            k=0;
            
            while(arregloIzq.length != j && arregloDer.length != k){
                if(arregloIzq[j] < arregloDer[k]){  //i se agrra para array principal, j para arregloizq y k para arregloDer
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                }
                else{
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //Arreglo final
            while(arregloIzq.length != j){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while(arregloDer.length != k){
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
        //fin del else
        return arreglo;
    }
    
    public void MostrarArreglo(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
