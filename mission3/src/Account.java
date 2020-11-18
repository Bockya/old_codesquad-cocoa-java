import java.util.Scanner;
import java.util.ArrayList;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> list1 = new ArrayList<Member>(2);
        ArrayList<Data> list2 = new ArrayList<Data>(4);
        String name, pw, summery;
        int date, income, expense;
        int cnt = 0;
        while (true) {
            System.out.println("1.입력 2.삭제 3.수정 4.출력 5.종료");
            int chc = sc.nextInt();
            switch (chc) {
                case 1: //데이터 입력
                    System.out.println("이름과 비밀번호를 입력하세요: ");
                    name = sc.next();
                    pw = sc.next();
                    list1.add(new Member(name, pw));
                    System.out.println("날짜(yyyymmdd), 적요, 수입, 지출을 입력하세요: ");
                    date = sc.nextInt();
                    summery = sc.next();
                    income = sc.nextInt();
                    expense = sc.nextInt();
                    list2.add(new Data(date, summery, income, expense));
                    cnt++;
                    break;
                case 4: //출력
                    System.out.println("이름과 비밀번호를 입력하세요: ");
                    name = sc.next();
                    pw = sc.next();
                    for (int i = 0; i < list1.size(); i++) {
                        if (name.equals(list1.get(i).getName()) && pw.equals(list1.get(i).getPw())) {
                            System.out.print("날짜: " + list2.get(i).getDate() + " 적요: " + list2.get(i).getSummary() +
                                    " 수입: " + list2.get(i).getIncome() + " 지출: " + list2.get(i).getExpense() +
                                    " 잔액: " + (list2.get(i).getIncome() - list2.get(i).getExpense()));
                            System.out.println();
                        } else {
                            System.out.println("다시 입력하세요.");
                        }
                    }
                    if (cnt == 0) System.out.println("데이터가 없습니다.");
                    break;
                default:
                    System.out.println("종료하겠습니다.");
                    return;
            }
        }
    }
}
//Integer.pasredInt()
//은닉성