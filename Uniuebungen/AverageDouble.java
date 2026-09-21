
import java.util.Locale;
import java.util.Scanner;

public class AverageDouble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMANY); // Setzt das Locale auf Deutschland, um Komma als Dezimaltrennzeichen zu verwenden

        System.out.print("Bitte drei Zahlen eingeben: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double durchschnitt = (a + b + c) / 3.0;
        System.out.println("Der Durchschnitt ist " + durchschnitt);

        scanner.close();
    }
}
