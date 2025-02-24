package pack3;

import java.io.File;
import java.util.Scanner;

public class CheckFilesOrDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file/directory path from the user
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();

        // Create a File object
        File file = new File(path);

        // Check if the file/directory exists
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path is a FILE and it EXISTS.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path is a DIRECTORY and it EXISTS.");
            }
        } else {
            System.out.println("The specified path does NOT exist.");
        }

        scanner.close();
    }
}
