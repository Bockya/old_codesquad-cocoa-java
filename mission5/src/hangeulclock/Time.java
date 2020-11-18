package hangeulclock;

import java.time.LocalTime;

public class Time {
    LocalTime now = LocalTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
}

