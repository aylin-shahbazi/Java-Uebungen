package u02;

public class Graphic {

    public static void deckel() {
        System.out.println("  _______  ");
        System.out.println(" /       \\ ");   // Backslash muss mit \\ maskiert werden
        System.out.println("/         \\");
    }

    public static void boden() {
        System.out.println("\\         /");  // Backslash muss mit \\ maskiert werden
        System.out.println(" \\_______/ ");
    }

    public static void linie() {
        System.out.println("-\"-'-\"-'-\"-"); // Anfuehrungszeichen muessen mit \" maskiert werden
    }

    // Hauptmethode: Steuert den Ablauf und ruft die Bausteine nacheinander auf
    public static void main(String[] args) {
        deckel();
        linie();
        boden();
    }
}
