package pack3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileLastModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();


        File file = new File(filePath);


        if (file.exists()) {

            long lastModified = file.lastModified();


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModified);

           
            System.out.println("Last Modified Date: " + formattedDate);
        } else {
            System.out.println("The specified file does NOT exist.");
        }

        scanner.close();
    }
}

