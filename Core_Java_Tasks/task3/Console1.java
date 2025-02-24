package pack3;

import java.io.Console;

public class Console1 {
    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String input = console.readLine("Enter something: ");
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No console available.");
        }
    }
}