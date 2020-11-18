package threadtest;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Thread t = new Thread(new MyThread());
        //MyThread tt = new MyThread();
        //t.setDaemon(true);
        //t.start();
        //System.out.println(tt.hour);
        while (true){
            Thread.sleep(1000);


            System.out.println(LocalTime.now());
        }
    }
}
