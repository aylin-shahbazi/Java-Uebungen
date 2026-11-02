package plenumaufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class Ueben {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = console.nextInt();
        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
