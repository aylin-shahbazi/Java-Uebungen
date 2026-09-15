package u11;

import java.awt.*;

/**
 * Skaliert einen Point mittels Zeiger-Semantik.
 */
public class Scale {

    public static void main(String[] args) {

        Point p = new Point(4, 3);
        int faktor = 2;

        skaliere(p, faktor);   // Übergibt die Speicheradresse von p
        System.out.println(p.x + ", " + p.y);
    }

    /**
     * Verändert das Point-Objekt direkt an seiner Speicheradresse.
     */
    public static void skaliere(Point p, int faktor) {
        p.x = p.x * faktor;
        p.y = p.y * faktor;

    }
}
