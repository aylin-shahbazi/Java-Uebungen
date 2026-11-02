package ueben;

import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl zwischen 1-3 ein: ");
        int zahl = console.nextInt();

        switch (zahl) {
            case 1:
                System.out.println("Spiel starten");
                break;
            case 2:
                System.out.println("Einstellungen öffnen");
                break;
            case 3:
                System.out.println("Spiel beenden");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }

    }

}
