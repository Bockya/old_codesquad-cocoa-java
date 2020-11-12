public class Member {
    private String name;
    private String pw;
    public Member(){}
    public Member(String name, String pw){
        this.name = name;
        this.pw = pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = name;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String Pw){
        this.pw = pw;
    }
}
