//Autor Equipo 6
package PClases;

import java.util.Scanner;

public class Menu {
    //Variables locales para programa de Cola
    private int[] elementos;
    private int frente;
    private int fin;

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
        BusquedaSecuencial eBSecuencial = new BusquedaSecuencial();
        BusquedaBinaria eBBinaria = new BusquedaBinaria();
        MetodosOrdenamiento eMOrdenamiento = new MetodosOrdenamiento();
        MetodoRadix eRadix = new MetodoRadix();
        ShellSort eShellSort = new ShellSort();
        MezclaDirecta iMezclaD = new MezclaDirecta();
        Quicksort eQuicksort = new Quicksort();

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
            System.out.println("26. Ejercicio Caso De Recursividad");
            System.out.println("27. Ejercicio Busqueda Secuencial");
            System.out.println("28. Ejercicio Busqueda Binaria");
            System.out.println("29. Ejercicio Algoritmo Burbuja");
            System.out.println("30. Ejercicio Algoritmo Insercion");
            System.out.println("31. Ejercicio Exposicion Algoritmo Mezcla Directa");
            System.out.println("32. Ejercicio Exposicion Algoritmo Radix Sort");
            System.out.println("33. Ejercicio Exposicion Algoritmo Shell Sort");
            System.out.println("34. Ejercicio Exposicion Algoritmo Mezcla Natural");
            System.out.println("35. Ejercicio Exposicion Algoritmo Quicksort");
            System.out.println("36. Ejercicio Pila");
            System.out.println("37. Ejercicio Cola");
            System.out.println("38. Ejercicio Lista Enlazada Parte 1");
            System.out.println("39. Ejercicio Lista Enlazada Parte 2");
            System.out.println("40. Ejercicio Lista Enlazada Parte 3");
            System.out.println("41. Ejercicio Lista Enlazada Parte 4");
            System.out.println("42. Salir");
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
                        System.out.println("The value returned is " + sum);
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
                        System.out.println(base + " elevado a " + exp + " = " + eRecursividad.Calcular(base, exp));
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 27 -> {
                    do {
                        eBSecuencial.MetodoS();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
            
                case 28 -> {
                    do {
                        int[] edades = new int[35];
                        for (int i = 0; i < edades.length; i++) {
                            edades[i] = i * i;
                        }

                        for (int i = 0; i < edades.length; i++) {
                            System.out.println("edades[" + i + "]: " + edades[i]);
                        }

                        int resultado = BusquedaBinaria.buscar(edades, 9);

                        if (resultado != -1) {
                            System.out.println("Encontrado en: " + resultado);
                        } else {
                            System.out.println("El dato no se encuentra en el arreglo, o el arreglo no esta ordenado.");
                        }
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 29 -> {
                    do {
                        eMOrdenamiento.aBurbuja();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 30 -> {
                    do {
                        System.out.println("Introduce los numeros: ");
                        int[] array = new int[6];

                        eMOrdenamiento.ArrayInsercion(array);

                        eMOrdenamiento.MetodoInsercion(0, array, 0);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 31 -> {
                    do {
                        int array[], arrayOrdenado[], arrayDesordenado[], tamañoA;
                        System.out.println("Ingresa el tamaño de tu arreglo: ");
                        tamañoA = entrada.nextInt();
                        array = new int[tamañoA];

                        arrayDesordenado = eMOrdenamiento.arregloIngre(array, tamañoA);

                        arrayOrdenado = eMOrdenamiento.MezclaDP(arrayDesordenado);

                        System.out.println("Array Ordenado: ");
                        eMOrdenamiento.MostrarArreglo(arrayOrdenado);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 32 -> {
                    do {
                        //Declaración de variables
                        int[] arreglo = new int[]{78, 12, 53, 14, 01, 943, 50, 677, 33, 100}; //10 elementos en el arreglo
                        eRadix.radixSort(arreglo);
                        System.out.println("Elemtos organizados: ");
                        eRadix.imprimirArreglo(arreglo);
                        System.out.println("");
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 33 -> {
                    do {
                        //Aqui pedimos el tamaño de la matriz
                        System.out.print("Ingrese el tamaño de la matriz: ");
                        int n = entrada.nextInt();
                        //aqui asignamos el tamaño que ingreso el usuario a el arreglo llamado numeros
                        int numeros[] = new int[n];
                        //Se procede a ingresar los numeros del arreglo
                        System.out.println("Ingrese los elementos de la matriz: ");
                        for (int i = 0; i < n; i++) {
                            numeros[i] = entrada.nextInt();
                        }
                        //aqui se manda a llamar el metodo donde esta ordenando la matriz
                        eShellSort.shellSort(numeros);
                        //se imprime la matriz ordenada
                        System.out.println("Matriz ordenada:");
                        eShellSort.imprimir(numeros);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 34 -> {
                    do {
                        System.out.println("Indica el numero de elementos del arreglo");

                        int n = entrada.nextInt();

                        int a[] = new int[n];
                        n = a.length;

                        System.out.println("Introduce los numeros para tu arreglo");
                        for (int b = 0; b < n; b++) {
                            a[b] = entrada.nextInt();
                        }

                        System.out.println("");
                        System.out.print("Vector sin ordenar: ");

                        for (int i = 0; i < a.length; i++) {
                            System.out.print(a[i] + " ");
                        }

                        iMezclaD.mezclar(0, a.length - 1, a);

                        System.out.println("");
                        System.out.print("Vector ordenado: ");

                        for (int i = 0; i < a.length; i++) {
                            System.out.print(a[i] + " ");
                        }
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 35 -> {
                    do {
                        int array[];
                        int tamaio = 8, i;
                        array = new int[tamaio];
                        array[0] = 11;
                        array[1] = 5;
                        array[2] = 2;
                        array[3] = 6;
                        array[4] = 10;
                        array[5] = 12;
                        array[6] = 8;
                        array[7] = 7;
                        System.out.println("Array original:");
                        eQuicksort.imprimirArray(array);
                        eQuicksort.quickSort(array, 0, tamaio - 1);
                        System.out.println("Array ordenado:");
                        eQuicksort.imprimirArray(array);
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 36 -> {
                    do {
                        Pila inicializar = new Pila();
                        Pila ingresar = new Pila();
                        Pila leerYquitarCima = new Pila();
                        Pila comprobar = new Pila();
                        Pila imp = new Pila();
                        Pila cont = new Pila();
                        Pila devolverCima = new Pila();
                        Pila borrarCima = new Pila();
                        Pila popPila = new Pila();
                        Pila escribirPila = new Pila();
                        Pila copiar = new Pila();
                        Pila sum = new Pila();
                        Pila invertir = new Pila();
                        Pila estar = new Pila();
                        Pila desfondar = new Pila();

                        int pila[] = new int[20];
                        int tam, n, salir = 1; 

                        do {
                            System.out.println("\t\tMenu         ");
                            System.out.println("");
                            System.out.println("1.Inicializar Pila");
                            System.out.println("2.Apilar");
                            System.out.println("3.Desapilar");
                            System.out.println("4.Pila Vacia");
                            System.out.println("5.Imprimir Pila");
                            System.out.println("6.Numero de elementos de la Pila");
                            System.out.println("7.Cima");
                            System.out.println("8.Decapitar");
                            System.out.println("9.Eliminar Pila");
                            System.out.println("10.Escribir Pila");
                            System.out.println("11.Copiar Pila");
                            System.out.println("12.Sumergir");
                            System.out.println("13.Invertir Pila");
                            System.out.println("14.Esta");
                            System.out.println("15.Fondo");
                            System.out.println("16.Salir");
                            System.out.println("");
                            System.out.print("Introduce el numero que dese realizar : ");
                            opcion = entrada.nextInt();
                            System.out.println("");
                            switch (opcion) {
                                case 1 ->{
                                    pila = inicializar.crear();
                                    System.out.println("Pila creada satisfactoriamente");
                                }
                                case 2 -> {
                                    System.out.print("Digite el numero a introducir a la pila: ");
                                    n = entrada.nextInt();
                                    ingresar.introducir(pila, n);
                                }
                                case 3 -> {
                                    int rescatado = leerYquitarCima.eliminar(pila);
                                    System.out.println("Elemento rescatado: " + rescatado);
                                    System.out.println("\nElemento eliminado de la cima");
                                }
                                case 4 -> {
                                    boolean vacia = comprobar.corroborarVacia(pila);

                                    if (vacia) {
                                        System.out.println("La pila esta vacia");
                                    } else {
                                        System.out.println("La pila tiene elementos");
                                    }
                                }
                                case 5 -> {
                                    System.out.println("Elementos de la pila: ");
                                    System.out.println("");
                                    imp.imprimir(pila);
                                }
                                case 6 -> {
                                    int t = cont.contar(pila);
                                    System.out.println("Total de elementos de la pila: " + t);
                                }
                                case 7 -> {
                                    int cima = devolverCima.devolverCima(pila);
                                    System.out.println("La cima de la pila: " + cima);
                                    System.out.println("");
                                }
                                case 8 -> {
                                    borrarCima.eliminarCima(pila);
                                    System.out.println("Elemento de la cima eliminado");
                                }
                                case 9 -> {
                                    popPila.elimiarPila(pila);
                                    System.out.println("Pila eliminada");
                                }
                                case 10 -> {
                                    tam = cont.contar(pila);

                                    System.out.println("Elemntos de la pila: ");
                                    escribirPila.escribir(pila, tam);
                                    System.out.println("Elementos eliminados");
                                }
                                case 11 -> {
                                    tam = cont.contar(pila);
                                    int copia[] = new int[tam];
                                    copia = copiar.copiarPila(pila);
                                    System.out.println("Pila copiada: ");
                                    imp.imprimir(copia);
                                }
                                case 12 -> {
                                    System.out.println("");
                                    System.out.print("Digite el numero a introducir en la pila: ");
                                    n = entrada.nextInt();

                                    pila = sum.sumergir(pila, n);

                                    System.out.println("Elemento ingresado en la pila");
                                }
                                case 13 -> {
                                    pila = invertir.invertir(pila);

                                    System.out.println("Pila invertida: ");
                                    System.out.println("");

                                    imp.imprimir(pila);
                                }
                                case 14 -> {
                                    System.out.print("Digite el numero a buscar: ");
                                    n = entrada.nextInt();
                                    estar.estar(pila, n);
                                }
                                case 15 -> {
                                    n = desfondar.desfondar(pila);
                                    System.out.println("El numero del fondo de la pila es: " + n);
                                }
                            }
                            System.out.println("");
                        } while (opcion != 16);
                        
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 37 -> {
                    do {
                        Menu cola = new Menu();
                        Cola inicializar = new Cola();
                        Cola ingresar = new Cola();
                        Cola cont = new Cola();
                        Cola leerYquitar = new Cola();
                        Cola comprobar = new Cola();
                        Cola imp = new Cola();
                        Cola leer = new Cola();
                        Cola Eliminar = new Cola();
                        Cola Quitar = new Cola();
                        
                        int salir = 1;
                        int colaArray[] = new int[20];
                        int tam, n, tamanio;

                        do {
                            System.out.println(" ------ Menu ------ ");
                            System.out.println("1. Inicializar Cola");
                            System.out.println("2. Encolar");
                            System.out.println("3. Desencolar");
                            System.out.println("4. Cola Vacia");
                            System.out.println("5. Numero de elementos de la Cola");
                            System.out.println("6. Imprimir Pila");
                            System.out.println("7. Leer cola ");
                            System.out.println("8. Eliminar Cola");
                            System.out.println("9. Quitar Primero");
                            System.out.println("10. Salir");
                            System.out.print("Introduce el numero que desee realizar : ");
                            opcion = entrada.nextInt();
                            System.out.println("");
                            switch (opcion) {
                                case 1-> {
                                    int[] pila = inicializar.crear();
                                    System.out.println("Cola creada satisfactoriamente");
                                }
                                case 2 -> {
                                    System.out.print("Digite el numero a introducir a la cola: ");
                                    n = entrada.nextInt();
                                    ingresar.introducir(colaArray, n);
                                }
                                case 3 -> {
                                    int rescatado = leerYquitar.eliminar(colaArray);
                                    System.out.println("Elemento rescatado: " + rescatado);
                                    System.out.println("\nElemento eliminado de la cima");
                                }
                                case 4 -> {
                                    boolean vacia = comprobar.corroborarVacia(colaArray);

                                    if (vacia) {
                                        System.out.println("La cola esta vacia");
                                    } else {
                                        System.out.println("La cola tiene elementos");
                                    }
                                }
                                case 5 -> {
                                    int t = cont.contar(colaArray);
                                    System.out.println("Total de elementos de la Cola: " + t);
                                }
                                case 6 -> {
                                    System.out.println("Elementos de la cola: ");
                                    System.out.println("");
                                    imp.imprimir(colaArray);
                                }
                                case 7 -> {
                                    System.out.println("Leyendo la cola");
                                    leer.leerCola(cola);
                                }
                                case 8 -> {
                                    Eliminar.eliminarCola(colaArray);
                                    System.out.println("La cola ha sido eliminada");
                                }
                                case 9 -> {
                                    int rescatadoPrimero = Quitar.quitar(colaArray);
                                    System.out.println("Elemento rescatado: " + rescatadoPrimero);
                                    System.out.println("\nPrimer elemento eliminado de la cola");
                                }
                                case 10 -> {
                                    System.out.println("Seguro que quiere salir? Si-0 - No-1");
                                    salir = entrada.nextInt();
                                }
                                default -> System.out.println("No eligio ninguna opcion ");
                            }
                            System.out.println("");
                        } while (salir == 1);

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 38 -> {
                    do {
                        ListasEPrimeraParte lista = new ListasEPrimeraParte();
                        lista.listaVacia();
                        System.out.println("");
                        lista.agregarNodo(1);
                        lista.agregarNodo(2);
                        lista.agregarNodo(3); 
                        lista.agregarNodo(4);
                        lista.agregarNodo(5);
                        lista.Listar();

                        System.out.print(" Tamaño: " + lista.size()); 
                        System.out.println("");

                        lista.listaVacia(); 

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 39 -> {
                    do {
                        ListasESegundaParte lista = new ListasESegundaParte();
                        lista.listaVacia();

                        System.out.println("");
                        lista.agregarNodo(1);
                        lista.agregarNodo(3);
                        lista.agregarNodo(4); 
                        lista.agregarNodo(2);
                        lista.agregarNodo(5);
                        lista.Listar();

                        System.out.print(" Tamaño: " + lista.size()); //lo muestra econ un print 
                        System.out.println("");

                        lista.listaVacia();

                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 40 -> {
                    do {
                        int posicion;
                        ListasETerceraParte lista = new ListasETerceraParte();
                        lista.listaVacia();

                        System.out.println("");
                        lista.agregarNodo(1);
                        lista.agregarNodo(2);
                        lista.agregarNodo(3);
                        lista.agregarNodo(4);
                        lista.agregarNodo(5);
                        lista.Listar();

                        System.out.print(" Tamaño: " + lista.size());
                        System.out.println("");
                        
                        System.out.println("Que quieres hacer");
                        System.out.println("1. Borrar Primero");
                        System.out.println("2. Borrar Ultimo");
                        System.out.println("3. Borrar Posicion");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1 -> {
                                lista.BorrarPrimero();
                            }
                            case 2 -> {
                                lista.BorrarUltimo();
                            }
                            case 3 -> {
                                System.out.println("Que Posicion Quieres Borrar 1 - 5");
                                posicion = entrada.nextInt();
                                lista.BorrarPosicion(posicion);
                            }
                            default -> {
                                System.out.println("Error");
                            }
                        }
  
                        lista.Listar();
                        System.out.println("");
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                case 41 -> {
                    do {
                        ListasECuartaParte lista = new ListasECuartaParte(); 
                        lista.listaVacia(); 

                        System.out.println("");
                        lista.agregarNodo(1);
                        lista.agregarNodo(2);
                        lista.agregarNodo(3); 
                        lista.agregarNodo(4);
                        lista.agregarNodo(5);
                        lista.Listar();
                                 

                        System.out.print(" Tamaño: " + lista.size());
                        System.out.println("");

                        if (lista.Buscar(1) == null) {
                            System.out.println("la lista no tiene datos a buscar");
                        } else {
                            System.out.println("La lista si tiene el dato a buscar: ");
                        }

                        lista.Sustituir(5, 6);
                        lista.Listar();
                        System.out.println("Quieres Salir = 1 / Repetir Programa = 0");
                        opcion = entrada.nextInt();
                    } while (opcion == 0);
                }
                default -> {
                    System.out.println("Hasta luego");
                }
            }
        } while (opcion != 42);
        entrada.close();
    }
    
    //Constructores del programa de Cola
    public Menu() {
        elementos = new int[100];
        frente = 0;
        fin = -1;
    }

    public boolean colaVacia() {
        return frente > fin;
    }

    public int desencolar() {
        if (colaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int elemento = elementos[frente];
        frente++;
        return elemento;
    }

    public void encolar(int elem) {
        if (fin == elementos.length - 1) {
            throw new IllegalStateException("La cola está llena");
        }
        fin++;
        elementos[fin] = elem;
    }
}