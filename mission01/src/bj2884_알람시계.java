import java.util.Scanner;
public class bj2884_알람시계 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int M=sc.nextInt();
        if(M>=45) System.out.println(H+" "+(M-45));
        if(M<45){
            M+=60;
            H--;
            if(H<0) H=23;
            System.out.println(H+" "+(M-45));
        }
    }
}
