
import java.util.*;

public class EinkaufsRechner {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        double totalPreis = 0.0;
        double preis = -1; // WEG 1: Startwert, um die Schleife zu starten

        while (preis != 0) {
            System.out.print("Bitte geben Sie den Preis des Artikels ein (0 zum Beenden): ");
            preis = scanner.nextDouble();

            // if / else if wird genutgitzt, weil es 3 Fälle gibt: 
            // 1. preis > 0 (addieren), 2. preis < 0 (Fehler), 3. preis == 0 (Schleife beenden, nix tun). 
            // Ein einfaches else würde bei 0 fälschlicherweise "Ungueltiger Preis!" ausgeben.
            if (preis < 0) {
                System.out.println("Ungültiger Preis! Bitte geben Sie einen positiven Wert ein.");
            } else if (preis > 0) {
                totalPreis += preis;
            }
        }
        /* 
        // ==========================================
        // WEG 2: mit do-while-Schleife
        // (Braucht KEINEN Startwert, weil erst eingelesen und danach geprueft wird)
        // ==========================================
        
        double preis; // Kein Startwert nötig!

        do {
            System.out.print("Gib einen Preis ein (0 zum Beenden): ");
            preis = scanner.nextDouble();

            if (preis > 0) {
                total += preis;
            } else if (preis < 0) {
                System.out.println("Ungueltiger Preis!");
            }
        } while (preis != 0); 
         */
        System.out.println("Der Gesamtpreis der Artikel beträgt: " + totalPreis + " Euro");
        scanner.close();

    }
}
