//@author crist
package PClases;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Ingrese el numero para escoger el programa: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {

                }
                case 9 -> {

                }
                case 10 -> {

                }
                case 11 -> {

                }
                case 20 -> {
                    System.out.println("Adios");
                }
                default -> {

                }
            }
        } while (opcion != 20);
        
    }
}
