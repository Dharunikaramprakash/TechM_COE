package printex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String args[]) throws IOException {
        System.out.println("Folder and Files are created succesfully");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter case number case:1 create a normal file\n case:2 create a folder with 3 files\n case:3 create a folder with 4 files");
        int caseNumber = scanner.nextInt();
        scanner.nextLine();
        switch (caseNumber){
            case 1:
                File file1 = new File("D:\\file1.txt");
                file1.createNewFile();
                System.out.println("file created successfully");
                break;
            case 2:
                folderwith3files();
                System.out.println("file created successfully");
                break;
            case 3:
                folderwith4files();
                System.out.println("file created successfully");
                break;
            default:
                System.err.println("enter number from 1 to 3");


        }



    }
    static void folderwith3files()throws IOException{
        File folder = new File("D:\\folder3files");
        folder.mkdir();
        File file1 = new File(folder, "folder3file1.txt");
        File file2 = new File(folder, "folder3file2.txt");
        File file3 = new File(folder, "folder3file3.txt");
        file3.createNewFile();
        file1.createNewFile();
        file2.createNewFile();
    }
    static void folderwith4files()throws IOException{
        File folder = new File("D:\\folder4files");
        folder.mkdir();
        File file2 = new File(folder, "folder4file1.txt");
        File file1 = new File(folder, "folder4file2.txt");
        File file3 = new File(folder, "folder4file3.txt");
        file3.createNewFile();
        File file4 = new File(folder, "folder4file4.txt");
        file4.createNewFile();
        file1.createNewFile();
        file2.createNewFile();
    }
}