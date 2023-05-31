package PClases;

import java.util.Scanner;

public class Quicksort {
    public static void quickSort(int[] array, int izq, int der) {
        if (izq >= der) {
            return;
        }
        int pivote = array[(izq + der) / 2];
        int i = izq;
        int j = der;
        System.out.println("");
        System.out.println("Pivote:" + pivote);
        System.out.println(izq + "," + der);
        for (int k = 0; k < 8; k++) {
            System.out.print(array[k] + "||");
        }
        while (i <= j) {
            while (array[i] < pivote) {
                i++;
            }
            while (array[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(array, izq, j);
        quickSort(array, i, der);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}