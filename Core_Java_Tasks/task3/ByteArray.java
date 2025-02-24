package pack3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\file1.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];

        fis.read(byteArray);
        fis.close();

        for (byte b : byteArray) {
            System.out.print((char) b);
        }
    }
}
