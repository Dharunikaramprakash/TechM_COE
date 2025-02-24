package pack5;

 class SimpleThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello,java!");
    }
}
public class SimpleThread {
    public static void main(String[] args) {


        SimpleThread1 t1 = new SimpleThread1();
        t1.start();
    }
}