package plenumaufgaben;

import java.util.Scanner;

public class Ueben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();



    }
    public static int countfactors(int n) {
       int count = 0;
       for (int i = 1; i <= n; i++) {
         if (n % i == 0) {
            count++;
         }
       }
       return count;
        

    }
}

