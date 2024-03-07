/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author SA090164
 */
public class Account {
    public double balance;
    public String name;
    
    public void deposit(double b){
        if (b >= 0){
            balance += b;
        }else{
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }
    
    public double withdraw(double b){
        if (balance-b < 0){
            System.out.println("Your account balance is insufficient.");
            return 0;
        }else{
            if (b >= 0){
                balance -= b;
            }else{
                System.out.println("The balance variable must be greater than or equal to zero.");
            }
            return b;
        }
    }
    
    public void showInfo(){
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
    
}
