
import java.util.*;

public class KaffeeAutomat {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Festgelete Variablen fuer Preise und eingezahlten Betraege
        double kaffeePreis = 2.50;
        double eingezahlterBetrag = 0.0;

        System.out.println("_____KaffeeAutomat_____");
        System.out.println("Ein Kaffee kostet: " + kaffeePreis + " Euro");

        // Schleife läuft so lange, bis der eingegebene Betrag den Preis deckt
        while (eingezahlterBetrag < kaffeePreis) {
            System.out.print("Bitte werfen Sie Geld ein (in Euro): ");
            double einwurf = scanner.nextDouble();
            eingezahlterBetrag += einwurf;
            System.out.println("Eingezahlter Betrag: " + eingezahlterBetrag + " Euro");

            // Überprüfung, ob noch Restgeld fehlt
            if (eingezahlterBetrag < kaffeePreis) {
                System.out.println("Noch " + (kaffeePreis - eingezahlterBetrag) + " Euro erforderlich.");
            }
        }

        double wechselgeld = eingezahlterBetrag - kaffeePreis;
        if (wechselgeld > 0) {
            System.out.println("Ihr Wechselgeld: " + wechselgeld + " Euro");
        }
        System.out.println("Bezahlung erfolgreich!");
        System.out.println("Vielen Dank! Ihr Kaffee wird zubereitet.");

        // Ressourcen nach der Nutzung wieder freigeben
        scanner.close();

    }

}
