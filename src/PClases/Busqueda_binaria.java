/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PClases;

public class BusquedaBinaria {
    public static int Buscar(int x, int vect[]) {
        int izquierda, derecha, cen;
        izquierda = 0;
        derecha = vect.length - 1;
        while (izquierda <= derecha) {
            cen = (izquierda + derecha) / 2;
            if (vect[cen] == x) {
                return cen;
            }
            if (x > vect[cen]) {
                izquierda = cen + 1;
            } else {
                derecha = cen - 1;
            }
        }
        return -1;
    }
}
