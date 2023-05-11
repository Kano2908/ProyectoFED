//@author crist
package PClases;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------ MENU ------");
            System.out.println("Lista De Programas: Estrucura De Datos");
            System.out.println("Ingrese El Numero Para Escoger El Programa: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 2 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 3 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 4 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 5 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 6 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 7 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 8 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 9 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 10 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 11 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 12 -> {
                    do {

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                default -> {
                    System.out.println("Error Seleccione Un Numero Valido");
                }
            }
        } while (opcion != 13);
    }
}