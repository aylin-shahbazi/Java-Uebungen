package plenumaufgaben.u21; // Legt das Paket fest, in dem die Klasse liegt

import java.util.*; // Holt Scanner und andere Hilfsklassen aus java.util

public class Sentinel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Liest Eingaben von der Tastatur
        String ergebnis = ""; // Sammelt am Ende alle Namen in einem Text
        String name; // Speichert immer den Namen aus der aktuellen Runde

        do {
            // Fragt nach einem Namen und bleibt in derselben Zeile
            System.out.print("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");
            name = input.nextLine(); // Liest die ganze Zeile bis Enter ein

            // Nur aufnehmen, wenn die Zeile nicht leer ist
            if (!name.isEmpty()) {
                if (ergebnis.isEmpty()) {
                    // Beim ersten Namen noch kein Komma davor setzen
                    ergebnis = name;
                } else {
                    // Bei jedem weiteren Namen Komma und Leerzeichen davor hängen
                    ergebnis += ", " + name;
                }
            }
        } while (!name.isEmpty()); // Wiederholt das Ganze, bis eine leere Zeile kommt

        // Gibt alle gesammelten Namen zusammen aus
        System.out.println("Willkommen an alle: " + ergebnis);
        input.close(); // Macht den Scanner wieder zu

    }
}