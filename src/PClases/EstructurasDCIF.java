package PClases;

import java.util.Random;
import java.util.Scanner;

public class EstructurasDCIF {

    public void EjercicioA1() {
        Random NAleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int N = NAleatorio.nextInt(100);
        float Compra, Descuento;

        System.out.println("Hola, Bienvenido Su Numero Aleatorio Es:  " + N);
        System.out.println("Porfavor Ingrese Su Cantidad De Compra: ");
        Compra = entrada.nextFloat();

        if (N >= 74) {
            System.out.println("Tiene Un Descuento Del 20%");
            Descuento = Compra - (Compra * 0.20f);
            System.out.println("El Total De Su Cuenta Con Descuento Fue: " + Descuento);
        } else {
            System.out.println("Tiene Un Descuento Del 15%");
            Descuento = Compra - (Compra * 0.15f);
            System.out.println("El Total De Su Cuenta Con Descuento Fue: " + Descuento);
        }
    }

    public void EjercicioA2() {
        Scanner entrada = new Scanner(System.in);
        final float PrecioK = 10.00f;
        float DistanciaK, Descuento, NoDescuento;
        int DiasEstancia;

        System.out.println("Bienvenido, Porfavor Ingrese Los Dias De Estancia: ");
        DiasEstancia = entrada.nextInt();

        System.out.println("Bienvenido, Porfavor Ingrese La Distancia - KM: ");
        DistanciaK = entrada.nextInt();

        if (DiasEstancia > 7 && DistanciaK > 800) {
            System.out.println("Tiene Una Reduccion Del 30% Con El Precio Final");
            Descuento = DistanciaK * PrecioK - ((DistanciaK * PrecioK) * 0.30f);
            System.out.println("El Precio De Su Viaje Es De: " + Descuento);
        } else {
            NoDescuento = DistanciaK * PrecioK;
            System.out.println("El Precio De Su Viaje Es De: " + NoDescuento);
        }
    }

    public void EjercicioA3() {
        Scanner entrada = new Scanner(System.in);

        double Monto, totalp, pagototal;
        System.out.println("Monto:  ");
        Monto = entrada.nextDouble();
        if (Monto < 50000) {
            totalp = (Monto * 0.03);
        } else {
            totalp = (Monto * 0.02);
        }
        pagototal = Monto + totalp;
        System.out.println("Total a Pagar:  " + pagototal);
    }

    public void EjercicioA4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcular el precio de la colegiatura");
        System.out.print("Indique el numero de materias que cursa el alumno: ");
        int materias = input.nextInt();
        System.out.print("Indique el promedio obtenido por el alumno en el ultimo periodo: ");
        double promedio = input.nextDouble();

        double precioMateria = 500;
        double precioTotal = materias * precioMateria;

        if (promedio >= 9) {
            precioTotal = (precioTotal * 70) / 100;
        } else {
            precioTotal = (precioTotal * 110) / 100;
        }
        System.out.println("El precio total de la colegiatura es de: " + precioTotal + " pesos");
    }

    public void EjercicioA5() {
        Scanner in = new Scanner(System.in);

        double anios, costo_de_la_casa, enganche, ingresos, pago_parcial;
        System.out.print("Ingresa el valor de costo de la casa: ");
        costo_de_la_casa = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de ingresos: ");
        ingresos = in.nextDouble();
        in.nextLine();
        if (ingresos < 8000) {
            enganche = costo_de_la_casa * 0.15;
            anios = 10;
        } else {
            enganche = costo_de_la_casa * 0.3;
            anios = 7;
        }
        pago_parcial = (costo_de_la_casa - enganche) / 12 / anios;
        System.out.println("Valor de anos: " + anios);
        System.out.println("Valor de enganche: " + enganche);
        System.out.println("Valor de pago parcial: " + pago_parcial);
    }
}