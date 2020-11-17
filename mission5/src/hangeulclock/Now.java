package hangeulclock;

import java.time.LocalTime;

public class Now {
    LocalTime now = LocalTime.now(); //현재 시간
    int hour = now.getHour(); //현재 시간에서 시(hour)만 뽑아낸다
    int minute = now.getMinute(); //현재 시간에서 분(minute)만 뽑아낸다
}
