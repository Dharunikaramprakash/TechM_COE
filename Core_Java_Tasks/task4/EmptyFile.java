package pack4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmptyFile {
    public static void main(String[] args) {
        try {
            readFile("C:/f12.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, Exception {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        Scanner sc = new Scanner(f);
        if (!sc.hasNext()) {
            sc.close();
            throw new Exception("Error: The file is empty.");
        }
        System.out.println("File contains:");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}