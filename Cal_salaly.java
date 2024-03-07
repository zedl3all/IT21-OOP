import java.util.*;
public class Cal_salaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        System.out.print("Please enter number of working days : ");
        double working = sc.nextDouble();
        System.out.print("Please enter number of absent days : ");
        double absent = sc.nextDouble();
        System.out.print("Please enter your body weight : ");
        double weight = sc.nextDouble();

        System.out.println("Hi, "+name);
        double salary = 0;
        if (age > 20 && age <= 30){
            salary = (working*300)-(absent*50);
        }else if (age > 30 && age <= 40){
            salary = (working*500)-(absent*50);
        }else if (age > 40 && age <= 50){
            salary = (working*1000)-(absent*25);
        }else if (age > 50 && age <= 60){
            salary = (working*3000);
        }

        System.out.println("Your salary is "+ salary +" Baht");
        if (weight >= 10 && weight <= 60){
            salary = salary + 5000;
        }else if (weight >= 61 && weight <= 90){
            salary = salary + (5000-(weight-60)*10);
        }
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
}