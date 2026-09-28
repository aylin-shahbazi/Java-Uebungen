package plenumaufgaben;

import java.util.Random; // Random-Klasse aus java.util importieren

public class Vierf {

    public static void main(String[] args) {
        // Zufallsgenerator-Objekt erzeugen
        Random rand = new Random();

        // Zufallszahl zwischen 0 und 100 (inklusive)
        int random1 = rand.nextInt(101);
        System.out.println("Zahl zwischen 0 und 100: " + random1);

        // Zufallszahl zwischen 1 und 100 (inklusive)
        int random2 = rand.nextInt(100) + 1;
        System.out.println("Zahl zwischen 1 und 100: " + random2);

        // Zufallszahl zwischen 4 und 17 (inklusive)
        int random3 = rand.nextInt(14) + 4;
        System.out.println("Zahl zwischen 4 und 17: " + random3);

    }
}
