import java.util.*;
public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double cal = Math.PI*Math.pow(radius, 2);
        System.out.println(cal);
        input.close();

    }
}
