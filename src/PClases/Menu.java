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
        EstructurasDCIF eIf = new EstructurasDCIF();
        Modulo5 eModulo5 = new Modulo5();
        Modulo7 eModulo7 = new Modulo7();
        EjerciciosArreglos eArreglos = new EjerciciosArreglos();
        Recursividad eRecursividad = new Recursividad();
        
        do {
            System.out.println("------------------------ MENU ------------------------");
            System.out.println("Lista De Programas: Estrucura De Datos");
            System.out.println("1. Programa: Eleccion");
            System.out.println("2. Programa: Calcomanias");
            System.out.println("3. Programa: Numero Aleatorio");
            System.out.println("4. Programa: Jornada Laboral");
            System.out.println("5. Programa: Muestreo Edad");
            System.out.println("6. Programa: Centro de Verificacion de Vehiulos");
            System.out.println("7. Modulo 5 EjercicioA 1 (Supermecado)");
            System.out.println("8. Modulo 5 EjercicioA 2 (Ferrocarril)");
            System.out.println("9. Modulo 5 EjercicioA 3 (Compañia Seguros)");
            System.out.println("10. Modulo 5 EjercicioA 4 (Colegiatura)");
            System.out.println("11. Modulo 5 EjercicioA 5 (Empresa Bienes Raices)");
            System.out.println("12. Modulo 5 Ejercicio Pag 13");
            System.out.println("13. Modulo 5 Ejercicio Pag 18");
            System.out.println("14. Modulo 5 Ejercicio Pag 19");
            System.out.println("15. Modulo 5 Ejercicio Pag 20");
            System.out.println("16. Modulo 5 Ejercicio Pag 22");
            System.out.println("17. Modulo 5 Ejercicio Pag 23");
            System.out.println("18. Modulo 5 Ejercicio Pag 24");
            System.out.println("19. Modulo 5 Ejercicio Pag 26");
            System.out.println("20. Modulo 5 Ejercicio Pag 29");
            System.out.println("21. Modulo 7 Ejercicio 1 Pag 22 - 29");
            System.out.println("22. Modulo 7 Ejercicio 2 Pag 22 - 29");
            System.out.println("23. Modulo 7 Ejercicio 3 Pag 22 - 29");
            System.out.println("24. Modulo 7 Ejercicio 4 Pag 22 - 29");
            System.out.println("25. Ejercicio Arreglo Con Metodos");
            System.out.println("25. Ejercicio Caso De Recursividad");
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
                        eIf.EjercicioA1();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 8 -> {
                    do {
                        eIf.EjercicioA2();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 9 -> {
                    do {
                        eIf.EjercicioA3();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 10 -> {
                    do {
                        eIf.EjercicioA4();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 11 -> {
                    do {
                        eIf.EjercicioA5();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 12 -> {
                    do {
                        eModulo5.pag13();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 13 -> {
                    do {
                        eModulo5.pag18();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 14 -> {
                    do {
                        eModulo5.pag19();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 15 -> {
                    do {
                        eModulo5.pag20();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 16 -> {
                    do {
                        eModulo5.pag22();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 17 -> {
                    do {
                        eModulo5.pag23();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 18 -> {
                    do {
                        eModulo5.pag24();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 19 -> {
                    do {
                        eModulo5.pag26();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 20 -> {
                    do {
                        eModulo5.pag29();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 21 -> {
                    do {
                        eModulo7.printInfo(44339, 'L');
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 22 -> {
                    do {
                        int sum = eModulo7.returnSum();
                        System.out.println("The value returned is "+ sum);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 23 -> {
                    do {
                        eModulo7.subtract(3.14159F, 9F);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 24 -> {
                    do {
                        float invValue = eModulo7.printInfo(44339, 'L', 29.99F, 340);
                        System.out.println("Value of inventory: " + invValue);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 25 -> {
                    do {
                        eArreglos.datosGA();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 26 -> {
                    do {
                        System.out.println("Digite el valor de la base: ");
                        int base = entrada.nextInt();
                        System.out.println("Digite el valor del exponente: ");
                        int exp = entrada.nextInt();
                        eRecursividad.Calcular(base, exp);
                        System.out.println(base+" elevado a "+exp+" = "+ eRecursividad.Calcular(base, exp));
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 27 -> {
                    do {
                        
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 28 -> {
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