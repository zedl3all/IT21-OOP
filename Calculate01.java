import java.util.*;
public class Calculate01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2 = 6;
        System.out.print("Enter number: ");
        num1 = sc.nextInt();
        num1 = num1 + num2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);
        sc.close();
    }
}
