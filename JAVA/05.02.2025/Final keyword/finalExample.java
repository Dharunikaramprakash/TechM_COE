package example;
import java.util.Scanner;

final class finalExample {
    final int a=200;

      final void display(int b) {

             int c = a + b;
             System.out.println("This is a final method. Final variable value: " + c);

     }
     public static void main(String[] args){
         finalExample f1=new finalExample();
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a number to add: ");
         int b = sc.nextInt();
         f1.display(b);
     }


}
