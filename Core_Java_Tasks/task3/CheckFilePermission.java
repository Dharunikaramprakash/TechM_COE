package pack3;

import java.io.File;
import java.util.Scanner;

public class CheckFilePermission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();


        File file = new File(path);


        if (file.exists()) {
            System.out.println("The specified path exists.");


            if (file.canRead()) {
                System.out.println("Read permission: YES");
            } else {
                System.out.println("Read permission: NO");
            }


            if (file.canWrite()) {
                System.out.println("Write permission: YES");
            } else {
                System.out.println("Write permission: NO");
            }
        } else {
            System.out.println("The specified file or directory does NOT exist.");
        }

        scanner.close();
    }
}
