package threadtest;

import java.time.LocalTime;

public class MyThread implements Runnable {
    int hour;
    public void run() {
        while (true) {
            LocalTime now = LocalTime.now(); //현재 시간
            this.hour = now.getHour();
            try {
                Thread.sleep(1000); //1초 마다
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("now:" + now);
        }
    }
}
