package plenumaufgaben;

import java.util.Arrays;

public class Siebenb {
    public static void main(String[] args) {
        // Unser Array mit den Zahlen
        int[] a = { 2, 5, -1, 6, 14, -7, -9 };

        // Wir gehen das Array von vorne bis hinten durch
        for (int i = 0; i < a.length; i++) {
            // Prüfen ob die aktuelle Zahl kleiner als Null ist
            if (a[i] < 0) {
                // Wenn ja, dann überschreiben wir sie mit Null
                a[i] = 0;
            }
        }

        // Das fertige Array lesbar auf der Konsole ausgeben
        System.out.println(Arrays.toString(a));
    }
}