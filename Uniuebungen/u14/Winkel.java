package u14;

import java.util.Scanner;

public class Winkel {
    // Hauptmethode: Steuert Eingabe, Berechnung und Ausgabe
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dieses Programm errechnet die drei Winkel eines Dreiecks.");

        // Eingabe der Seitenlängen über Hilfsmethode
        double a = readDouble(scanner, "Bitte Seitenlaenge a eingeben:");
        double b = readDouble(scanner, "Bitte Seitenlaenge b eingeben:");
        double c = readDouble(scanner, "Bitte Seitenlaenge c eingeben:");

        // Berechnung der Innenwinkel über Kosinussatz-Methode
        double alpha = calculateAngle(a, b, c);
        double beta = calculateAngle(b, a, c);
        double gamma = calculateAngle(c, a, b);

        // Ausgabe der auf 1 Nachkommastelle gerundeten Winkel
        System.out.println("alpha = " + round1(alpha));
        System.out.println("beta = " + round1(beta));
        System.out.println("gamma = " + round1(gamma));

        scanner.close();

    }
    // Gibt einen Prompt aus und liest eine Fließkommazahl ein
    public static double readDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    // Berechnet den Gegenwinkel zur Seite 'gegenueber' in Grad
    public static double calculateAngle(double gegenueber, double anliegend1, double anliegend2) {
        double cosWinkel = (anliegend1 * anliegend1 + anliegend2 * anliegend2 - gegenueber * gegenueber)  / (2.0 * anliegend1 * anliegend2);
        return Math.toDegrees(Math.acos(cosWinkel));
    }
    // Rundet eine Zahl auf 1 Nachkommastelle (Exakt laut Aufgabenstellung)
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10) / 10.0;
    }
}
