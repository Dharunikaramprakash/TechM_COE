package pack3;

import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();


        File directory = new File(directoryPath);


        if (directory.exists() && directory.isDirectory()) {

            String[] filesList = directory.list();

            if (filesList != null && filesList.length > 0) {
                System.out.println("\nFiles and directories in " + directoryPath + ":");
                for (String file : filesList) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist.");
        }

        scanner.close();
    }
}
