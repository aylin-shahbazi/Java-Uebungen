package plenumaufgaben;

public class Zweif {


    public static void main(String args[]) {
        int number;
        number = 2 + 3 * 4;
        System.out.println(number - 1);
        // Ausgabe: 13

        number = 16 % 6;
        System.out.println(2 * number);
        // Ausgabe: 8

        double average;
        average = (11 + 8) / 2;
        System.out.println(average);
        // Gibt 9.0 aus (Int-Division: 19 / 2 = 9, danach Umwandlung in double)

        average = (5 + average * 2) / 2;
        System.out.println(average);
        // Gibt 11.5 aus (Rechnet mit 9.0 weiter: (5 + 18.0) / 2 = 11.5)

        // Für 9.5 und 12.0: Einfach durch 2.0 teilen!

    }

}
