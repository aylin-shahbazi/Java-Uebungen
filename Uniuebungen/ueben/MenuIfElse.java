package ueben;

import java.util.Scanner;

public class MenuIfElse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl zwischen 1-3 ein: ");
        int zahl = console.nextInt();

        if (zahl == 1) {
            System.out.println("Spiel starten");
        } else if (zahl == 2) {
            System.out.println("Einstellungen öffnen");
        } else if (zahl == 3) {
            System.out.println("Spiel beenden");
        } else {
            System.out.println("Ungültige Eingabe");
        }

    }

}
