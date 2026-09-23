package plenumaufgaben;

import java.util.Scanner;

public class Vierc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Wort eingeben: ");
        String s = scanner.next();

        int count = 0;
        // Schleife, die von Index 0 bis zum Ende des Strings s läuft
        for (int i = 0; i < s.length(); i++) {
            // Speichert das aktuelle Zeichen an der Position i im char c
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                // Erhöht den Zähler um 1, falls es ein Buchstabe ist
                count++;
            }
        }
        System.out.println("Buchstaben: a" + count);
    }
}
