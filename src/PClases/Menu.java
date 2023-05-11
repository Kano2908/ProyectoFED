//Autor Equipo 6
package PClases;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        //Creacion de los objetos de cada clase
        EjerciciosWhile eWhile = new EjerciciosWhile();
        EjerciciosDoWhile eDoWhile = new EjerciciosDoWhile();
        EjerciciosFor eFor = new EjerciciosFor();
        
        do {
            System.out.println("------ MENU ------");
            System.out.println("Lista De Programas: Estrucura De Datos");
            System.out.println("1. Programa: Eleccion");
            System.out.println("2. Programa: Calcomanias");
            System.out.println("3. Programa: Numero Aleatorio");
            System.out.println("4. Programa: Jornada Laboral");
            System.out.println("5. Programa: Muestreo Edad");
            System.out.println("6. Programa: Centro de Verificacion de Vehiulos");
            System.out.println("Ingrese El Numero Para Escoger El Programa: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {
                        eWhile.eleccion();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 2 -> {
                    do {
                        eWhile.calcomanias();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 3 -> {
                    do {
                        eDoWhile.adivinaNumero();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 4 -> {
                    do {
                        eDoWhile.jornadaL();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 5 -> {
                    do {
                        eFor.muestreoEdad();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 6 -> {
                    do {
                        eFor.centroVA();
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
        entrada.close();
    }
}