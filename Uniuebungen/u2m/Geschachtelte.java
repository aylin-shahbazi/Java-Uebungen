package u2m;

public class Geschachtelte {
    public static void main(String[] args) {

        // Äußere Schleife steuert die Zeilen von i = 1 bis 5
        for (int i = 1; i <= 5; i++) {
            
            // Erste innere Schleife: Druckt die Punkte vor der Zahl
            for (int j = 1; j <= -i + 5; j++) {
                System.out.print(".");
            }
            
            // Gibt die aktuelle Zahl aus (ohne Zeilenumbruch)
            System.out.print(i);

            // Zweite innere Schleife: Druckt die Punkte nach der Zahl
            // Hier läuft j von 1 bis i - 1, damit es pro Zeile genau i-1 Punkte werden
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(".");
            }
            
            // Beendet die Zeile und springt in die nächste Zeile
            System.out.println();
        }

        /**
         * Unser Ziel:
         * ....1
         * ...2.
         * ..3..
         * .4...
         * 5....
         */
    }
}
