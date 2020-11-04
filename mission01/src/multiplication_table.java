import java.util.Scanner;
public class multiplication_table {
    public int start;
    public int end;
    public void init(){
        Scanner sc = new Scanner(System.in); //system은 클래스
        System.out.println("시작단을 입력하세요: "); //out: static 개체, println: 메소드
        this.start = sc.nextInt();
        System.out.println("끝단을 입력하세요: ");
        this.end = sc.nextInt();
        sc.close(); //마지막에 꼭 닫기
    }
    public void print(){
        for (int j = 1; j <= 9; j++) {
            for (int i = this.start; i <= this.end; i++)
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multiplication_table mt=new multiplication_table();
        mt.init();
        mt.print();
    }
}
//주석은 짧을 수록 좋다
//Scanner sc = new Scanner("hello.txt");