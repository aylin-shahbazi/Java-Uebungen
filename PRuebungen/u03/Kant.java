// Aufgabe: 1000x Kant-Zitat ohne Schleifen ausgeben

public class Kant {

    public static void main(String args[]) {
        /**
         * Startet die 1000-malige Ausgabe des Zitats.
         */
        immanuelHundert();

    }

    /**
     * Gibt das Zitat einmal aus.
     */
    public static void immanuel() {

        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
    }

    /**
     * Ruft die Methode immanuel() zehnmal auf, insgesamt 10 Ausgaben.
     */

    public static void immanuelZehn() {
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
        immanuel();
    }

    /**
     * Ruft die Methode immanuelZehn() zehnmal auf, insgesamt 100 Ausgaben.
     */
    public static void immanuelHundert() {
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();
        immanuelZehn();

    }
}
