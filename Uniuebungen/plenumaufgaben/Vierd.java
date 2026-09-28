package plenumaufgaben;

import java.util.Scanner;

/**
 * Klasse zur Berechnung der Anzahl der Teiler einer Zahl.
 */
public class Vierd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib eine Zahl ein: ");
        if (scanner.hasNextInt()) {
            int zahl = scanner.nextInt();

            int anzahlTeiler = countFactors(zahl);
            System.out.println("Die Zahl " + zahl + " hat " + anzahlTeiler + " Teiler.");
        } else {
            System.out.println("Das war keine gültige ganze Zahl!");
        }

        scanner.close();
    }

    /**
     * Berechnet die Anzahl der ganzzahligen Teiler einer gegebenen Zahl n.
     */
    public static int countFactors(int number) {
        int count = 0; // Zähler für die Teiler

        // Alle Werte von 1 bis 'number' durchgehen und auf Teilbarkeit prüfen
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Zähler um 1 erhöhen
            }
        }
        return count;
    }
}
