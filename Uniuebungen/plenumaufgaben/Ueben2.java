package plenumaufgaben;

import java.awt.*;
import java.util.*;
import java.util.Locale;

public class Ueben2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println(flaeche(5));
        Point p1 =new Point(2,4);
        Point p2 = new Point(4,8);
        System.out.println(p1);
        System.out.println(Math.round(p1.distance(p2)));
        
        int a = 12;
        int b = 5;
        Point q1 = new Point();
        Point q2 = new Point(a, b);
        double c = q1.distance(q2);
        double umfang = a + b + c;
        System.out.println(c);
        System.out.println(Math.round(umfang));

        String wort1 = "Apfel";
        String wort2 = "Banane";
        System.out.println(beginnMitA(wort1));
        System.out.println(beginnMitA(wort2));

        Scanner console = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        double alter = console.nextDouble();

    }
                 
    public static double flaeche(double radius) {
        return Math.round(Math.PI * radius * radius);
    }

    public static boolean beginnMitA(String wort) {
        return wort.toLowerCase().startsWith("a");
    }

} 
