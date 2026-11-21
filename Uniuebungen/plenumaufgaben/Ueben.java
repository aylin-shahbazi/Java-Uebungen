package plenumaufgaben;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ueben {
    Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Sechsd.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());

       try (Scanner input = new Scanner(new File("Sechsd.txt"))) {
           while (input.hasNextLine()) {
               String text = input.nextLine();
               System.out.println(text);
           }
       }
    }
}
