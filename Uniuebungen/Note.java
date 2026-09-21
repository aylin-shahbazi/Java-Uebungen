
import java.util.*;

public class Note {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihre Note ein (1-6): ");
        int note = scanner.nextInt();

        // ----------------------------------------------------
        // 1. Version: if - else if - else
        // ----------------------------------------------------
        System.out.println("\n--- Version 1: if/else ---");
        if (note == 1) {
            System.out.println("Sehr gut");
        } else if (note == 2) {
            System.out.println("Gut");
        } else if (note == 3) {
            System.out.println("Befriedigend");
        } else if (note == 4) {
            System.out.println("Ausreichend");
        } else if (note == 5) {
            System.out.println("Mangelhaft");
        } else if (note == 6) {
            System.out.println("Ungenügend");
        } else {
            System.out.println("Ungültige Note");
        }
        // ----------------------------------------------------
        // 2. Version: Klassisches switch (mit break)
        // ----------------------------------------------------
        System.out.println("\n--- Version 2: Klassisches switch ---");
        switch (note) {
            case 1:
                System.out.println("Super gemacht!");
                break;
            case 2:
            case 3: // Mehrere cases untereinander = ODER
                System.out.println("Bestanden!");
                break;
            case 4:
            case 5:
                System.out.println("Nicht bestanden.");
                break;
            default:
                System.out.println("Ungültige Note!");
                break;
        }
        // ----------------------------------------------------
        // 3. Version: Modernes switch (Pfeil-Syntax ->)
        // ----------------------------------------------------
        System.out.println("\n--- Version 3: Modernes switch ---");
        switch (note) {
            case 1 ->
                System.out.println("Super gemacht!");
            case 2, 3 ->
                System.out.println("Bestanden!");
            case 4, 5 ->
                System.out.println("Nicht bestanden.");
            default ->
                System.out.println("Ungültige Note!");
        }

        scanner.close();
    }
}
