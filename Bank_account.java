import java.util.*;

public class Bank_account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Input your accout type(Please type A B C or X in uppercase) : ");
        char accout = sc.nextLine().charAt(0);
        if (accout == 'A' || accout == 'C'){
            double balance = salary+(salary*1.5/100);
            System.out.println("Your total money in one year = "+balance);
        }else if (accout == 'B'){
            double balance = salary+(salary*2.0/100);
            System.out.println("Your total money in one year = "+balance);
        }else if (accout == 'X'){
            double balance = salary+(salary*5.0/100);
            System.out.println("Your total money in one year = "+balance);
        }else{
            System.out.println("Please type A B C or X in uppercase!!!!!!");
        }
    }
}
