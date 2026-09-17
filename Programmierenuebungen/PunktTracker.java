
import java.awt.Point;
import java.util.Scanner;

/**
 * Übung zur Wiederholung von Scanner, Schleifen, Casting und Zeiger-Semantik.
 */
public class PunktTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Punkte möchten Sie eingeben?");
        int anzahlPunkte = scanner.nextInt();
        // FOR-SCHLEIFE: Verarbeitet die gewünschte Anzahl an Punkten
        for (int i = 1; i <= anzahlPunkte; i++) {
            System.out.println("\n--- Punkt " + i + " ---");

            System.out.print("X-Koordinate (int) : ");
            int x = scanner.nextInt();

            System.out.print("Y-Koordinate (int) : ");
            int y = scanner.nextInt();

            Point p = new Point(x, y);
            // TYPUMWANDLUNG (Casting): int zu double für präzise Division
            double xHalbiert = (double) p.x / 2.0;
            System.out.println("Die X-Koordinate halbiert beträgt: " + xHalbiert);
            // METHODENAUFRUF (Zeiger-Semantik): Verschiebt das Objekt direkt im Speicher
            verschiebe(p, 2, 5);
            // Das veränderte Objekt p anzeigen
            System.out.println("Der Punkt nach der Verschiebung ist: (" + p.x + ", " + p.y + ")");

        }
        scanner.close();

    }

    public static void verschiebe(Point p, int dx, int dy) {
        p.x += dx;
        p.y += dy;
    }
}
