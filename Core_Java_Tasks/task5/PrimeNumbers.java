package pack5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int threads = 4;
        PrimeSum[] ps = new PrimeSum[threads];
        int range = limit / threads;
        int start = 1;
        int end;
        long sum = 0;
        for (int i = 0; i < threads; i++) {
            end = (i == threads - 1) ? limit : start + range - 1;
            ps[i] = new PrimeSum(start, end);
            ps[i].start();
            start = end + 1;
        }
        for (PrimeSum p : ps) {
            p.join();
            sum += p.getSum();
        }
        System.out.println("Sum of all prime numbers up to " + limit + " is: " + sum);
        sc.close();
    }
}

class PrimeSum extends Thread {
    private int start, end;
    private long sum = 0;
    public PrimeSum(int start, int end) {
        this.start = start;
        this.end = end;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }
    public long getSum() {
        return sum;
    }
}

