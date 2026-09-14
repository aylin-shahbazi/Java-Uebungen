package plenumaufgaben;

public class Dreia {

    public static void main(String[] args) {

        drawBow(10, 3);
        drawBow(5, 4);
    }

    /**
     * Druckt die angegebene Anzahl an Sternen plus Zeilenumbruch.
     */
    public static void drawLineOfStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Druckt einen Kasten aus Sternen der angegebenen Größe.
     */
    public static void drawBow(int Breite, int Hoehe) {
        drawLineOfStars(Breite);
        for (int i = 1; i <= Hoehe - 2; i++) {
            System.out.print("*");
            printSpaces(Breite - 2);
            System.out.println("*");

        }
        drawLineOfStars(Breite);
    }

    /**
     * Druckt die angegebene Anzahl an Leerzeichen.
     */
    public static void printSpaces(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }
}
