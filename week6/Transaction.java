package a6_108201017;
class Transaction{
    String Name;
    int Income;
    int Pay;
    public String getname(){return Name;}
    public int getincome(){return Income;}
    public int getpay(){return Pay;}
    public Transaction(String Name,int Income,int Pay){
        this.Name = Name;
        this.Income = Income;
        this.Pay = Pay;
    }
}