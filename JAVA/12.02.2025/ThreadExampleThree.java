package printex;

public class ThreadExampleThree {
    public static void main(String[] args) {
        ThreadThree thread31=new ThreadThree();
        thread31.start();
        thread31.start();
        thread31.start();
        thread31.start();
        thread31.start();
        thread31.run();
        ThreadRunnableOne1 threadrun1=new ThreadRunnableOne1();
        Thread t1=new Thread(threadrun1);
        t1.start();
        ThreadRunnableTwo threadrun2=new ThreadRunnableTwo();
        Thread t2=new Thread(threadrun2);
        t2.start();
        t2.start();

    }
}
class ThreadThree extends Thread{
    public void run(){
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
    }
}
class ThreadRunnableOne1 implements Runnable{
    public void run(){
        System.out.println("From ThreadRunnableOne!!");
        System.out.println("From ThreadRunnableOne!!");
    }
}
class ThreadRunnableTwo implements Runnable{
    public void run(){
        System.out.println("from ThreadRunnableTwo!!");
        System.out.println("from ThreadRunnableTwo!!");

    }
}