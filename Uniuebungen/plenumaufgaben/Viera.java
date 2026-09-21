package plenumaufgaben;

import java.util.Scanner;

public class Viera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben: ");
        int zahl = scanner.nextInt();
        System.out.print("Ihre Zahl ist ");

        if (zahl % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }
        scanner.close();

    }
}
