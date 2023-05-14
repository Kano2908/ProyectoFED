//Autor Equipo 6
package PClases;
import java.util.Scanner;

public class EjerciciosFor {
    public void muestreoEdad() {
        Scanner entrada = new Scanner(System.in);
        int Categoria = 0, NumPersonas = 0;
        float Promedio = 0, PesoP = 0;

        System.out.println("Ingresa A Que Categoria Quieres Registrar");
        System.out.println("1. Niños (0-12), 2. Jovenes(13-29), 3. Adultos(30-59), 4. Viejos(+60=: ");
        Categoria = entrada.nextInt();

        switch (Categoria) {
            case 1 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 2 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 3 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 4 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
        }
        System.out.println("Promedio Del Peso: " + (Promedio / NumPersonas));
    }
    
    public void centroVA() {
        Scanner entrada = new Scanner(System.in);
        float Promedio = 0;
        int NumCarros = 0, A = 0, B = 0, PContaminacion = 0;

        System.out.println("Ingrese Cuantas Unidades Quiere Inspeccionar: ");
        NumCarros = entrada.nextInt();

        System.out.println("Ingresa El Numero De Contaminacion Del Auto: ");
        for (int i = 0; i < NumCarros; i++) {
            PContaminacion = entrada.nextInt();

            Promedio += PContaminacion;

            if (i == 0) {
                A = PContaminacion;
                B = PContaminacion;
            } else {
                if (A >= PContaminacion) {
                    if (B > PContaminacion) {
                        B = PContaminacion;
                    }
                } else {
                    A = PContaminacion;
                    if (B > PContaminacion) {
                        B = PContaminacion;
                    }
                }
            }
        }
        if (A == B) {
            System.out.println("Todos Los Numeros Son Iguales");
        } else {
            System.out.println("El Numero Mas Al De Contaminacion Es: " + A);
            System.out.println("El Numero Menos Al De Contaminacion Es: " + B);
        }
        System.out.println("El Promedio Es " + (Promedio / NumCarros));
    }
    
     public void Modulo5Ejercicio1(){
     //1) En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento dependiendo de un número 
        //que se escoge al azar. Si el numero escogido es menor que 74 el descuento es del 15% sobre el total de la compra, 
        //si es mayor o igual a 74 el descuento es del 20%. Obtener cuánto dinero se le descuenta.
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite el total de la compra: ");
        double totalCompra;
        totalCompra = entrada.nextDouble( );
        
        System.out.println("Elija un numero del 1 al 100");
        int num;
        num = entrada.nextInt( );
        
        double descuento;
        
        if(num<74) {
            System.out.println("Su descuento es del 15% ");
            descuento = totalCompra - (totalCompra * 0.15);
            System.out.println("El total de su compra con descuento es de: " + descuento);
        } else {
            System.out.println("Su descuento es del 20%");
            descuento = totalCompra - (totalCompra * 0.20);
            System.out.println("El total de su compra con descuento es de: " + descuento);
        }
}      

}