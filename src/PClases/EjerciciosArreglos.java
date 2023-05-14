package PClases;
import java.util.Scanner;

public class EjerciciosArreglos {
    public void datosGA(){
        String[] Matricula = new String[5];
        String[] Nombre = new String[5];
        int[] Edad = new int[5];
        int[] EE = new int[5];
        float[] Calificacion = new float[5];
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i < 5;i++){
            System.out.println("Ingresa La Matricula Del Estudiante "+ (i + 1)+":");
            Matricula[i] = entrada.nextLine();
            System.out.println("Ingresa El Nombre Del Estudiante "+ (i + 1)+":");
            Nombre[i] = entrada.nextLine();
            System.out.println("Ingresa La Edad Del Estudiante "+ (i + 1)+":");
            Edad[i] = entrada.nextInt();
            entrada.nextLine(); // consumir la línea pendiente
            System.out.println("Ingresa Las EE Cursadas Del Estudiante "+ (i + 1)+":");
            EE[i] = entrada.nextInt();
            System.out.println("Ingresa La Calificacion Del Estudiante "+ (i + 1)+":");
            Calificacion[i] = entrada.nextFloat();
            entrada.nextLine(); // consumir la línea pendiente
            System.out.println("");
            
        }
        
        for(int i = 0;i < 5;i++){
            System.out.println("------ Alumno "+ (i + 1)+" informacion ------");
            System.out.println("Matricula: "+Matricula[i]);
            System.out.println("Nombre: "+Nombre[i]);
            System.out.println("Edad: "+Edad[i]);
            System.out.println("EE Cursadas: "+EE[i]);
            System.out.println("Calificacion: "+Calificacion[i]);
            System.out.println("");  
        }
    }
}
