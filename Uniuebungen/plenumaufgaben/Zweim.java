package plenumaufgaben;

public class Zweim {

    public static void main(String[] args) {
        // Äußere Schleife: Steuert die 6 Zeilen
        for (int i = 1; i <= 6; i++) {
            // Innere Schleife: Druckt 10 Sterne nebeneinander in der aktuellen Zeile
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            // Zeilenumbruch nach jeder vollständigen Zeile
            System.out.println();
        }
        for (int k = 1; k <= 6; k++) {
            for (int z = 1; z <= k; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 1; m <= 6; m++) {
            for (int p = 1; p <= m; p++) {
                System.out.print(m);
            }
            System.out.println();
        }
        Zweimiv();

    }
    public static void Zweimiv() {
        /* Schreiben Sie eine geschachtelte Schleife Ausgabe:

            1, 1
            2, 1
            3, 1
            1, 2
            2, 2
            3, 2
         */

        // Äußere Schleife: Läuft für den zweiten Wert (1 und dann 2)
        for (int i = 1; i <= 2; i++) {
            // Innere Schleife: Läuft für den ersten Wert (1, 2, 3)
            for (int j = 1; j <= 3; j++) {
                System.out.println(j + ", " + i);
            }
        }

    }

}
