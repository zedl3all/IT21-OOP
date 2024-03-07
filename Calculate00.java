public class Calculate00 {

    public static void main(String[] args){
        int a = 9, b = 4, c, d;
        c = b++ * ++a; //4 10//
        d = ++b * a++; //6 10//
        System.out.println(c);
        System.out.println(d);
    }
}