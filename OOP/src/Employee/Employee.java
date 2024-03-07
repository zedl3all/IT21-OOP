/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author SA090164
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void eat(Food f){
        setEnergy(getEnergy() + f.getEnergy());
    }
    public boolean buyFood(Seller s){
        if (s != null){
            this.eat(s.sell(this));
            return true;
        }else{
            return false;
        }
    }
    ///overload///
    public boolean equals(Employee e){
        return (this.getName().equals(e.getName()));
    }
    public boolean equals(Seller e){
        return (this.getName().equals(e.getName()));
    }
    ///overload///
    
    @Override public String toString(){
        return "My name is "+this.getName()+"."+"\n"+"I have "+this.getEnergy()+" energy left."+"\n"+"I have a balance of "+this.getWallet().getBalance()+" baht.";
    }
    
    
}
