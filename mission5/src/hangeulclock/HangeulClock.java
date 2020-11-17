package hangeulclock;

public class HangeulClock {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m"; //콘솔 색상 Green
    String[] hangeul = {"한두세네다섯",
            "여섯일곱여덟",
            "아홉열한두시",
            "자이삼사오십",
            "정일이삼사육",
            "오오칠팔구분"};

    public static void main(String[] args) {
        Now n = new Now();
        Checker c = new Checker(n);
        HangeulClock hc = new HangeulClock();
        System.out.println("now: " + n.now);
        System.out.println("hour: " + n.hour);
        System.out.println("minute: " + n.minute);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                char ch = hc.hangeul[i].charAt(j);
                if (c.checker[i][j]) {
                    System.out.print(ANSI_GREEN + ch + " " + ANSI_RESET);
                    continue;
                }
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}