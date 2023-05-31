package PClases;

public class MezclaDirecta {
    static void intercalar(int i, int m, int j, int a[]) {
        int[] b = new int[a.length]; 
        int p = i, q = m + 1, r = i;
        while (p <= m && q <= j) {
            if (a[p] <= a[q]) {
                b[r++] = a[p++];
            } else {
                b[r++] = a[q++];
            }
        }
        while (p <= m) {
            b[r++] = a[p++];
        }
        for (p = i; p < r; p++) {
            a[p] = b[p];
        }
    } 
    
    static void mezclar(int i, int j, int a[]) {
        MezclaDirecta intercala = new MezclaDirecta();
        if (i < j) {
            int m = i + (j - i) / 2;
            mezclar(i, m, a);
            mezclar(m + 1, j, a);
            intercala.intercalar(i, m, j, a);
        }
    }
}
