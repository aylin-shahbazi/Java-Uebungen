package plenumaufgaben;

import java.util.Arrays;

public class Ueben {

    public static void main(String[] args) {
       int[] number = {1, 2, 3};
       int[] numbers = new int[10];
       numbers[0] = -1;
       System.out.println(numbers[0]);
       if (numbers[0] < 0) {
        System.out.println("Zahl ist negativ");
       }
       for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i * i; 
        System.out.print(numbers[i] + " ");
       }
       System.out.println(Arrays.toString(numbers));
    }
}
