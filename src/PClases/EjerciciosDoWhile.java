//Autor Equipo 6
package PClases;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosDoWhile {
    public void adivinaNumero(){
        Random nAleatorio = new Random();
        Scanner entrada = new Scanner (System.in);
        int n = nAleatorio.nextInt(10);
        int nUsuario, i = 1;
        
        System.out.println("Hola Usuario, Ingresa Un Numero Para Adivinar: ");
        nUsuario = entrada.nextInt();
        
        do{
            System.out.println("No Lo Adivinaste, Intento: "+i);
            i++;
            System.out.println("Ingresa De Nuevo Un Numero: ");
            nUsuario = entrada.nextInt();
        } while(nUsuario != n);
        
        System.out.println("Lo Has Adivinado, Hiciste " +i +" Intentos");
    }
    
    public void jornadaL() {
        Scanner entrada = new Scanner(System.in);
        int Opcion = 0, HorasL = 0, Acabar = 0;
        float Pago;

        System.out.println("Ingrese La Jornada Que Quiere Ingresar");
        System.out.println("1. Nocturno, 2. Diurno: ");
        Opcion = entrada.nextInt();

        switch (Opcion) {
            case 1 -> {
                System.out.println("Desea Ingresar Las Horas De Trabajo Del Trabajador (Si = 1/No = 0): ");
                Opcion = entrada.nextInt();

                if (Opcion == 1) {
                    do {
                        System.out.println("Ingresa Las Horas Laboradas: ");
                        HorasL = entrada.nextInt();
                        if (HorasL > 15) {
                            Pago = HorasL * 50;
                            System.out.println("Su Pago Es De: " + Pago);
                        } else {
                            System.out.println("Despedido :)");
                        }
                        System.out.println("Desea Ingresar De Nuevo informacion(Si = 1/No = 0): ");
                        Opcion = entrada.nextInt();
                    } while (Opcion == 1);
                    System.out.println("Adiosss");
                } else {
                    System.out.println("Adiosss");
                }
                break;
            }
            case 2 -> {
                System.out.println("Desea Ingresar Las Horas De Trabajo Del Trabajador (Si = 1/No = 0): ");
                Opcion = entrada.nextInt();

                if (Opcion == 1) {
                    do {
                        System.out.println("Ingresa Las Horas Laboradas: ");
                        HorasL = entrada.nextInt();
                        if (HorasL > 15) {
                            Pago = HorasL * 10;
                            System.out.println("Su Pago Es De: " + Pago);
                        } else {
                            System.out.println("Despedido :)");
                        }
                        System.out.println("Desea Ingresar De Nuevo informacion(Si = 1/No = 0): ");
                        Opcion = entrada.nextInt();
                    } while (Opcion == 1);
                    System.out.println("Adiosss");
                } else {
                    System.out.println("Adiosss");
                }
                break;
            }
        }
    }
}
