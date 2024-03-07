import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    
    public Account getAccount(int index){
        //ArrayList don't know what is add in
        //That why it need to casting :D
        //U can kumnod data type hai ArrayList dai use <datatype> after ArrayList
        return (Account)acct.get(index);
    }
    
    public int getNumOfAccount(){
        return acct.size();
    }
    
    public Customer(){
        this("","");
    }

    public Customer(String firstName, String lastName){
        acct = new ArrayList();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstname(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastname(){
        return lastName;
    }
    
    @Override public String toString(){
        return firstName+" "+lastName+" has "+getNumOfAccount()+" Account.";
    }
    public boolean equals(Customer c){
        return (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName));
    }
}
