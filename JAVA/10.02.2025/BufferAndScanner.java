
import java.nio.Buffer;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferAndScanner {
    public static void main(String args[]) throws IOException{
        BufferReaderClass();
        BufferAndScanner bs = new BufferAndScanner();
        bs.ScannerClass();
    }

    static void BufferReaderClass() throws IOException {
        BufferedReader BufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter input data:");
        String inputData = BufferReader.readLine();
        System.out.println("The input data you have provided: " + inputData);
    }

    void ScannerClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an input as a string:");
        String Text = sc.nextLine();
        System.out.println("The input you entered as a string: " + Text);

        System.out.println("enter an input as an integer:");
        int integer = sc.nextInt();
        System.out.println("The input you entered as an integer: " + integer);

        System.out.println("enter an input as a float:");
        float fl = sc.nextFloat();
        System.out.println("The input you entered as a float: " + fl);
    }
}