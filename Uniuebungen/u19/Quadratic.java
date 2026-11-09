package u19;

public class Quadratic {

    public static void main(String[] args) {
        // Ein paar Testläufe zur Kontrolle:
        quadratic(1, -12, 35);   // Sollte zwei Lösungen liefern (7.0 und 5.0)
        quadratic(0.2, -0.8, 0.8); // Sollte eine Lösung liefern (2.0)
        quadratic(1, 12, 37);    // Keine reelle Lösung
        quadratic(0, 4, 7);      // a muss ungleich 0 sein
    }

    /** Rundet eine gegebene Zahl auf eine Nachkommastelle. */
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10) / 10.0;
    }

    /**
     * Berechnet die Lösungen der quadratischen Gleichung a*x^2 + b*x + c = 0
     * und gibt diese formatiert auf der Konsole aus.
     */
    public static void quadratic(double a, double b, double c) {
        if (a == 0) {
            System.out.println("a muss ungleich 0 sein");
            return;
        }

        double discriminant = b * b - 4 * a * c;
        double twoA = 2 * a;

        if (discriminant < 0) {
            System.out.println("Keine reelle Lösung");
        } else if (discriminant == 0) {
            double x = -b / twoA;
            System.out.println("Lösung: " + round1(x));
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / twoA;
            double x2 = (-b - sqrtD) / twoA;
            
            System.out.println("Erste Lösung = " + round1(x1));
            System.out.println("Zweite Lösung = " + round1(x2));
        }
    }
} 
