/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author SA090164
 */
public class Main {
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
}
