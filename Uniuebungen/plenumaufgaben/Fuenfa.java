package plenumaufgaben;

public class Fuenfa {

    public static void main(String[] args) {

        // Startwert fuer den Zaehler x festlegen
        int x = 0;

        // Indefinite Schleife: Laeuft so lange, wie der Funktionswert f(x) kleiner als 100 ist.
        // Bei jedem Durchlauf wird f(x) neu berechnet und geprüft
        while (f(x) < 100) {
            x++;

        }
        // Sobald f(x) >= 100 ist, stoppt die Schleife.
        // Hier wird das Ergebnis mit dem finalen x-Wert ausgegeben.
        System.out.println("f(" + x + ")= " + f(x));

    }

    public static double f(double x) {
        return 4.3 * x * x - 5.2 * x + 10.1;
    }
}
