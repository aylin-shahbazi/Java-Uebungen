package u04;

public class Rotation {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        // | Aufgabe:
        // | Schreiben Sie eine Folge von Anweisungen, die ein Paar
        // | zweier Koordinaten (x, y) auf das neue Paar (y, -x) abbildet.
        // | Die neuen Werte sollen wieder in den ursprünglichen Variablen
        // | x und y gespeichert werden.
        // | Gewünschte Ausgabe: 3 -2
        // | Verwenden Sie einfache Zuweisungen.
        
        int temp = x; // 1. Alten Wert von x sichern (temp = 2)
        x = y;        // 2. x bekommt neuen Wert y (x = 3)
        y = -temp;    // 3. y bekommt negierten alten x-Wert (y = -2)

        System.out.println(x + " " + y);

    }
}
