package pack5;

 class OddEven1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i +" the number is even ");
            }
            else {
                System.out.println(i+" the number is odd" );
            }
        }
    }
}
 public class OddEven {
     public static void main(String[] args) {
         OddEven1 oe=new OddEven1();
         oe.start();
         oe.start();
     }
}
