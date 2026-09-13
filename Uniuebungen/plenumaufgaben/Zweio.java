package plenumaufgaben;

public class Zweio {

    /* Zahnpfahlproblem: Ausgabe ist 2.0, 4.0, 8.0, 16.0,
     double product = 1.0;
        for (int i = 1; i <= EXPONENT; i++) {
            product *= FACTOR;
            System.out.print(product + ", ");
        }
        System.out.println();
    }
     */
    public static final double FACTOR = 2.0;
    public static final int EXPONENT = 4;

    public static void main(String[] args) {
        // Startwert direkt auf den Faktor setzen oder vorher multiplizieren
        double product = FACTOR;

        // Konstantenwert als ersten Zaunpfahl ausgeben
        System.out.print(product);

        // Restliche Durchläufe mit Komma davor
        for (int i = 2; i <= EXPONENT; i++) {
            product *= FACTOR;
            System.out.print(", " + product);
        }
        System.out.println();
    }
}
