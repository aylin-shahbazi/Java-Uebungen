
import java.util.Scanner;

public class NotenRechner {

    public static void main(String args[]) {
        // Scanner Werkzeug bauen, um Tastatur zu lesen
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib deine Punktzahl ein (0-100): ");
        // Stoppt das Programm und wartet auf eine Zahl vom Nutzer
        int punkte = scanner.nextInt();

        //Pruefen, ob die Zahl zwischen 0 und 100 ist
        if (punkte < 0 || punkte > 100) {
            System.out.println("Fehler: Ungueltige Punktzahl! -112");
        } else {
            if (punkte >= 50) {
                System.out.println("Status: Bestanden!");
            } else {
                System.out.println("Status: Nicht Bestanden!");
            }

            //Note ausrechnen und ausgeben
            String note = berechneNote(punkte);
            System.out.println("Deine Note: " + note);
        }

        //Tastatur stream wieder zumachen
        scanner.close();
    }

    // Methode: Kriegt Punkte und gibt Note als String zurueck 
    public static String berechneNote(int punkte) {
        if (punkte >= 90) {
            return "1.0";
        } else if (punkte >= 80) {
            return "2.0";
        } else if (punkte >= 70) {
            return "3.0";
        } else if (punkte >= 60) {
            return "4.0";
        } else {
            return "5.0";
        }

    }

}
