package pack3;

import java.io.File;
import java.util.Scanner;

public class CheckPathType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();


        File file = new File(path);


        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path is a FILE.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path is a DIRECTORY.");
            }
        } else {
            System.out.println("The specified path does NOT exist.");
        }

        scanner.close();
    }
}

