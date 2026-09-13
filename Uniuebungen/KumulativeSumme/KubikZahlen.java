package KumulativeSumme;

public class KubikZahlen {

    public static void main(String[] args) {

        int n = 5;
        int summe = 0; // Kumulative Variable

        for (int k = 1; k <= n; k++) {
            summe += k * k * k; // Addiert die jeweilige Kubikzahl zur Summe
            System.out.println("Kubikzahl von " + k + " ist: " + (k * k * k)); // Ausgabe der Kubikzahl 

        }
        System.out.println("Die Summe ist: " + summe); // Ausgabe: Summe = 225
    }

}
