import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        if (salary > 50000){
            System.out.println((salary*10/100) + " Baht");
        }else if (salary <= 50000) {
            System.out.println((salary*5/100) + " Baht");
        }
    }
}
