package printex;

public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadOne t1=new ThreadOne();
        t1.start();
        t1.run();
    }
}

class ThreadOne extends Thread{
    public void run(){
        System.out.println(10/0);
        System.out.println("From Thread1!!");
        System.out.println("From Thread1!!");
        System.out.println("From Thread1!!");

    }

}