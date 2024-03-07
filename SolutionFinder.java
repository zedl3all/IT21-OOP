public class SolutionFinder{
    public static void main(String[] args){
        Double a = 4.0;
        Double b = 8.0;
        Double c = 3.0;
        Double x1 = ((-1*b)+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
        Double x2 = ((-1*b)-(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
