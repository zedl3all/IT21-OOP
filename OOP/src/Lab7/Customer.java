/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author LAB203_23
 */
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("","",null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public Customer(String firstName, String lastName){
        this(firstName,lastName,null);
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstname(){
        return firstName;
    }
    public void setLastName(String firstName){
        this.lastName = lastName;
    }
    public String getLastname(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    @Override public String toString(){
        if (acct == null){
            return firstName+" "+lastName+" doesn’t have account.";
        }else{
            return "The "+firstName+" account has "+acct.getBalance()+" baht and "+acct.getCredit()+" credits.";
        }
    }
    public boolean equals(Customer c){
        return (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName));
    }
}
