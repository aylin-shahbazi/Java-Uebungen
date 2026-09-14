package plenumaufgaben;

/**
 * Dieses Programm berechnet die Fläche eines Kreises anhand seines Radius und
 * gibt das Ergebnis auf der Konsole aus.
 */
public class Dreib {

    public static void main(String[] args) {
        double ergebnis = flaeche(5);
        System.out.println("Die Fläche des Kreises beträgt: " + ergebnis);

    }

    public static double flaeche(double radius) {
        // Flächenformel: A = PI * r^2
        double flaeche = Math.PI * radius * radius;
        return flaeche;
    }
}
