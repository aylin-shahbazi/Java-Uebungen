package uArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogramm {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner startet und öffnet die Datei "Punkte.txt" zum Einlesen
        Scanner input = new Scanner(new File("Punkte.txt"));

        // Ein Array mit 51 Plätzen für die Indizes von 0 bis 50 anlegen
        int[] counts = new int[51];

        // Solange noch Zahlen in der Datei stehen, liest der Scanner sie nacheinander aus
        while (input.hasNextInt()) {
            int punkte = input.nextInt();

            // Die gelesene Punktzahl dient direkt als Index, 
            // und der Wert an dieser Stelle im Array wird um eins erhöht
            counts[punkte]++;
        }

        // Schleife geht das Array von Anfang bis Ende durch
        for (int i = 0; i < counts.length; i++) {
            System.out.print(i + ": ");

            // Für jeden Treffer an dieser Punktzahl wird ein Sternchen gedruckt
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}