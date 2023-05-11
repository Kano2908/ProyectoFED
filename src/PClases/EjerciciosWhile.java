//Autor Equipo 6
package PClases;

import java.util.Scanner;

public class EjerciciosWhile {

    public void eleccion() {
        Scanner entrada = new Scanner(System.in);
        int Voto, Cand1 = 0, Cand2 = 0, Cand3 = 0, Cand4 = 0, TotalV = 0, Opcion;

        System.out.println("Ingrese 1 Para Ingrasar Con El Programa Y 0 Para Terminarlo: ");
        Opcion = entrada.nextInt();
        System.out.println("Intruzca el numero del cantidado (1-4)-(0 Apara Acabar El Programa): ");

        while (Opcion != 0) {
            Voto = entrada.nextInt();
            if (Voto == 0) {
                break;
            }
            if (Voto == 1) {
                Cand1++;
            }
            if (Voto == 2) {
                Cand2++;
            }
            if (Voto == 3) {
                Cand3++;
            }
            if (Voto == 4) {
                Cand4++;
            }
            TotalV++;
        }
        
        System.out.println("Votos Del Candidato 1: " + Cand1);
        System.out.println("Votos Del Candidato 2: " + Cand2);
        System.out.println("Votos Del Candidato 3: " + Cand3);
        System.out.println("Votos Del Candidato 4: " + Cand4);
        System.out.println("Total De Votos: " + TotalV);
        System.out.println("Porcentaje Del Candidato 1: " + (Cand1 * 100.0f) / TotalV + "%");
        System.out.println("Porcentaje Del Candidato 2: " + (Cand2 * 100.0f) / TotalV + "%");
        System.out.println("Porcentaje Del Candidato 3: " + (Cand3 * 100.0f) / TotalV + "%");
        System.out.println("Porcentaje Del Candidato 4: " + (Cand4 * 100.0f) / TotalV + "%");
    }

    public void calcomanias() {
        Scanner entrada = new Scanner(System.in);
        int numVeces, i = 0, numMatricula = 0, opcion = 0, sum = 0;

        System.out.println("Desea Ingresar Informacion(Si = 1 - No = 0): ");
        opcion = entrada.nextInt();
        while (opcion == 1) {
            System.out.println("Ingresa El Ultimo Digito Del Carro: ");
            numMatricula = entrada.nextInt();

            if (numMatricula == 1 || numMatricula == 2) {
                System.out.println("Es Amarillo");
                i++;
            }
            if (numMatricula == 3 || numMatricula == 4) {
                System.out.println("Es Rosa");
                i++;
            }
            if (numMatricula == 5 || numMatricula == 6) {
                System.out.println("Es Rojo");
                i++;
            }
            if (numMatricula == 7 || numMatricula == 8) {
                System.out.println("Es Verde");
                i++;
            }
            if (numMatricula == 9 || numMatricula == 0) {
                System.out.println("Es Azul");
                i++;
            }
            System.out.println("Desea Ingresar Informacion(Si = 1 - No = 0): ");
            opcion = entrada.nextInt();
        }
        sum += i;
        System.out.println("Numero De Ingresos: " + sum);
    }
}
