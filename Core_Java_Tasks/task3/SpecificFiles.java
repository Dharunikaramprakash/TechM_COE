package pack3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class SpecificFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();


        System.out.print("Enter the file extension (e.g., txt, pdf, java): ");
        String extension = scanner.nextLine();


        File directory = new File(directoryPath);


        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path. Please enter a valid directory.");
            return;
        }


        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith("." + extension.toLowerCase());
            }
        };


        File[] files = directory.listFiles(filter);

        // Print the filtered files
        if (files != null && files.length > 0) {
            System.out.println("\nFiles with ." + extension + " extension in " + directoryPath + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files with ." + extension + " extension found in the directory.");
        }

        scanner.close();
    }
}

