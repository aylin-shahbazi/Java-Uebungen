package plenumaufgaben;

import java.io.*;
import java.util.Scanner;

public class Sechsf {

    public static void main(String[] args) throws FileNotFoundException {
        
        // Öffnet die Datei "Sechsf.java" im Ordner plenumaufgaben zum Lesen
        Scanner input = new Scanner(new File("plenumaufgaben/Sechsf.java"));
        
        // Erstellt (oder überschreibt) die Datei "temp.txt", in die geschrieben wird
        PrintStream output = new PrintStream(new File("temp.txt"));
        
        // Ruft die Methode auf und übergibt die Eingabe und die Ausgabe
        echoUpper(input, output);
        
        // Schließt die Ausgabedatei, damit die Daten sicher gespeichert werden
        output.close();
        
        // Schließt die Eingabedatei wieder
        input.close();
    }

    // Methode zum Einlesen, Umwandeln in Großbuchstaben und Weiterschreiben
    public static void echoUpper(Scanner input, PrintStream output) {

        // Schleife läuft, solange es noch Zeilen in der Eingabedatei gibt
        while (input.hasNextLine()) {
            // Liest die nächste Zeile, macht alles groß und schreibt es in die Ausgabedatei
            output.println(input.nextLine().toUpperCase());
        }
    }

}