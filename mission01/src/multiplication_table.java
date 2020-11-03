import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //system은 클래스
        //Scanner sc = new Scanner("hello.txt");
        System.out.println("시작단을 입력하세요: "); //out: static 개체, println: 메소드
        int start = sc.nextInt();
        System.out.println("끝단을 입력하세요: ");
        int end = sc.nextInt();
        for (int j = 1; j <= 9; j++) {
            for (int i = start; i <= end; i++)
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            System.out.println();
        }
        sc.close(); //마지막에 꼭 닫기
    }
}
//주석은 짧을 수록 좋다
