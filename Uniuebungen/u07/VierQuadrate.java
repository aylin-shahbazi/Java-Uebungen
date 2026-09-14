package u07;

/**
 * Zeichnet ein Gittermuster bestehend aus mehreren Quadranten. Die Größe wird
 * über die Klassenkonstante SIZE gesteuert.
 */
public class VierQuadrate {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        drawLine();
        for (int i = 0; i < 2; i++) {
            drawBody();
            drawLine();
        }

    }

    /**
     * Druckt die horizontale Trennlinie mit zentriertem Pluszeichen.
     */
    public static void drawLine() {
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("=");
        }
        System.out.print(" + ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    /**
     * Druckt den Innenraum der Quadrate.
     */
    public static void drawBody() {
        // Äußere Schleife steuert die Höhe (Anzahl der Zeilen)
        for (int i = 0; i < SIZE; i++) {
            System.out.print("#");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
