package uArray;

import java.util.Scanner;

public class Wetter {
    public static void main(String[] args) {
        // Scanner erstellen, um die Eingaben von der Konsole zu lesen
        Scanner console = new Scanner(System.in);
        System.out.print("Wie viele Tage? ");
        int tage = console.nextInt();

        // Array für die Temperaturen und die Variable für die Summe anlegen
        int[] temperaturen = new int[tage];
        int summe = 0;

        // Schleife läuft für jeden Tag durch und fragt nach der jeweiligen Temperatur
        for (int i = 0; i < tage; i++) {
            System.out.print("Hoechstemperatur am Tag " + (i + 1) + ": ");
            temperaturen[i] = console.nextInt();
            summe += temperaturen[i]; // Temperatur direkt zur Gesamtsumme addieren
        }

        // Durchschnitt berechnen
        // Das (double) ist wichtig, damit Java keine Ganzzahldivision macht
        double durschnitt = (double) summe / tage;

        // Zählen, an wie vielen Tagen die Temperatur über dem Durchschnitt lag
        int count = 0;
        for (int i = 0; i < tage; i++) {
            if (temperaturen[i] > durschnitt) {
                count++;
            }
        }

        // Ergebnisse auf der Konsole ausgeben
        System.out.println("Durschnittstemperatur: " + durschnitt);
        System.out.println("Anzahl der Tage mit Hoechsttemperatur ueber dem Durschnitt: " + count);

    }
}
