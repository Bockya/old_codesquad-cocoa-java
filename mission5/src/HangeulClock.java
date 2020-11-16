import java.time.LocalTime;

public class HangeulClock {
    private String[] getHanHour(int hour) {
        String[] result = new String[3];
        switch (hour) {
            case 1:
            case 13:
                String[] h1 = {"한□□□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = h1;
                break;
            case 2:
            case 14:
                String[] h2 = {"□두□□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = h2;
                break;
            case 3:
            case 15:
                String[] h3 = {"□□세□□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = h3;
                break;
            case 4:
            case 16:
                String[] h4 = {"□□□네□□",
                        "□□□□□□",
                        "□□□□□시"};
                result = h4;
                break;
            case 5:
            case 17:
                String[] h5 = {"□□□□다섯",
                        "□□□□□□",
                        "□□□□□시"};
                result = h5;
                break;
            case 6:
            case 18:
                String[] h6 = {"□□□□□□",
                        "여섯□□□□",
                        "□□□□□시"};
                result = h6;
                break;
            case 7:
            case 19:
                String[] h7 = {"□□□□□□",
                        "□□일곱□□",
                        "□□□□□시"};
                result = h7;
                break;
            case 8:
            case 20:
                String[] h8 = {"□□□□□□",
                        "□□□□여덟",
                        "□□□□□시"};
                result = h8;
                break;
            case 9:
            case 21:
                String[] h9 = {"□□□□□□",
                        "□□□□□□",
                        "아홉□□□시"};
                result = h9;
                break;
            case 10:
            case 22:
                String[] h10 = {"□□□□□□",
                        "□□□□□□",
                        "□□열□□시"};
                result = h10;
                break;
            case 11:
            case 23:
                String[] h11 = {"□□□□□□",
                        "□□□□□□",
                        "□□열한□시"};
                result = h11;
                break;
            case 12:
            case 0:
                String[] h12 = {"□□□□□□",
                        "□□□□□□",
                        "□□열□두시"};
                result = h12;
                break;
        }
        return result;
    }

    private String getHanTenMin(int minute) {
        String result = "";
        switch (minute / 10) {
            case 1:
                String tm1 = "□□□□□십";
                result = tm1;
                break;
            case 2:
                String tm2 = "□이□□□십";
                result = tm2;
                break;
            case 3:
                String tm3 = "□□삼□□십";
                result = tm3;
                break;
            case 4:
                String tm4 = "□□□사□십";
                result = tm4;
                break;
            case 5:
                String tm5 = "□□□□오십";
                result = tm5;
                break;
            default:
                String tm0 = "□□□□□□";
                result = tm0;
                break;
        }
        return result;
    }

    private String[] getHanOneMin(int minute) {
        String[] result = new String[2];
        switch (minute % 10) {
            case 1:
                String[] om1 = {"□일□□□□",
                        "□□□□□분"};
                result = om1;
                break;
            case 2:
                String[] om2 = {"□□이□□□",
                        "□□□□□분"};
                result = om2;
                break;
            case 3:
                String[] om3 = {"□□□삼□□",
                        "□□□□□분"};
                result = om3;
                break;
            case 4:
                String[] om4 = {"□□□□사□",
                        "□□□□□분"};
                result = om4;
                break;
            case 5:
                String[] om5 = {"□□□□□□",
                        "□오□□□분"};
                result = om5;
                break;
            case 6:
                String[] om6 = {"□□□□□□육",
                        "□□□□□□분"};
                result = om6;
                break;
            case 7:
                String[] om7 = {"□□□□□□",
                        "□□칠□□분"};
                result = om7;
                break;
            case 8:
                String[] om8 = {"□□□□□□",
                        "□□□팔□분"};
                result = om8;
                break;
            case 9:
                String[] om9 = {"□□□□□□",
                        "□□□□구분"};
                result = om9;
                break;
            default:
                if (minute / 10 == 0) {
                    String[] om0 = {"□□□□□□",
                            "□□□□□□"};
                    result = om0;
                } else {
                    String[] om0 = {"□□□□□□",
                            "□□□□□분"};
                    result = om0;
                }
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

        String[] hanHour = {"한두세네다섯", //한글 시간의 시
                "여섯일곱여덟",
                "아홉열한두시"};
        String hanTenMinute = "자이삼사오십"; //한글 시간의 10의 자리 분
        String[] hanOneMinute = {"정일이삼사육", //한글 시간의 1의 자리 분
                "오오칠팔구분"};
        System.out.println("now: " + now);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);
        if (hour == 0 && minute == 0) {
            String[] jajeong = {"□□□□□□",
                    "□□□□□□",
                    "□□□□□□",
                    "자□□□□□",
                    "정□□□□□",
                    "□□□□□□"};
            for (int i = 0; i < 6; i++)
                System.out.println(jajeong[i]);
        } else if (hour == 12 && minute == 0) {
            String[] jeongo = {"□□□□□□",
                    "□□□□□□",
                    "□□□□□□",
                    "□□□□□□",
                    "정□□□□□",
                    "오□□□□□"};
            for (int i = 0; i < 6; i++)
                System.out.println(jeongo[i]);
        } else {
            String[] result1 = hc.getHanHour(hour);
            String result2 = hc.getHanTenMin(minute);
            String[] result3 = hc.getHanOneMin(minute);
            for (int i = 0; i < 3; i++)
                System.out.println(result1[i]);
            System.out.println(result2);
            for (int i = 0; i < 2; i++)
                System.out.println(result3[i]);
        }
    }
}
