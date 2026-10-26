package plenumaufgaben;

import java.util.Arrays;

public class Siebenc {
    public static void main(String[] args) {
        int[] intarr = { 1, 4, 6, 8, 3 };
        
        // average bekommt das Array als Eingabe und gibt das Ergebnis mit return zurück
        System.out.println(average(intarr));

        // contains bekommt Array und Zielwert als Eingabe, gibt true oder false zurück
        System.out.println(contains(intarr, 5));
        System.out.println(contains(intarr, 4));

        double[] darr = { 3.3, 4.4, 7.7, 2.2 };
        
        // roundAll ändert das Array direkt vor Ort. 
        // Deswegen dient das Array hier quasi als Ausgabeparameter (kein return nötig).
        roundAll(darr); 
        System.out.println(Arrays.toString(darr));
    }

    // Eingabeparameter: numbers (Array) und target (int)
    // Rückgabewert: boolean (true oder false)
    public static boolean contains(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Eingabeparameter: numbers (Array)
    // Rückgabewert: double (der berechnete Durchschnitt)
    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    // Eingabe- und Ausgabeparameter in einem: numbers (Array)
    // Da es ein Referenztyp ist, wird das Original-Array direkt im Speicher verändert.
    // Rückgabewert: void (weil nichts mit return zurückgeschickt wird).
    public static void roundAll(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(numbers[i]);
        }
    }
}