
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double a){
        if (a > 0){
            balance += a;
            System.out.println(a+" baht is deposited to "+name+".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a) throws WithdrawException{
        if (a > 0){
            if ((balance - a) > 0){
                balance -= a;
                System.out.println(a+" baht is withdrawn from "+name+".");
            }else if((balance - a) < 0){
                throw new WithdrawException("Account "+name+" has not enough money!");
            }
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void showAccount(){
        System.out.println(name+" account has "+balance+" baht.");
    }
}
