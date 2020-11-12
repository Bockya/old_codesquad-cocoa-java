public class Data {
    private int date;
    private String summary;
    private int income;
    private int expense;
    public Data(){}
    public Data(int date, String summary, int income, int expense){
        this.date = date;
        this.summary =summary;
        this.income = income;
        this.expense = expense;
    }
    public int getDate(){
        return date;
    }
    public void setDate(){
        this.date = date;
    }
    public String getSummary(){
        return summary;
    }
    public void setSummary(){
        this.summary = summary;
    }
    public int getIncome(){
        return income;
    }
    public void setIncome(){
        this.income = income;
    }
    public int getExpense(){
        return expense;
    }
    public void setExpense(){
        this.expense = expense;
    }
}
