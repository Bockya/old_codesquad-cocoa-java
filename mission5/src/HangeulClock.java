import java.time.LocalTime;

public class HangeulClock {
    private String[] getHanHour(int hour) {
        String[] result = new String[3];
        switch (hour) {
            case 1:
            case 13:
                String[] hanHour1 = {"한□□□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = hanHour1;
                break;
            case 2:
            case 14:
                String[] hanHour2 = {"□두□□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = hanHour2;
                break;
            case 3:
            case 15:
                String[] hanHour3 = {"□□세□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = hanHour3;
                break;
            case 4:
            case 16:
                String[] hanHour4 = {"□□□네□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = hanHour4;
                break;
            case 5:
            case 17:
                String[] hanHour5 = {"□□□□다섯",
                        "□□□□□□",
                        "□□□□□시"};
                result = hanHour5;
                break;
            case 6:
            case 18:
                String[] hanHour6 = {"□□□□□□",
                        "여섯□□□□",
                        "□□□□□시"};
                result = hanHour6;
                break;
            case 7:
            case 19:
                String[] hanHour7 = {"□□□□□□",
                        "□□일곱□□",
                        "□□□□□시"};
                result = hanHour7;
                break;
            case 8:
            case 20:
                String[] hanHour8 = {"□□□□□□",
                        "□□□□여덟",
                        "□□□□□시"};
                result = hanHour8;
                break;
            case 9:
            case 21:
                String[] hanHour9 = {"□□□□□□",
                        "□□□□□□",
                        "아홉□□□시"};
                result = hanHour9;
                break;
            case 10:
            case 22:
                String[] hanHour10 = {"□□□□□□",
                        "□□□□□□",
                        "□□열□□시"};
                result = hanHour10;
                break;
            case 11:
            case 23:
                String[] hanHour11 = {"□□□□□□",
                        "□□□□□□",
                        "□□열한□시"};
                result = hanHour11;
                break;
            case 12:
            case 24:
                String[] hanHour12 = {"□□□□□□",
                        "□□□□□□",
                        "□□열□두시"};
                result = hanHour12;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        HangeulClock hc = new HangeulClock();
        String[] hangeul = {"한두세네다섯",
                "여섯일곱여덟",
                "아홉열한두시",
                "자이삼사오십",
                "정일이삼사육",
                "오오칠팔구분"};
        LocalTime now = LocalTime.now(); //현재 시간
        int hour = now.getHour(); //현재 시간에서 시(hour)만 뽑아낸다
        int minute = now.getMinute(); //현재 시간에서 분(minute)만 뽑아낸다
        String si = hangeul[2].charAt(5) + ""; //시
        String bun = hangeul[5].charAt(5) + ""; //분
        String jajeong = hangeul[3].charAt(0) + "" + hangeul[4].charAt(0); //자정
        String jeongo = hangeul[4].charAt(0) + "" + hangeul[5].charAt(0); //정오
        String[] hanHour = {"한두세네다섯",
                "여섯일곱여덟",
                "아홉열한두시"};
        String[] hanMinute = {"자이삼사오십",
                "정일이삼사육",
                "오오칠팔구분"};
        String[] result = hc.getHanHour(hour);


        System.out.println("now: " + now);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);
        System.out.println(si);
        System.out.println(bun);
        System.out.println(jajeong);
        System.out.println(jeongo);
        for (int i = 0; i < 6; i++)
            System.out.println(hangeul[i]);
        for(int i=0;i<3;i++)
            System.out.println(result[i]);
    }
}
