package printex;

public class ThreadExample2 {
    public static void main(String[] args) {
        Threadtwo t1 = new Threadtwo();
        Thread tt1=new Thread(t1);
        tt1.start();
        Threadtwo t2=new Threadtwo();
        new Thread(t2).start();
        t1.run();
    }
}

class Threadtwo implements Runnable{
    public void run(){
        System.out.println("From thread2!!");
        System.out.println("From thread2!!");
        System.out.println("From thread2!!");
        System.out.println(10/0);

    }
}