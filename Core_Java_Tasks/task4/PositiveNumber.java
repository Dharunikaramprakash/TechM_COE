package pack4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        try {
            readNumbersFromFile("C:/sample1.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues after exception handling.");
    }

    public static void readNumbersFromFile(String fileName) throws FileNotFoundException, Exception {
        File f1 = new File(fileName);
        Scanner sc = new Scanner(f1);
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input > 0) {
                    sc.close();
                    throw new Exception("Positive number found: " + input);
                }
                System.out.println("Read number: " + input);
            } else {
                sc.next();
            }
        }
        sc.close();
    }
}
