package PClases;

import java.util.Scanner;

public class BusquedaSecuencial {
    public int MetodoS(){
        Scanner entrada = new Scanner(System.in);
        int calificacionB = 0;
        int [] calificaciones  = {9, 8, 7, 6, 5, 3};
        
        System.out.println("Ingresa La Calificacion A Buscar: ");
        calificacionB = entrada.nextInt();
        
        for(int i = 0;i < 6;i++){
            if(calificacionB == calificaciones[i]){
                System.out.println("Calificacion encontrada en la posicion: "+i);
            }
        }
        return (-1);
    }
    
}
