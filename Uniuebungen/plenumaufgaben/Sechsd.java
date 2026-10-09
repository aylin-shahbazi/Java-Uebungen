package plenumaufgaben;

import java.io.*;
import java.util.*;

public class Sechsd {

    // main-Methode: throws FileNotFoundException wird gebraucht, falls die Datei "Sechsd.txt" nicht existiert
    public static void main(String[] args) throws FileNotFoundException {

        // Erstellt ein Scanner-Objekt, das die Textdatei "Sechsd.txt" einliest
        Scanner input = new Scanner(new File("Sechsd.txt"));
        // Die Schleife läuft so lange, wie es noch eine ungelesene Zeile in der Datei gibt
        while (input.hasNextLine()) {
            // Liest die nächste komplette Zeile aus der Datei
            String line = input.nextLine();
            // Gibt die gelesene Zeile mit einem Pfeil davor auf der Konsole aus
            System.out.println("> " + line);
        }
        // Schließt den Scanner und gibt die Datei-Ressource wieder frei
        input.close();
    }
}
