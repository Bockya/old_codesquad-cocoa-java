import java.util.Scanner;
public class Naming_Indians {
    public Scanner sc=new Scanner(System.in);
    public void indianname(int year, int month, int day){
        String[] indianYear={"말많은","푸른","적색","조용한","웅크린","백색","지혜로운","용감한"," 날카로운","욕심많은"};
        String[] indianMonth={"늑대","태양","양","매","황소","불꽃","나무","달빛","말","돼지","하늘","바람"};
        String[] indianDay={"와(과) 함께 춤을","의 기상","은(는) 그림자 속에","없습니다","없습니다","없습니다","의 환생","의 죽음","아래에서","(을) 보라",
                "이(가) 노래하다","그림자","의 일격","에게 쫓기는 남자","의 행진","의 왕","의 유령","을 죽인자","는(은) 맨날 잠잔다","처럼",
                "의 고향","의 전사","은(는) 나의친구","의 노래","의 정령","의 파수꾼","의 악마","와(과)같은 사나이","를(을) 쓰러트린자","의 혼","은(는) 말이 없다"};
        System.out.println("당신의 이름은 "+indianYear[year]+' '+indianMonth[month]+indianDay[day]+"입니다.");
    }
    public int getyear(){
        int year=this.sc.nextInt();
        year=year%10;
        return year;
    }
    public int getmonth(){
        int month=this.sc.nextInt();
        month--;
        return month;
    }
    public int getday(){
        int day=this.sc.nextInt();
        day--;
        return day;
    }
    public static void main(String[] args) {
        Naming_Indians ni=new Naming_Indians();
        System.out.println("생년월일을 입력해 주세요>");
        int year=ni.getyear();
        int month=ni.getmonth();
        int day=ni.getday();
        ni.indianname(year,month,day);
    }
}

//string->int
//int year=Integer.parseInt(s.substring(4,6));
//pieceyear.equals("0") string 비교
//파일 입출력