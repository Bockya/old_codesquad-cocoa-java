import java.util.Scanner;
public class multiplication_table {
    private int start;
    private int end;
    private boolean getInput(){
        Scanner sc = new Scanner(System.in); //system은 클래스
        System.out.println("시작단과 끝단(1~9)을 입력하세요: "); //out: static 개체, println: 메소드
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start < 1 || end > 9 || start > end){
            System.out.println("범위는 1에서 9까지 입니다.");
            return false;
        }
        this.start=start;
        this.end=end;
        sc.close(); //마지막에 꼭 닫기
        return true;
    }
    private void print(){
        for (int j = 1; j <= 9; j++) {
            for (int i = this.start; i <= this.end; i++)
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multiplication_table mt=new multiplication_table();
        boolean valid =mt.getInput();
        while (!valid)
            valid=mt.getInput();
        mt.print();
    }
}
//주석은 짧을 수록 좋다
//Scanner sc = new Scanner("hello.txt");